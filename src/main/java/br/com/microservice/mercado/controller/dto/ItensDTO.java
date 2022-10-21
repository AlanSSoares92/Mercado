package br.com.microservice.mercado.controller.dto;

public class ItensDTO {

	private long id;
	private int quantidade;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
