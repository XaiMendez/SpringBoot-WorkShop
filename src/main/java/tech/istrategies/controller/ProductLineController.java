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

import tech.istrategies.model.ProductLines;
import tech.istrategies.respository.ProductLineRepository;

@Controller
@RequestMapping(path = "/productline")
public class ProductLineController {

	@Autowired
	private ProductLineRepository productLineRepository;

	@GetMapping(path = "/")
	@ResponseBody
	public List<ProductLines> getAll() {
		return productLineRepository.findAll();
	}

	@PostMapping(path = "/")
	public ProductLines create(@RequestBody ProductLines request) {
		return productLineRepository.save(request);
	}

	@PutMapping("/")
	public ProductLines update(@RequestBody ProductLines request) {
		return productLineRepository.save(request);
	}

	@GetMapping(path = { "/{id}" })
	public Optional<ProductLines> findOne(@PathVariable("id") int id) {
		return productLineRepository.findById(id);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		productLineRepository.deleteById(id);
	}

}
