package gn.traore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import gn.traore.CustomerDAO;
import gn.traore.model.Customer;

@Controller
public class MainController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@GetMapping(path = "/")
	public String index() {
	    return "external";
	}
	     
	@GetMapping(path = "/customers")
	public String customers(Model model) {
	    addCustomers();
	    model.addAttribute("customers", customerDAO.findAll());
	    return "customers";
	}

	private void addCustomers() {
		List<Customer> customers = List.of(
				new Customer("TRAORE", "FASS CASIER", "Excellent"),
				new Customer("DIARRA", "LIBERTE 6", "Moyen"),
				new Customer("DIENE", "FASS MBAO", "Mauvais")
			);
		customerDAO.saveAll(customers);		
	}

}
