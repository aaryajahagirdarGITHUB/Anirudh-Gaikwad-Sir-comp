
package com.example.demoweb;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerThired {
	
    @RequestMapping("/studentportal")
     public String adminDashboard()
    {
System.out.print("hello Controller 1");
        return "studentviews/studentportal";

    }
   
    
} //end class
