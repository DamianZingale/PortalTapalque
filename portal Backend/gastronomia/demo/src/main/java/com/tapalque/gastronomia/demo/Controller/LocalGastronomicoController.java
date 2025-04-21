package com.tapalque.gastronomia.demo.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tapalque.gastronomia.demo.DTO.LocalGastronomicoDTO;



@RestController
@RequestMapping("/api/gastronomia/local")
@CrossOrigin("*")
public class LocalGastronomicoController {

   
    @GetMapping("/findAll") //obtener todos
    public ResponseEntity<List<LocalGastronomicoDTO>> findAllLocalController(){
        return null;
    }
    
    @GetMapping("/finById/{id}")//obtener por id
    public ResponseEntity<LocalGastronomicoDTO> findByIdLocalController (@PathVariable Long id){
        return null;
    }

    @PostMapping("/save")//crear nuevo local gastronomico
    public ResponseEntity<LocalGastronomicoDTO> saveLocalController(@RequestBody LocalGastronomicoDTO nuevo_local) {
        return null;
    }

    @PutMapping("/reload/{id}")//actualizar
    public ResponseEntity<LocalGastronomicoDTO> reloadLocalController (@PathVariable Long id, @RequestBody LocalGastronomicoDTO actualizar_local) {
        return null;
    }
    
    @DeleteMapping("/delete/{id}")//eliminar
    public ResponseEntity<LocalGastronomicoDTO> deleteLocalController (@PathVariable Long id){
        return null;
    }
    @GetMapping("/findByRole/{rubro}")//buscar por rubro
    public ResponseEntity<List<LocalGastronomicoDTO>> findByRoleLocalController (@PathVariable String rubro) {
        return null;
    }

    @GetMapping("/saludo")
    public String getMethodName() {
        return "Hola Mundo!!";
    }
    
    //falta agregar las validaciones!!
}