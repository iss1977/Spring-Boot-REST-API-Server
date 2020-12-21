package api.lkw.resourceserver.service;

import api.lkw.resourceserver.entity.*;
import api.lkw.resourceserver.repository.FzgMainRepository;
import api.lkw.resourceserver.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FzgMainService {

    // we need to use the ProductRepository repository, so we must inject an instance of it using
    @Autowired
    private FzgMainRepository repository;

    public List<FzgMain> getFahrzeuge(){
        return repository.findAll();
    }

    public FzgMain getLkwById(int id){
        return repository.findById(id).orElse(null);
    }

    public List<FzgMain> getLkwByKennzeichen(String kennzeichen){
        return repository.findByKennzeichenContaining(kennzeichen);
    }

    // methods for DELETE method
    public String deleteLkw(int id){
        repository.deleteById(id);
        return "LKW deleted! ID:"+id;
    }

    // method for PUT
    // There is no update Method in Spring Data JPA, we must "play" with the save method
    public FzgMain updateLkw (FzgMain fzgMain){
        FzgMain existingLKW = repository.findById(fzgMain.getFzg_pk()).orElse(null);

        // writing Kennzeichen Info
        if(fzgMain.getKennzeichen()!=null)
        existingLKW.setKennzeichen(fzgMain.getKennzeichen());

        // writing Dispostelle info
        Dispostelle dispostelle = fzgMain.getDispostelle();
        if(dispostelle!=null)
            existingLKW.setDispostelle(fzgMain.getDispostelle());

        // writing KfzGruppe info
        KfzGruppe kfzGruppe = fzgMain.getKfzGruppe();
        if(kfzGruppe !=null)
            existingLKW.setKfzGruppe(kfzGruppe);

        // writing Modell Sorte info
        LkwModellSorten lkwModellSorten = fzgMain.getLkwModellSorten();
        if(lkwModellSorten !=null)
            existingLKW.setLkwModellSorten(lkwModellSorten);

        // writing Schadschtoffklasse  info
        Schadstoffklasse schadstoffklasse = fzgMain.getSchadstoffklasse();
        if(schadstoffklasse !=null)
            existingLKW.setSchadstoffklasse(schadstoffklasse);

        // writing TankLayout info
        TankLayout tankLayout = fzgMain.getTankLayout();
        if(tankLayout !=null)
            existingLKW.setTankLayout(tankLayout);



        return repository.save(existingLKW);
    }


}
