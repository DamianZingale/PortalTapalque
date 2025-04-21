package com.tapalque.gastronomia.demo.DTO;



import java.util.List;

import com.tapalque.gastronomia.demo.Entity.HorarioAtencion;
import com.tapalque.gastronomia.demo.Entity.ImagenLocal;
import com.tapalque.gastronomia.demo.Entity.LocalGastronomico;
import com.tapalque.gastronomia.demo.Entity.Resenias;
import com.tapalque.gastronomia.demo.Entity.Telefono;

public class LocalGastronomicoDTO {

    private Long Id_local;
    private String nombre_local;
    private String direccion_local;
    private String url_mapa;
    private List<Telefono> telefono_local;
    private List<ImagenLocal> fotos;
    private List<HorarioAtencion> horarios;
    private List<Resenias> comentarios;

    public LocalGastronomicoDTO(LocalGastronomico local_gastronomico){
        this.Id_local = local_gastronomico.getId_local();
        this.nombre_local = local_gastronomico.getNombreLocal();
        this.direccion_local = local_gastronomico.getDireccion();
        this.url_mapa = local_gastronomico.getUbicacion_map();
        this.telefono_local = local_gastronomico.getTelefonos();
        this.horarios = local_gastronomico.getHorarios();
        this.comentarios = local_gastronomico.getResenia();
    }

    public Long getId_local() {
        return Id_local;
    }

    public void setId_local(Long id_local) {
        Id_local = id_local;
    }

    public String getNombre_local() {
        return nombre_local;
    }

    public void setNombre_local(String nombre_local) {
        this.nombre_local = nombre_local;
    }

    public String getDireccion_local() {
        return direccion_local;
    }

    public void setDireccion_local(String direccion_local) {
        this.direccion_local = direccion_local;
    }

    public String getUrl_mapa() {
        return url_mapa;
    }

    public void setUrl_mapa(String url_mapa) {
        this.url_mapa = url_mapa;
    }

    public List<Telefono> getTelefono_local() {
        return telefono_local;
    }

    public void setTelefono_local(List<Telefono> telefono_local) {
        this.telefono_local = telefono_local;
    }

    public List<ImagenLocal> getFotos() {
        return fotos;
    }

    public void setFotos(List<ImagenLocal> fotos) {
        this.fotos = fotos;
    }

    public List<HorarioAtencion> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<HorarioAtencion> horarios) {
        this.horarios = horarios;
    }

    public List<Resenias> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Resenias> comentarios) {
        this.comentarios = comentarios;
    }

    

}