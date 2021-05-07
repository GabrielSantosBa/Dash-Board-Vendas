package com.dsvendas.DashBoardVendas.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsvendas.DashBoardVendas.DTO.SellerDTO;
import com.dsvendas.DashBoardVendas.Entities.Seller;
import com.dsvendas.DashBoardVendas.Repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	
	public List<SellerDTO> buscarTodos(){
		 List<Seller> result = repository.findAll();
		 
		 
		 return result.stream().map(x -> new  SellerDTO(x)).collect(Collectors.toList());
	
	}
	
}
