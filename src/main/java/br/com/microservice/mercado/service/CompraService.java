package br.com.microservice.mercado.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.microservice.mercado.controller.dto.CompraDTO;
import br.com.microservice.mercado.controller.dto.InfoFornecedorDTO;

public class CompraService {
	
	public void compra(CompraDTO compra) {
		
		RestTemplate client = new RestTemplate();
		ResponseEntity<InfoFornecedorDTO> exchange =
		client.exchange("http://localhost:8081/" + compra.getEndereco().getEstado(), HttpMethod.GET, null, InfoFornecedorDTO.class);
		
		
		System.out.println(exchange.getBody().getEndereco());
		
	}


}
