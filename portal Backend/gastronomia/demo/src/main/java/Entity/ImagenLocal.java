package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class ImagenLocal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_imagen;

    @Column(name="foto")
    private String Imagen_local;

    @ManyToOne
    @JoinColumn(name="local_id")
    private LocalGastronomico imagenLocal;

    public ImagenLocal(){};
    
    public ImagenLocal(Long id_imagen, String imagen_local, LocalGastronomico imagenLocal) {
        Id_imagen = id_imagen;
        Imagen_local = imagen_local;
        this.imagenLocal = imagenLocal;
    }

    public Long getId_imagen() {
        return Id_imagen;
    }

    public void setId_imagen(Long id_imagen) {
        Id_imagen = id_imagen;
    }

    public String getImagen_local() {
        return Imagen_local;
    }

    public void setImagen_local(String imagen_local) {
        Imagen_local = imagen_local;
    }

    public LocalGastronomico getImagenLocal() {
        return imagenLocal;
    }

    public void setImagenLocal(LocalGastronomico imagenLocal) {
        this.imagenLocal = imagenLocal;
    }


}
