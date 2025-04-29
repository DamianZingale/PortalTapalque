package com.tapalque.gastronomia.demo.Entity;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;



@Entity
public class Ingredientes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_ingrediente;
  
    @ManyToMany
    @JoinTable(
        name = "ingrediente_menu",
        joinColumns = @JoinColumn(name = "ingrediente_id"),
        inverseJoinColumns = @JoinColumn(name = "menu_id")
    )
    private Set<Menu> ingredienteMenu = new HashSet<>();
    
    public Ingredientes(){};

    public Ingredientes(Long id_ingrediente, Set<Menu> ingredienteMenu) {
        this.id_ingrediente = id_ingrediente;
        this.ingredienteMenu = ingredienteMenu;
    }

    public Long getId_ingrediente() {
        return id_ingrediente;
    }

    public void setId_ingrediente(Long id_ingrediente) {
        this.id_ingrediente = id_ingrediente;
    }

    public Set<Menu> getIngredienteMenu() {
        return ingredienteMenu;
    }

    public void setIngredienteMenu(Set<Menu> ingredienteMenu) {
        this.ingredienteMenu = ingredienteMenu;
    }

   

    
}

