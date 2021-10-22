package br.com.sada.sistema.cadastro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sada.sistema.cadastro.model.Cliente;
import br.com.sada.sistema.cadastro.repository.ClienteRepository;

@Service
public class ClienteServiceImpl {

	private ClienteRepository clienteRepository;

	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	};
	
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente findById(int id) {
		return clienteRepository.findById(id).get();		
	}
	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}
	
}
