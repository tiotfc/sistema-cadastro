package br.com.sada.sistema.cadastro.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.sistema.cadastro.model.Cliente;
import br.com.sada.sistema.cadastro.service.ClienteServiceImpl;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	public ClienteServiceImpl clienteServiceImpl;
	
	public ClienteController(ClienteServiceImpl clienteServiceImpl) {
		this.clienteServiceImpl = clienteServiceImpl;
	}

	@PostMapping
	public Cliente salvar(@RequestBody Cliente cliente) {
		return clienteServiceImpl.save(cliente);
	}
	
	@GetMapping("/{id}")
	public Cliente buscarPorId(@PathVariable int id) {
		return clienteServiceImpl.findById(id);
	}
	
	@GetMapping()
	public List<Cliente> buscarTodos() {
		return clienteServiceImpl.findAll();
	}
}
