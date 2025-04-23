package com.tapalque.gastronomia.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_menu;

    private String plato;
    private String descripcion;
    private int comensales;

    @OneToMany(mappedBy = "ingredienteMenu",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ingredientes> ingredientes = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "Id_local")
    private LocalGastronomico menuLocal;

    public Menu(){};
    
    public Menu(String plato, String descripcion, int comensales, List<Ingredientes> ingredientes,
            LocalGastronomico menuLocal) {
        
        this.plato = plato;
        this.descripcion = descripcion;
        this.comensales = comensales;
        this.ingredientes = ingredientes;
        this.menuLocal = menuLocal;
    }

    public Long getId_menu() {
        return id_menu;
    }

    public void setId_menu(Long id_menu) {
        this.id_menu = id_menu;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public LocalGastronomico getMenuLocal() {
        return menuLocal;
    }

    public void setMenuLocal(LocalGastronomico menuLocal) {
        this.menuLocal = menuLocal;
    }



}
