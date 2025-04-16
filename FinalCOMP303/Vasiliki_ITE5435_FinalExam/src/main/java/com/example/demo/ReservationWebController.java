package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservationWebController {

	@GetMapping("/reservation")
    public String showForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservationForm"; 
    }
}
