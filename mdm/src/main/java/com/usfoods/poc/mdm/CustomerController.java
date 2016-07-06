package com.usfoods.poc.mdm;
import static spark.Spark.*;
import com.usfoods.poc.mdm.CustomerService;

public class CustomerController {
	
	CustomerController(){
		
		CustomerService customerService = new CustomerService();
		get("/getCustomer", (req, res) -> { return customerService.getCustomer();});
		put("/saveCustomer", (req, res) -> {			
			return customerService.saveCustomer();});
	}
}
