package com.tapalque.gastronomia.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Rubro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rubro;

    private String rubro;

   @ManyToOne
    @JoinColumn(name="Id_local")
    private LocalGastronomico rubroLocal;

    public Rubro(){};
    
   public Rubro(String rubro, LocalGastronomico rubroLocal) {
    
    this.rubro = rubro;
    this.rubroLocal = rubroLocal;
}

   public Long getId_rubro() {
    return id_rubro;
   }

   public void setId_rubro(Long id_rubro) {
    this.id_rubro = id_rubro;
   }

   public String getRubro() {
    return rubro;
   }

   public void setRubro(String rubro) {
    this.rubro = rubro;
   }

   public LocalGastronomico getRubroLocal() {
    return rubroLocal;
   }

   public void setRubroLocal(LocalGastronomico rubroLocal) {
    this.rubroLocal = rubroLocal;
   }

    
}
