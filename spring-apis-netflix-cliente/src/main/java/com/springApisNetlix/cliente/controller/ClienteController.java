package com.springApisNetlix.cliente.controller;

import java.util.Arrays;

import javax.validation.metadata.MethodType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class ClienteController {
	@RequestMapping(value="/clientes", method=RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		return  new ResponseEntity<Object>(Arrays.asList("ciente 1", "cliente 2"),HttpStatus.OK);
	}
}
