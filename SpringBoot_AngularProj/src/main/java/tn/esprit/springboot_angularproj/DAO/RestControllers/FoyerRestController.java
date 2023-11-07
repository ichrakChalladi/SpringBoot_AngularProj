package tn.esprit.springboot_angularproj.DAO.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springboot_angularproj.DAO.Entities.Foyer;
import tn.esprit.springboot_angularproj.DAO.Services.Foyer.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("foyer")
public class FoyerRestController {
    @Autowired
    IFoyerService iFoyerService;

    @GetMapping("/findAll")
    List<Foyer> findAll(){
        return  iFoyerService.findAll();
    }

    @PostMapping("/add")
    Foyer addFoyer(@RequestBody Foyer f) {
        return iFoyerService.addFoyer(f);
    }

    @PutMapping("update/{id}")
    Foyer updateFoyer(@PathVariable("id") Long id, @RequestBody Foyer f){
        return iFoyerService.editFoyer(id, f);
    }

    @DeleteMapping("/delete/{id}")
    void deleteFoyer(@PathVariable("id") Long id){
        iFoyerService.deleteById(id);
    }

    @GetMapping("/{id}")
    Foyer findById(@PathVariable("id") Long id){
        return iFoyerService.findById(id);
    }
}
