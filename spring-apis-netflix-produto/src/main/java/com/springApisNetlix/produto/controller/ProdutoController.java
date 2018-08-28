package com.springApisNetlix.produto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

@RestController
@RequestMapping(value = "/")
public class ProdutoController {
	private static final Map<Long, String> PRODUCTS = ImmutableMap.of(1L, "Product 1", 2L, "Product 2", 3L, "Product 3",
			4L, "Product 4");

	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	public List<String> findAll() {
		return new ArrayList<>(PRODUCTS.values());
	}

//	@GetMapping
//	public ResponseEntity<?> findAll() {
//		return  new ResponseEntity<Object>(Arrays.asList("produto 1", "produto 2"),HttpStatus.OK);
//	}

	@RequestMapping(value = "/produtos/{id}", method = RequestMethod.GET)
	public String findById(@PathVariable("id") Long id) {
		return PRODUCTS.get(id);
	}
}
