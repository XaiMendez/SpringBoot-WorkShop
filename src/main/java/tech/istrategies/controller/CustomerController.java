package tech.istrategies.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tech.istrategies.model.Customers;

import tech.istrategies.respository.*;

@Controller
@RequestMapping(path = "/customers")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@GetMapping(path = "/")
	@ResponseBody
	public List<Customers> getAll() {
		return customerRepository.findAll();
	}

	@PostMapping(path = "/")
	@ResponseBody
	public Customers create(@RequestBody Customers request) {
		return customerRepository.save(request);
	}

	@PutMapping("/")
	@ResponseBody
	public Customers update(@RequestBody Customers request) {
		return customerRepository.save(request);
	}

	@GetMapping(path = { "/{id}" })
	@ResponseBody
	public Optional<Customers> findById(@PathVariable("id") int id) {
		System.out.println("findById()");
		return customerRepository.findById(id);
	}

	@DeleteMapping(path = { "/{id}" })
	@ResponseBody
	public void delete(@PathVariable("id") int id) {
		customerRepository.deleteById(id);
	}

}
