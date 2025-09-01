package com.tapalque.gastronomia.demo.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
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
import com.tapalque.gastronomia.demo.Entity.LocalGastronomico;
import com.tapalque.gastronomia.demo.Service.I_localGastronomicoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/gastronomia/local")
@CrossOrigin("*")
public class LocalGastronomicoController {

   private final I_localGastronomicoService localGastronomicoService;

    public LocalGastronomicoController(I_localGastronomicoService localGastronomicoService) {
        this.localGastronomicoService = localGastronomicoService;
    }


    @GetMapping("/findAll") // obtener todos
    public ResponseEntity<List<LocalGastronomicoDTO>> findAllLocalController() {
        List<LocalGastronomicoDTO> locales = localGastronomicoService.getAllLocalGastronomicos()
                .stream()
                .map(LocalGastronomicoDTO::new)
                .toList();
        return ResponseEntity.ok(locales);
    }

    @GetMapping("/findById/{id}") // obtener por id
    public ResponseEntity<LocalGastronomicoDTO> findByIdLocalController(@PathVariable Long id) {
        LocalGastronomico local = localGastronomicoService.getLocalGastronomicoById(id);
        return ResponseEntity.ok(new LocalGastronomicoDTO(local));
    }

    @PostMapping("/save") // crear nuevo local gastronomico
    public ResponseEntity<LocalGastronomicoDTO> saveLocalController(@Valid @RequestBody LocalGastronomicoDTO nuevo_local) {
        LocalGastronomico localEntity = nuevo_local.toEntity(); // asumimos que DTO tiene método paraEntity()
        localGastronomicoService.addLocalGastronomico(localEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(new LocalGastronomicoDTO(localEntity));
    }

  

    @PutMapping("/reload/{id}") // actualizar
    public ResponseEntity<LocalGastronomicoDTO> reloadLocalController(@Valid @PathVariable Long id,
            @RequestBody LocalGastronomicoDTO actualizar_local) {
        LocalGastronomico entity = actualizar_local.toEntity();
        entity.setId_local(id); // aseguramos que se actualice el correcto
        localGastronomicoService.updateLocalGastronomico(entity);
        return ResponseEntity.ok(new LocalGastronomicoDTO(entity));
    }

    @DeleteMapping("/delete/{id}") // eliminar
    public ResponseEntity<Void> deleteLocalController(@PathVariable Long id) {
        localGastronomicoService.deleteLocalGastronomico(id.intValue());
        return ResponseEntity.noContent().build();
    }

    /*@GetMapping("/findByRole/{rubro}") // buscar por rubro
    public ResponseEntity<List<LocalGastronomicoDTO>> findByRoleLocalController(@PathVariable String rubro) {
        
        List<LocalGastronomico> locales = localGastronomicoService.findByRubro(rubro);
        List<LocalGastronomicoDTO> result = locales.stream().map(LocalGastronomicoDTO::new).toList();
        return ResponseEntity.ok(result);
    }*/

    @GetMapping("/saludo")
    public String getMethodName() {
        return "Hola Mundo!!";
    }
}
