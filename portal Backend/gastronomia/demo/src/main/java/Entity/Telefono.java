package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Telefono {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long Id_telefono;
    
    private String numero;


    @ManyToOne
    @JoinColumn(name = "local_id") // Esto crea la FK en la tabla telefono
    private LocalGastronomico telefonoLocal;

    public Telefono(){};
    
    public Telefono(Long id_telefono, String numero, LocalGastronomico telefonoLocal) {
        Id_telefono = id_telefono;
        this.numero = numero;
        this.telefonoLocal = telefonoLocal;
    }


    public Long getId_telefono() {
        return Id_telefono;
    }


    public void setId_telefono(Long id_telefono) {
        Id_telefono = id_telefono;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public LocalGastronomico getTelefonoLocal() {
        return telefonoLocal;
    }


    public void setTelefonoLocal(LocalGastronomico telefonoLocal) {
        this.telefonoLocal = telefonoLocal;
    }

    

}