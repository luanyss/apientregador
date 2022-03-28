package com.kintsugi.apientregador.controller;

import com.kintsugi.apientregador.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/orders")
	public ResponseEntity<?> recuperarPedidoIdDriver(@RequestParam("driver_id") Integer idDriver) {
		return orderService.recuperarPedidoIdDriver(idDriver);
	}

}
