package api.lkw.resourceserver.controller;

import api.lkw.resourceserver.entity.FzgMain;
import api.lkw.resourceserver.entity.Product;
import api.lkw.resourceserver.service.FzgMainService;
import api.lkw.resourceserver.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin
public class FzgMainController {

    @Autowired
    private FzgMainService service;


    @GetMapping("/lkws")
    public List<FzgMain> findAllFahrzeuge(){
        return service.getFahrzeuge();
    }


    @RequestMapping(value = "/lkw/{id}", method = RequestMethod.GET) //andere möglichkeit // @GetMapping("/lkw/{id}")
    public FzgMain getLkwById(@PathVariable Integer id){ // @RequestParam is also posible here, but you must change :@GetMapping("/product/{id}") or you get 404
        return service.getLkwById(id);
    }



    @RequestMapping(value="/",method = RequestMethod.GET) //andere möglichkeit @GetMapping("/lkw/{kennz}")
    public List<FzgMain> findLkwByKennzeichen(@RequestParam(value="kennzeichen") String  kennzeichen){
        return service.getLkwByKennzeichen(kennzeichen);
    }

    @RequestMapping(value="/lkw/{id}",method = RequestMethod.DELETE)
    public String deleteProduct(@PathVariable("id") int id){
        return service.deleteLkw(id);
    }

    @RequestMapping(value="/lkw/{id}",method = RequestMethod.PUT)
    public FzgMain updateLkw(@RequestBody FzgMain fzgMain){ // this is our PUT method. with @RequestBody we parse the incoming JSON to the Product class
        return service.updateLkw(fzgMain);
    }


}
