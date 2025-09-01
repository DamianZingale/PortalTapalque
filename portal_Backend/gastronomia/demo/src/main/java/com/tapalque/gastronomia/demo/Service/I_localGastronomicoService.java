package com.tapalque.gastronomia.demo.Service;

import java.util.List;

import com.tapalque.gastronomia.demo.Entity.LocalGastronomico;

public interface I_localGastronomicoService {

    
    void addLocalGastronomico(LocalGastronomico localGastronomico);
    LocalGastronomico getLocalGastronomicoById(Long id);
    List<LocalGastronomico> getAllLocalGastronomicos();
    void updateLocalGastronomico(LocalGastronomico localGastronomico);
    void deleteLocalGastronomico(int id);
    List<LocalGastronomico> findByRubro(String rubro);

   
}
