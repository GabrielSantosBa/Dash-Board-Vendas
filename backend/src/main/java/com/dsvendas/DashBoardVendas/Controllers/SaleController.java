package com.dsvendas.DashBoardVendas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsvendas.DashBoardVendas.DTO.SaleDTO;
import com.dsvendas.DashBoardVendas.Entities.Sale;
import com.dsvendas.DashBoardVendas.Services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;

	@GetMapping
	public ResponseEntity<List<SaleDTO>> sales(){		
		List<SaleDTO> lista = service.buscarVendas();		
		return ResponseEntity.ok(lista);
	} 
	
}
