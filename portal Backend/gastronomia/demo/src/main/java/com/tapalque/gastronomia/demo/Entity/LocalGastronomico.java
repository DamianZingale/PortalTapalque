package com.tapalque.gastronomia.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;




@Entity
public class LocalGastronomico {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long Id_local;
    
    @Column (name="nombre", nullable = false)
    private String nombreLocal;
    
    
    private String direccion;

    @Column(name="URL_map")
    private String ubicacion_map;

    private boolean estado = true;
    
    @OneToMany(mappedBy = "telefonoLocal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Telefono> telefonos = new ArrayList<>();
    
    @OneToMany(mappedBy = "rubroLocal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rubro> rubros = new ArrayList<>();
    
    @OneToMany(mappedBy = "menuLocal", cascade = CascadeType.ALL, orphanRemoval = true )
    private List<Menu> menu = new ArrayList<>();

    @OneToMany(mappedBy = "horarioLocal", cascade = CascadeType.ALL, orphanRemoval = true )
    private List<HorarioAtencion> horarios = new ArrayList<>();

    @OneToMany(mappedBy = "imagenLocal", cascade = CascadeType.ALL, orphanRemoval = true )
    private List<ImagenLocal> imagenes = new ArrayList<>();

    @OneToMany(mappedBy = "reseniaLocal", cascade = CascadeType.ALL, orphanRemoval = true )
    private List<Resenias> resenia = new ArrayList<>();
    
    public LocalGastronomico(){};

    public LocalGastronomico(String nombreLocal, String direccion, String ubicacion_map, boolean estado,
                             List<Telefono> telefonos, List<Rubro> rubros, List<Menu> menu, List<HorarioAtencion> horarios,
                             List<ImagenLocal> imagenes, List<Resenias> resenia) {
        
        this.nombreLocal = nombreLocal;
        this.direccion = direccion;
        this.ubicacion_map = ubicacion_map;
        this.estado = estado;
        this.telefonos = telefonos;
        this.rubros = rubros;
        this.menu = menu;
        this.horarios = horarios;
        this.imagenes = imagenes;
        this.resenia = resenia;
    }

    public Long getId_local() {
        return Id_local;
    }

    public void setId_local(Long id_local) {
        Id_local = id_local;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbicacion_map() {
        return ubicacion_map;
    }

    public void setUbicacion_map(String ubicacion_map) {
        this.ubicacion_map = ubicacion_map;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public List<Rubro> getRubros() {
        return rubros;
    }

    public void setRubros(List<Rubro> rubros) {
        this.rubros = rubros;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    public List<HorarioAtencion> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<HorarioAtencion> horarios) {
        this.horarios = horarios;
    }

    public List<ImagenLocal> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<ImagenLocal> imagenes) {
        this.imagenes = imagenes;
    }

    public List<Resenias> getResenia() {
        return resenia;
    }

    public void setResenia(List<Resenias> resenia) {
        this.resenia = resenia;
    }

    
    
}
