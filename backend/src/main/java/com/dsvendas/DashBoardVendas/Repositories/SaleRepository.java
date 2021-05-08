package com.dsvendas.DashBoardVendas.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dsvendas.DashBoardVendas.DTO.SucessoVendasVendedorDTO;
import com.dsvendas.DashBoardVendas.DTO.SumSaleSellerDTO;
import com.dsvendas.DashBoardVendas.Entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
 
	
	@Query("SELECT new com.dsvendas.DashBoardVendas.DTO.SumSaleSellerDTO(obj.seller, SUM(obj.amount))"
			+ "FROM Sale AS obj GROUP BY obj.seller  ")
	List<SumSaleSellerDTO> somaVendasPorVendedor();
	
	@Query("SELECT new com.dsvendas.DashBoardVendas.DTO.SucessoVendasVendedorDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ "FROM Sale AS obj GROUP BY obj.seller  ")
	List<SucessoVendasVendedorDTO> sucessoVendasVendedorDTO();
	
}
