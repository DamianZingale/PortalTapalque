package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tapalque.gastronomia.demo.Entity.LocalGastronomico;

public class LocalGastronomicoService {

    @Autowired
    I_localGastronomicoService localGastronomicoService;
    public void addLocalGastronomico(LocalGastronomico localGastronomico) {
        localGastronomicoService.addLocalGastronomico(localGastronomico);
    }
    public LocalGastronomico getLocalGastronomicoById(int id) {
        return localGastronomicoService.getLocalGastronomicoById(id);
    }   
    public List<LocalGastronomico> getAllLocalGastronomicos() {
        return localGastronomicoService.getAllLocalGastronomicos();
    }
    public void updateLocalGastronomico(LocalGastronomico localGastronomico) {
        localGastronomicoService.updateLocalGastronomico(localGastronomico);
    }

    public void deleteLocalGastronomico(int id) {
        localGastronomicoService.deleteLocalGastronomico(id);
    }
    public I_localGastronomicoService getLocalGastronomicoService() {
        return localGastronomicoService;
    }
}
