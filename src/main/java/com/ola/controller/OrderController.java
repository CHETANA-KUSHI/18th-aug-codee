package com.ola.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ola.request.OrderRequest;
import com.ola.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/placeorder")
	public ResponseEntity createOrder(@RequestBody OrderRequest orderRequest)
	{
		orderService.createOrde(orderRequest);
	return ResponseEntity.ok(HttpStatus.OK);
	}
}
