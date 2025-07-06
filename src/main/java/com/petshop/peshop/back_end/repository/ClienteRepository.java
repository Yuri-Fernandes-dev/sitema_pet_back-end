package com.petshop.peshop.back_end.repository;

import com.petshop.peshop.back_end.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository<Cliente, Long> {


}
