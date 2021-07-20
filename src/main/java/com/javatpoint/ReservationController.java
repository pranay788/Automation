package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ReservationController {
	public String bookingForm(Model model)
{
	Reservation res=new Reservation();
	model.addAttribute("reservation", res);
	return "reservation-page";
}
public String submitForm(@ModelAttribute("reservation") Reservation res)
{
	return "confirmation-form";
}
}
