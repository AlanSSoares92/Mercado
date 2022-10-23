package br.com.microservice.mercado.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.microservice.mercado.controller.dto.CompraDTO;
import br.com.microservice.mercado.controller.dto.InfoFornecedorDTO;

public class CompraService {
	
	public void compra(CompraDTO compra) {
		//RestTemplate é uma ferramenta do Spring para requisições HTTP que são síncronas, ou seja, a cada requisição, 
		//a execução da aplicação pára, esperando uma resposta
		RestTemplate client = new RestTemplate();
		//ResponseEntity: significa representar toda a resposta HTTP. Você pode controlar qualquer coisa que aconteça: código de status, cabeçalhos e corpo. 
		//Trabalhando com microservice, ResponseEntity para enviar resposta completa, com status, com cabeçalho e corpo.
		ResponseEntity<InfoFornecedorDTO> exchange =
		client.exchange("http://localhost:8081/" + compra.getEndereco().getEstado(), 
				HttpMethod.GET, null, InfoFornecedorDTO.class);
//		O interceptor HTTP Method "troca" o método HTTP da chamada corrente. Por exemplo, suponhamos que a chamada a um recurso de uma API cadastrada ( /stores/{id} ) seja do tipo GET; porém,
//		o seu servidor suporta apenas chamadas do tipo POST, 
//		por isso este é o método cadastrado no Manager.
		
		System.out.println(exchange.getBody().getEndereco());
		
	}


}
