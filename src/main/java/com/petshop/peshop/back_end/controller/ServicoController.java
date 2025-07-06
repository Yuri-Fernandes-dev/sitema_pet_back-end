package com.petshop.peshop.back_end.controller;

import com.petshop.peshop.back_end.model.Servico;
import com.petshop.peshop.back_end.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servico")
@CrossOrigin(origins = "*")
public class ServicoController {


    @Autowired
    private ServicoService servicoService;

    @PostMapping
    public void cadastrarServico(@RequestBody  Servico servico){
        servicoService.cadastrarServico(servico);
    }


    @GetMapping
    public List<Servico>  listarServicosAgendados(){
       return servicoService.buscarServicos();
    }




}
