package com.dsvendas.DashBoardVendas.DTO;

import java.io.Serializable;

import com.dsvendas.DashBoardVendas.Entities.Seller;

public class SucessoVendasVendedorDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Long visitas;
	private Long negociosFechados;

	public SucessoVendasVendedorDTO() {}

	public SucessoVendasVendedorDTO(Seller seller, Long visitas, Long negociosFechados) {
		this.sellerName = seller.getName();
		this.visitas = visitas;
		this.negociosFechados = negociosFechados;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisitas() {
		return visitas;
	}

	public void setVisitas(Long visitas) {
		this.visitas = visitas;
	}

	public Long getNegociosFechados() {
		return negociosFechados;
	}

	public void setNegociosFechados(Long negociosFechados) {
		this.negociosFechados = negociosFechados;
	}


	
	
	
	
}
