package com.dsvendas.DashBoardVendas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsvendas.DashBoardVendas.DTO.SaleDTO;
import com.dsvendas.DashBoardVendas.DTO.SucessoVendasVendedorDTO;
import com.dsvendas.DashBoardVendas.DTO.SumSaleSellerDTO;
import com.dsvendas.DashBoardVendas.Services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> sales(Pageable pageable){	
		Page<SaleDTO> lista = service.buscarVendas(pageable);		
		return ResponseEntity.ok(lista);
	} 
		
	
	@GetMapping(value = "/soma-por-vendedor")	
	@Cacheable("soma-por-vendedor")
	public ResponseEntity<List<SumSaleSellerDTO>> somaVendasPorVendedor(){		
		List<SumSaleSellerDTO> listaVendasSomadas = service.somaVendasPorVendedor();		
		return ResponseEntity.ok(listaVendasSomadas);		
	}	
	
	@GetMapping(value = "/sucesso-por-vendedor")
	@Cacheable("sucesso-por-vendedor")
	public ResponseEntity<List<SucessoVendasVendedorDTO>> sucessoVendasVendedorDTO(){		
		List<SucessoVendasVendedorDTO> listaSucessoVendasVendedor = service.sucessoVendasPorVendedor();	
		return ResponseEntity.ok(listaSucessoVendasVendedor);		
	}
	
	
	
}
