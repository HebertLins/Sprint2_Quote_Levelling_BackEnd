package br.com.fiap.global.repository;

import br.com.fiap.global.model.Usuario.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Long>{
    
}
