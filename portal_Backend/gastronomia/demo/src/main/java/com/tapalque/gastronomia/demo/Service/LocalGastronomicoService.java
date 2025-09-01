package com.tapalque.gastronomia.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tapalque.gastronomia.demo.Entity.LocalGastronomico;
import com.tapalque.gastronomia.demo.Repository.LocalRepositoryInterface;

import jakarta.persistence.EntityNotFoundException;

@Service
public class LocalGastronomicoService implements I_localGastronomicoService {

    @Autowired
    private LocalRepositoryInterface localGastronomicoRepository;

    @Override
    public void addLocalGastronomico(LocalGastronomico localGastronomico) {
        if (localGastronomico.getNombreLocal() == null || localGastronomico.getNombreLocal().isBlank()) {
            throw new IllegalArgumentException("El nombre del local no puede estar vacío");
        }
        localGastronomicoRepository.save(localGastronomico);
    }

    @Override
    public LocalGastronomico getLocalGastronomicoById(Long id) {
        return localGastronomicoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No se encontró el local con id " + id));
    }

    @Override
    public List<LocalGastronomico> getAllLocalGastronomicos() {
        List<LocalGastronomico> locales = localGastronomicoRepository.findAll();
        if (locales.isEmpty()) {
            throw new EntityNotFoundException("No hay locales gastronómicos registrados");
        }
        return locales;
    }

    @Override
    public void updateLocalGastronomico(LocalGastronomico localGastronomico) {
        if (!localGastronomicoRepository.existsById(localGastronomico.getId_local())) {
            throw new EntityNotFoundException("No existe el local con id " + localGastronomico.getId_local());
        }
        localGastronomicoRepository.save(localGastronomico);
    }

    @Override
    public void deleteLocalGastronomico(int id) {
        Long idLong = (long) id;
        if (!localGastronomicoRepository.existsById(idLong)) {
            throw new EntityNotFoundException("No se puede eliminar, no existe el local con id " + id);
        }
        localGastronomicoRepository.deleteById(idLong);
    }
    /*@Override
    public List<LocalGastronomico> findByRubro(String rubro) {
        return localGastronomicoRepository.findByRubros(rubro);
    }*/

    @Override
    public List<LocalGastronomico> findByRubro(String rubro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByRubro'");
    }

   

    
}


