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
import tech.istrategies.model.Orders;
import tech.istrategies.respository.OfficeRepository;
import tech.istrategies.respository.OrderRepository;

@Controller
@RequestMapping(path = "/order")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;

	@GetMapping(path = "/")
	@ResponseBody
	public List<Orders> getAll() {
		return orderRepository.findAll();
	}

	@PostMapping(path = "/")
	public Orders create(@RequestBody Orders request) {
		return orderRepository.save(request);
	}

	@PutMapping("/")
	public Orders update(@RequestBody Orders request) {
		return orderRepository.save(request);
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Orders> findOne(@PathVariable("id") int id) {
		return orderRepository.findById(id);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		orderRepository.deleteById(id);
	}

}
