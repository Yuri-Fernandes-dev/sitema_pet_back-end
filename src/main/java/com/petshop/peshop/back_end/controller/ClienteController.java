package com.petshop.peshop.back_end.controller;


import com.petshop.peshop.back_end.model.Cliente;
import com.petshop.peshop.back_end.model.Pet;
import com.petshop.peshop.back_end.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public void salvarCliente(@RequestBody  Cliente cliente){
        clienteService.cadastrarCliente(cliente);

    }


    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteService.buscarListaClientes();
    }
}
