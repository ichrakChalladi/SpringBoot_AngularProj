package tn.esprit.springboot_angularproj.DAO.Services.Chambre;

import tn.esprit.springboot_angularproj.DAO.Entities.Chambre;

import java.util.List;


public interface IChambreService {
    Chambre addChambre(Chambre b);

    List<Chambre> addChambres(List<Chambre> blocs);
    Chambre editChambre(Long id, Chambre b);
    List<Chambre> findAll();
    Chambre findById(long id);
    void deleteById(long id);
    void delete(Chambre b);
}
