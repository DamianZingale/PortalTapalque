package Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Resenias {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_resenia;

    private String comentario;
    private int puntaje; //del 1 al 5
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private LocalGastronomico reseniaLocal;

    public Resenias(){};

    public Resenias(Long id_resenia, String comentario, int puntaje, LocalDate fecha, LocalGastronomico reseniaLocal) {
        this.id_resenia = id_resenia;
        this.comentario = comentario;
        this.puntaje = puntaje;
        this.fecha = fecha;
        this.reseniaLocal = reseniaLocal;
    }

    public Long getId_resenia() {
        return id_resenia;
    }

    public void setId_resenia(Long id_resenia) {
        this.id_resenia = id_resenia;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalGastronomico getReseniaLocal() {
        return reseniaLocal;
    }

    public void setReseniaLocal(LocalGastronomico reseniaLocal) {
        this.reseniaLocal = reseniaLocal;
    }

    
}
