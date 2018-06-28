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

import tech.istrategies.model.Employees;
import tech.istrategies.model.Offices;
import tech.istrategies.respository.EmployeeRepository;
import tech.istrategies.respository.OfficeRepository;

@Controller
@RequestMapping(path = "/offices")
public class OfficeController {
	
	
	@Autowired
	private OfficeRepository officeRepository;

	@GetMapping(path = "/")
	@ResponseBody
	public List<Offices> getAll() {
		return officeRepository.findAll();
	}

	@PostMapping(path = "/")
	public Offices create(@RequestBody Offices request) {
		return officeRepository.save(request);
	}

	@PutMapping("/")
	public Offices update(@RequestBody Offices request) {
		return officeRepository.save(request);
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Offices> findOne(@PathVariable("id") int id) {
		return officeRepository.findById(id);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		officeRepository.deleteById(id);
	}


}
