package com.bachir.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//Need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//Need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// add a new controller to read form data and add data to the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from HTML form
		String first_name = request.getParameter("firstName");
		
		String last_name = request.getParameter("lastName");
		
		//convert the data to all caps
		first_name = first_name.toUpperCase();
		last_name = last_name.toUpperCase();
		
		//create the message
		String result =  "Yo! "+first_name+" "+last_name;
		
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}

}
