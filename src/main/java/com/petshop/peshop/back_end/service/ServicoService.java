package com.petshop.peshop.back_end.service;


import com.petshop.peshop.back_end.model.Servico;
import com.petshop.peshop.back_end.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public void cadastrarServico(Servico servico){
        servicoRepository.save(servico);
    }


    public List<Servico> buscarServicos(){
       return servicoRepository.findAll();
    }



}
