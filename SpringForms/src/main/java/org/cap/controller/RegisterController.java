package org.cap.controller;

import javax.validation.Valid;

import org.cap.model.Register;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

	
	
	//@RequestMapping(value="/registerForm",method=RequestMethod.POST)
	@PostMapping("/registerForm")
	public String registerForm(@Valid @ModelAttribute("register") Register register,BindingResult result)
	{
		System.out.println(register);
	        if( result.hasErrors())
           return "register";

			return "success";
		
		
		
		
	}
}

