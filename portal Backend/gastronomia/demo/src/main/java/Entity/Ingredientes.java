package Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Ingredientes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_ingrediente;
  
    @ManyToOne
    @JoinColumn(name ="id_menu")
    private Menu ingredienteMenu;
    
    public Ingredientes(){};

    public Ingredientes(Long id_ingrediente, Menu ingredienteMenu) {
        this.id_ingrediente = id_ingrediente;
        this.ingredienteMenu = ingredienteMenu;
    }

    public Long getId_ingrediente() {
        return id_ingrediente;
    }

    public void setId_ingrediente(Long id_ingrediente) {
        this.id_ingrediente = id_ingrediente;
    }

    public Menu getIngredienteMenu() {
        return ingredienteMenu;
    }

    public void setIngredienteMenu(Menu ingredienteMenu) {
        this.ingredienteMenu = ingredienteMenu;
    }

   

    
}

