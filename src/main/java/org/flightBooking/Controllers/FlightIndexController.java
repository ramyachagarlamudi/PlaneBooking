package org.flightBooking.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FlightIndexController {

    @GetMapping("/")
    public String search()
    {
        return "index";
    }



}
