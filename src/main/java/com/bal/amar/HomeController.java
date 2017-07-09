package com.bal.amar;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.runner.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bal.amar.customer.Customer;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 */
	
	@RequestMapping(method = RequestMethod.GET)
	public String initForm(Model model){
	        Customer customer = new Customer();
	        model.addAttribute("customer", customer);
	        return "login";
	    }

	
	
	@RequestMapping(method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")Customer customer, 
	   ModelMap model) {
	    
		
		String returnString = "test";
		
		String name = customer.getName().toString();
		String pass = customer.getPassword().toString();
		
		logger.info("Welcome home! The client locale is {} {}.", pass, name );
		
		//if( name == "tanim" && pass == "tanim")
		{
			model.addAttribute("name", customer.getName());
			model.addAttribute("password", customer.getPassword());
		    returnString = "test";
		}
//		else
//		{
//		    model.addAttribute("wrong", "Wrong User name or Password " + " Input User Name: " + customer.getName() 
//		    + " Input password: " + customer.getPassword());
//		    returnString = "login";
//		}
	    return returnString;
	   }
	
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
