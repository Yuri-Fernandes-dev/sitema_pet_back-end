package com.petshop.peshop.back_end.service;


import com.petshop.peshop.back_end.model.Pet;
import com.petshop.peshop.back_end.repository.PetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;


    public void cadastrarPet(Pet pet){
        petRepository.save(pet);
    }

    public List<Pet> buscarTodosPets(){
       return petRepository.findAll();
    }
}
