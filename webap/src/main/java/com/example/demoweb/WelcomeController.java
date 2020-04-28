package com.example.demoweb;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
    @RequestMapping("/adminportal")
     public String adminDashboard()
    {
System.out.print("hello Controller 1");
        return "adminviews/adminportal";

    }
   
    
} //end class
