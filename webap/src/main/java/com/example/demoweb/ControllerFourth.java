package com.example.demoweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerFourth {
	
    @RequestMapping("/forgot")
    public String adminLogin()
   {
System.out.print("hello Controller 2");
       return "forgtpasswordviews/forgotpasswd";
   } 
    
}//end class
