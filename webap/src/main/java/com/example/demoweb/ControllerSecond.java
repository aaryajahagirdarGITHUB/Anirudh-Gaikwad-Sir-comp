package com.example.demoweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerSecond {
	
    @RequestMapping("/")
    public String adminLogin()
   {
System.out.print("hello Controller 2");
       return "loginviews/welcome";
   } 
    
}//end class
