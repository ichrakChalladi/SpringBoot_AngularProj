package tn.esprit.springboot_angularproj.DAO.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springboot_angularproj.DAO.Entities.Etudiant;
import tn.esprit.springboot_angularproj.DAO.Services.Etudiant.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("etudiant")
public class EtudiantRestController {
    @Autowired
    IEtudiantService iEtudiantService;

    @GetMapping("/findAll")
    List<Etudiant> findAll(){
        return  iEtudiantService.findAll();
    }

    @PostMapping("/add")
    Etudiant addEtudiant(@RequestBody Etudiant e) {
        return iEtudiantService.addEtudiant(e);
    }

    @PutMapping("update/{id}")
    Etudiant updateEtudiant(@PathVariable("id") Long id, @RequestBody Etudiant e){
        return iEtudiantService.editEtudiant(id, e);
    }

    @DeleteMapping("/delete/{id}")
    void deleteEtudiant(@PathVariable("id") Long id){
        iEtudiantService.deleteById(id);
    }

    @GetMapping("/{id}")
    Etudiant findById(@PathVariable("id") Long id){
        return iEtudiantService.findById(id);
    }
}
