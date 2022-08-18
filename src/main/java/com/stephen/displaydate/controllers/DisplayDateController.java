package com.stephen.displaydate.controllers;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model date) {
		Date currentDate = new Date();
		SimpleDateFormat DateFor = new SimpleDateFormat("E, dd MMM yyyy ");
		String stringDate = DateFor.format(currentDate);
		
		date.addAttribute("date", stringDate);
		return "date.jsp";
		
	}
	
	@RequestMapping("/time")
	public String time(Model time) {
		Date currentTime = new Date();
		SimpleDateFormat TimeFor = new SimpleDateFormat("HH:mm:ss");
		String stringTime = TimeFor.format(currentTime);
		
		time.addAttribute("time", stringTime);
		return "time.jsp";
	}
}
