package com.petshop.peshop.back_end.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.petshop.peshop.back_end.model.Pet;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;

    @JsonFormat(pattern = "yyyy-MM-dd") // Isso garante que o Spring entenda o formato da data vindo do front
    private LocalDate data;

    @ManyToOne(fetch = FetchType.EAGER)  // força carregar o pet junto
    @JoinColumn(name = "pet_id")
    private Pet pet;



    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
