package org.cap.controller;

import org.cap.model.LoginPojo;
import org.cap.model.Register;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
		
		@RequestMapping("/")
		public ModelAndView getIndexPage() {
				
			return new ModelAndView("Login", "login", new LoginPojo());
		}
		
		@RequestMapping("/validateLogin")
		public String validateLogin(ModelMap map,
				@ModelAttribute("login") LoginPojo loginPojo) {
			if(loginPojo.getUserName().equals("tom") && loginPojo.getPassword().equals("123")) {
				map.addAttribute("register", new Register());
					return "register";
			}
			
				
			return "redirect:/"; 
				
		} 
		 

}
