package br.com.restaurante.app.request;

import java.io.Serializable;
import java.math.BigDecimal;

public class PratoRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private BigDecimal valor;
	private Integer restauranteID;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Integer getRestauranteID() {
		return restauranteID;
	}
	public void setRestauranteID(Integer restauranteID) {
		this.restauranteID = restauranteID;
	}
	
}
