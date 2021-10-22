package br.com.sada.sistema.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sada.sistema.cadastro.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
