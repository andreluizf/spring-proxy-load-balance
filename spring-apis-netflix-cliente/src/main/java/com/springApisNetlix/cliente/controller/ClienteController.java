package com.springApisNetlix.cliente.controller;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name="cliente")
public class ClienteController {
	@GetMapping
	public ResponseEntity<?> findAll() {
		return  new ResponseEntity<Object>(Arrays.asList("ciente 1", "cliente 2"),HttpStatus.OK);
	}
}
