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

import tech.istrategies.model.Customers;
import tech.istrategies.model.Employees;
import tech.istrategies.respository.CustomerRepository;
import tech.istrategies.respository.EmployeeRepository;

@Controller
@RequestMapping(path = "/employees")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping(path = "/")
	@ResponseBody
	public List<Employees> getAll() {
		return employeeRepository.findAll();
	}

	@PostMapping(path = "/")
	public Employees create(@RequestBody Employees request) {
		return employeeRepository.save(request);
	}

	@PutMapping("/")
	public Employees update(@RequestBody Employees request) {
		return employeeRepository.save(request);
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Employees> findOne(@PathVariable("id") int id) {
		return employeeRepository.findById(id);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		employeeRepository.deleteById(id);
	}

}
