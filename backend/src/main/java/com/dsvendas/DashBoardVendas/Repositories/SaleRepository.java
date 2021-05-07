package com.dsvendas.DashBoardVendas.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsvendas.DashBoardVendas.Entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
 
}
