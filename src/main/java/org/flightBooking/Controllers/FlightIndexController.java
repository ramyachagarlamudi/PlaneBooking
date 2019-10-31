package org.flightBooking.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FlightIndexController {

    @GetMapping("/")
    public String home()
    {
        return "home";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }


}
