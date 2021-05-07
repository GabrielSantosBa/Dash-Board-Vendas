package com.dsvendas.DashBoardVendas.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsvendas.DashBoardVendas.DTO.SaleDTO;
import com.dsvendas.DashBoardVendas.DTO.SellerDTO;
import com.dsvendas.DashBoardVendas.Entities.Sale;
import com.dsvendas.DashBoardVendas.Repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	
	public List<SaleDTO> buscarVendas(){
		 List<Sale> result = repository.findAll();		 
		 return result.stream().map(x -> new  SaleDTO(x)).collect(Collectors.toList());
	
	}
	
}
