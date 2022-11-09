package ecomerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ecomerce.DTO.OrderRequest;
import ecomerce.entity.Customer;
import ecomerce.repository.CustomerRepository;
import ecomerce.repository.ProductRepository;



@RestController
public class OrderController {
	  @Autowired
	    private CustomerRepository customerRepo;
	    
	    
	    @Autowired
	    private ProductRepository productRepo;

	    
	    @PostMapping("/placeorders")
	    public Customer placeOrder(@RequestBody OrderRequest request){
	       return customerRepo.save(request.getCustomer());
	    }
	    
	    @GetMapping("/findAllOrders")
	    public List<Customer>findAllOrders(){
	    	return customerRepo.findAll();
	    }
}
