package com.dsvendas.DashBoardVendas.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsvendas.DashBoardVendas.DTO.SaleDTO;
import com.dsvendas.DashBoardVendas.DTO.SucessoVendasVendedorDTO;
import com.dsvendas.DashBoardVendas.DTO.SumSaleSellerDTO;
import com.dsvendas.DashBoardVendas.Entities.Sale;
import com.dsvendas.DashBoardVendas.Repositories.SaleRepository;
import com.dsvendas.DashBoardVendas.Repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	
	@Transactional(readOnly =  true)
	public Page<SaleDTO> buscarVendas(Pageable pageable){
		 sellerRepository.findAll();
		 Page<Sale> result = repository.findAll(pageable);		 
		 return result.map(x -> new  SaleDTO(x));
	
	}
	
	@Transactional(readOnly =  true)
	public List<SumSaleSellerDTO> somaVendasPorVendedor(){
		return repository.somaVendasPorVendedor();
	}
	
	@Transactional(readOnly =  true)
	public List<SucessoVendasVendedorDTO> sucessoVendasPorVendedor(){
		return repository.sucessoVendasVendedorDTO();
	}
	
	
	
	
}
