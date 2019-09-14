package org.flightBooking.Controllers;

import org.flightBooking.Models.Passenger;
import org.flightBooking.Services.AvailableFlights;
import org.flightBooking.Services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

@Controller
public class FlightSearchController {

    @Autowired
     private Service service;

    @GetMapping("/selectflight")
    public String selectflight(HttpSession session, ModelMap map, @RequestParam(required = true) int sched_id, String flightName, String selectedClass, double price, int passenger)
    {
        AvailableFlights selectedflight = service.selectedFlight(sched_id,flightName,selectedClass,price,passenger);
        session.setAttribute("flight",selectedflight);
        map.addAttribute("flight",selectedflight);
        map.addAttribute("source",  session.getAttribute("source"));
        map.addAttribute("destination",  session.getAttribute("destination"));
        return "selectflight";
    }
    @GetMapping("/confirmflight")
    public String confirmflight(HttpSession session, ModelMap map, String fullName,String email,String mobileNumber,String address )
    {
        map.addAttribute("flight", session.getAttribute("flight"));
        session.setAttribute("fullName",fullName);
        session.setAttribute("address",address);
        session.setAttribute("email",email);
        session.setAttribute("mobileNumber",mobileNumber);
        map.addAttribute( "fullName",fullName);
        map.addAttribute( "address",address);
        map.addAttribute("email",email);
        map.addAttribute("mobileNumber",mobileNumber);
        return "confirmflight";
    }
    @GetMapping("/submitReservation")
    public ModelAndView submitReservation(HttpSession session){
        service.addBooking(session.getAttribute("fullName"),session.getAttribute("email"),session.getAttribute("mobileNumber"),session.getAttribute("address"));
        Passenger passenger = service.getPassengerId(session.getAttribute("fullName"),session.getAttribute("email"));
        AvailableFlights bookedflight = (AvailableFlights) session.getAttribute("flight");
        int reservation_id = service.addReservation(passenger.getPassengerId(),bookedflight.getSched_id(), passenger.getFullName(), bookedflight.getFlightName(),session.getAttribute("source").toString(),session.getAttribute("destination").toString(),bookedflight.getDepartureTime(), bookedflight.getArrivalTime(),bookedflight.getDepartureDate(),bookedflight.getPrice(),bookedflight.getSelectedClass());
        ModelAndView modelAndView = new ModelAndView("submitreservation");
        modelAndView.addObject("reservation",service.getReservation(reservation_id));
        return modelAndView;
    }

    @GetMapping("/showreservation")
    public ModelAndView showReservation(@ModelAttribute Passenger passenger)    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("passenger", passenger);
        return modelAndView;
    }

    @RequestMapping("/search")
    public String search(HttpSession session, ModelMap map, @RequestParam(required = true) String source, @RequestParam(required = true) String destination, @RequestParam(required = false, defaultValue = "1") int noOfPassengers, @RequestParam(required = false, defaultValue = "2019-08-21") String flyDate, @RequestParam(required = true) String selectedClass) {
        ArrayList<AvailableFlights> flights = service.searchFlight(source, destination, noOfPassengers, flyDate, selectedClass);
        map.addAttribute("flightslist", flights);
        session.setAttribute("source",source);
        session.setAttribute("destination",destination);
        return "searchflights";
    }
}
