package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private ITaskService taskService;
	
	@Autowired
	private WeatherService weatherService;
	
	private static Map<Integer, Customer> customers = new HashMap<>(); 

	@PostMapping("/task")
	public void addTasks(@RequestBody Task task) {
		taskService.addTask(task);
	}
	
	@GetMapping("/task")
	public List<Task> getTasks() {
		return taskService.getTask();
	}
 
     
     
    @PostMapping("/customer")  
    public String addCustomer(@RequestBody Customer customer) { 
        customers.put(customer.getId(), customer); 
        return ""; 
    }   
     
    @GetMapping("/customer")  
    public List<Customer> getCustomers() { 
        return new ArrayList<Customer>(customers.values()); 
    }    
    
    @GetMapping("/accu")
	public String getClima() {
		return weatherService.getWeather();
	}
     
}
