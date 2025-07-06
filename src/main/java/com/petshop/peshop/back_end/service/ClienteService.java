package com.petshop.peshop.back_end.service;


import com.petshop.peshop.back_end.model.Cliente;
import com.petshop.peshop.back_end.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {


    @Autowired // elima a exigencia de usar o new
    private ClienteRepository clienteRepository;

    public void cadastrarCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public List<Cliente> buscarListaClientes(){
        return  clienteRepository.findAll();
    }

}
