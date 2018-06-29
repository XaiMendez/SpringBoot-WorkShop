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

import tech.istrategies.model.OrderDetails;
import tech.istrategies.model.Payments;
import tech.istrategies.respository.OrderDetailsRepository;
import tech.istrategies.respository.PaymentRepository;

@Controller
@RequestMapping(path = "/payment")
public class PaymentController {

	@Autowired
	private PaymentRepository paymentRepository;

	@GetMapping(path = "/")
	@ResponseBody
	public List<Payments> getAll() {
		return paymentRepository.findAll();
	}

	@PostMapping(path = "/")
	public Payments create(@RequestBody Payments request) {
		return paymentRepository.save(request);
	}

	@PutMapping("/")
	public Payments update(@RequestBody Payments request) {
		return paymentRepository.save(request);
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Payments> findOne(@PathVariable("id") int id) {
		return paymentRepository.findById(id);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		paymentRepository.deleteById(id);
	}

}
