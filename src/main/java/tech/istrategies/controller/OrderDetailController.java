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

import tech.istrategies.model.Offices;
import tech.istrategies.model.OrderDetails;
import tech.istrategies.respository.OfficeRepository;
import tech.istrategies.respository.OrderDetailsRepository;

@Controller
@RequestMapping(path = "/orderdetails")
public class OrderDetailController {

	@Autowired
	private OrderDetailsRepository orderDetailsRepository;

	@GetMapping(path = "/")
	@ResponseBody
	public List<OrderDetails> getAll() {
		return orderDetailsRepository.findAll();
	}

	@PostMapping(path = "/")
	public OrderDetails create(@RequestBody OrderDetails request) {
		return orderDetailsRepository.save(request);
	}

	@PutMapping("/")
	public OrderDetails update(@RequestBody OrderDetails request) {
		return orderDetailsRepository.save(request);
	}

	@GetMapping(path = { "/{id}" })
	public Optional<OrderDetails> findOne(@PathVariable("id") int id) {
		return orderDetailsRepository.findById(id);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		orderDetailsRepository.deleteById(id);
	}

}
