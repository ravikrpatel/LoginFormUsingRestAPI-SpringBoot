package com.Loginform.Controller;

import ch.qos.logback.core.model.Model;
import com.Loginform.EntityModel.Registerationformdata;
import com.Loginform.Repository.RegisterationRepository;
import com.Loginform.Services.ServicesClass;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Maincontroller {

	@Autowired
	private RegisterationRepository registerationRepository;
	@Autowired
	private ServicesClass servicesClass;
	
	
	@RequestMapping("/loginpage")
	public String loginpage() {

		return "loginpage";
	}
	@RequestMapping(value = "loginpage", method = RequestMethod.POST)
	public String loginpagepost() {

		return "";
	}

	@RequestMapping("/Register")
	public String Registeration() {

		return "Registerationpage";
	}

	@RequestMapping(value = "Register", method= RequestMethod.POST)
	public String Registerationpost(@Valid @ModelAttribute Registerationformdata registerformdata) {
		 servicesClass.saveuserdata(registerformdata);
		return "Successpage";

	}
	
	
	}
	


