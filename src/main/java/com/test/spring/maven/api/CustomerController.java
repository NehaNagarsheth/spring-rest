package com.test.spring.maven.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.spring.maven.api.vo.Customer;

@RestController
public class CustomerController {

	
	@PostMapping("/home")
	public @ResponseBody Customer getCustomers(@RequestBody Customer c){
		c.setId(3424);
		return c;
	}
	
	

	@PostMapping(value="/home2",consumes ={ "application/xml","application/xml;charset=UTF-8"}, produces = "application/xml" )
	public @ResponseBody Customer getCustomers2(@RequestBody Customer customer){
		customer.setId(11111);
		return customer;
	}
	
//consumes ={ "application/xml","application/xml;charset=UTF-8"},
	@GetMapping(value="/home2", produces = "application/xml" )
	public @ResponseBody Customer getCustomers2(){
		 Customer customer= new  Customer();
		customer.setId(11111);
		return customer;
	}
}
