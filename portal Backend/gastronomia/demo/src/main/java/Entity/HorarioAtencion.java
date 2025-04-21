package Entity;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class HorarioAtencion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_horario;

    @Enumerated(EnumType.STRING)
    private diasSemana dias;

    private LocalTime apertura;
    private LocalTime cierre;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private LocalGastronomico local;


    public enum diasSemana{
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }

    public HorarioAtencion(){};
    
    public HorarioAtencion(Long id_horario, HorarioAtencion.diasSemana dias, LocalTime apertura, LocalTime cierre,
            LocalGastronomico local) {
        this.id_horario = id_horario;
        this.dias = dias;
        this.apertura = apertura;
        this.cierre = cierre;
        this.local = local;
    }

    public Long getId_horario() {
        return id_horario;
    }

    public void setId_horario(Long id_horario) {
        this.id_horario = id_horario;
    }

    public diasSemana getDias() {
        return dias;
    }

    public void setDias(diasSemana dias) {
        this.dias = dias;
    }

    public LocalTime getApertura() {
        return apertura;
    }

    public void setApertura(LocalTime apertura) {
        this.apertura = apertura;
    }

    public LocalTime getCierre() {
        return cierre;
    }

    public void setCierre(LocalTime cierre) {
        this.cierre = cierre;
    }

    public LocalGastronomico getLocal() {
        return local;
    }

    public void setLocal(LocalGastronomico local) {
        this.local = local;
    }

    

}
