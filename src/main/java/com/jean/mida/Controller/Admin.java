package com.jean.mida.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jean.mida.Entity.User;
import com.jean.mida.Service.UserService;

@Controller
public class Admin {
	
	@RequestMapping("/login")
	public String Login() {
		return "login"; 
	}
	
	
	@Autowired
	private UserService userSer;
	
	
	@RequestMapping("/Register")
	public String Register() {
		return "Register";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute User user,BindingResult bindingResult,HttpServletRequest request) {
		
		userSer.saveMyUser(user);
		
		return "login";
	}
	
	@RequestMapping("/Admin")
	public String ShowAdmin(HttpServletRequest request) {
		return "Admin";
	}
	
	@RequestMapping("/LogUser")
	public String LogUser(@ModelAttribute("Admin") User user,HttpServletRequest request) {
		if(userSer.findByNomAndPassword(user.getNom(),user.getPassword())!=null) {
			return"Admin";
		}
		else {
			request.setAttribute("error","mot de passe ou Nom invalide");
		      return"user pas trouver";
		}
		
	}
	

}
