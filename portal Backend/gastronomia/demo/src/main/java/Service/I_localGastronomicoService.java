package Service;

import java.util.List;

import com.tapalque.gastronomia.demo.Entity.LocalGastronomico;

public interface I_localGastronomicoService {

    
    void addLocalGastronomico(LocalGastronomico localGastronomico);
    LocalGastronomico getLocalGastronomicoById(int id);
    List<LocalGastronomico> getAllLocalGastronomicos();
    void updateLocalGastronomico(LocalGastronomico localGastronomico);
    void deleteLocalGastronomico(int id);
}
