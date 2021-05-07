package com.dsvendas.DashBoardVendas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsvendas.DashBoardVendas.DTO.SellerDTO;
import com.dsvendas.DashBoardVendas.Services.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

	@Autowired
	private SellerService service;

	@GetMapping
	public ResponseEntity<List<SellerDTO>> sellers() {

		List<SellerDTO> lista = service.buscarTodos();

		return ResponseEntity.ok(lista);
	}

}
