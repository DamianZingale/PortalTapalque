package com.tapalque.gastronomia.demo.DTO;

import java.util.List;

import org.hibernate.validator.constraints.URL;

import com.tapalque.gastronomia.demo.Entity.HorarioAtencion;
import com.tapalque.gastronomia.demo.Entity.ImagenLocal;
import com.tapalque.gastronomia.demo.Entity.LocalGastronomico;
import com.tapalque.gastronomia.demo.Entity.Resenias;
import com.tapalque.gastronomia.demo.Entity.Telefono;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;

public class LocalGastronomicoDTO {
    
    @Null(message = "El ID es auto-generado y no debe ser establecido")
    private Long Id_local;
    
    @NotNull(message = "El nombre del local no puede ser nulo.")
    @Size(min = 1, max = 50, message = "El nombre del local debe tener entre 1 y 50 caracteres.")
    private String nombre_local;

    @NotNull(message = "La dirección del local no puede ser nula.")
    @Size(min = 1, max = 200, message = "La dirección del local debe tener entre 1 y 200 caracteres.")
    private String direccion_local;

    @URL(message = "La URL debe ser válida.")
    private String url_mapa;

    @Valid
    @NotEmpty(message = "Debe haber al menos un teléfono.")
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

    // Método DTO -> Entity
    public LocalGastronomico toEntity() {
        LocalGastronomico local = new LocalGastronomico();
        local.setId_local(this.Id_local); // si es null, se genera en DB
        local.setNombreLocal(this.nombre_local);
        local.setDireccion(this.direccion_local);
        local.setUbicacion_map(this.url_mapa);
        local.setTelefonos(this.telefono_local);
        local.setHorarios(this.horarios);
        local.setResenia(this.comentarios);
        local.setImagenes(this.fotos);
        return local;
    }
    
}

