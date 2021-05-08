package com.dsvendas.DashBoardVendas.DTO;

import java.io.Serializable;

import com.dsvendas.DashBoardVendas.Entities.Seller;

public class SumSaleSellerDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Double soma;

	public SumSaleSellerDTO() {
	}

	public SumSaleSellerDTO(Seller seller, Double soma) {
		this.sellerName = seller.getName();
		this.soma = soma;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSoma() {
		return soma;
	}

	public void setSoma(Double soma) {
		this.soma = soma;
	}

	

}
