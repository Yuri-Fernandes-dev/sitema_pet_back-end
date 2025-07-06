package com.petshop.peshop.back_end.controller;


import com.petshop.peshop.back_end.model.Pet;
import com.petshop.peshop.back_end.service.PetService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pet")
@CrossOrigin(origins = "*")
public class PetController {


    @Autowired
    private PetService petService;

    @PostMapping
    public void salvarPet(@RequestBody Pet pet){
        petService.cadastrarPet(pet);
    }


    @GetMapping
   public List<Pet> carregarTodosPets(){

        return petService.buscarTodosPets();
    }
}

