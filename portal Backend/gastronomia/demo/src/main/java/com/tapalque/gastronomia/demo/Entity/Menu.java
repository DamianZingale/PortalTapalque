package com.tapalque.gastronomia.demo.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;



@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_menu;

    private String plato;
    private String descripcion;
    private int comensales;

    @ManyToMany(mappedBy = "ingredienteMenu", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
private Set<Ingredientes> ingredientes = new HashSet<>();

    
    @ManyToOne
    @JoinColumn(name = "pkLocal", referencedColumnName = "Id_local", nullable=false)
    private LocalGastronomico menuLocal;

    public Menu(){};
    
    public Menu(Long id_menu, String plato, String descripcion, int comensales, Set<Ingredientes> ingredientes,
            LocalGastronomico menuLocal) {
        this.id_menu = id_menu;
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

    public Set<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Set<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public LocalGastronomico getMenuLocal() {
        return menuLocal;
    }

    public void setMenuLocal(LocalGastronomico menuLocal) {
        this.menuLocal = menuLocal;
    }



}
