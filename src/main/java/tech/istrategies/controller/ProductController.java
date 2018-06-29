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
import tech.istrategies.model.Products;
import tech.istrategies.respository.ProductLineRepository;
import tech.istrategies.respository.ProductRepository;

@Controller
@RequestMapping(path = "/product")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping(path = "/")
	@ResponseBody
	public List<Products> getAll() {
		return productRepository.findAll();
	}

	@PostMapping(path = "/")
	public Products create(@RequestBody Products request) {
		return productRepository.save(request);
	}

	@PutMapping("/")
	public Products update(@RequestBody Products request) {
		return productRepository.save(request);
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Products> findOne(@PathVariable("id") int id) {
		return productRepository.findById(id);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		productRepository.deleteById(id);
	}

}
