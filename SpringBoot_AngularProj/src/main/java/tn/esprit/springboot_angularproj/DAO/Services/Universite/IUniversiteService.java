package tn.esprit.springboot_angularproj.DAO.Services.Universite;

import tn.esprit.springboot_angularproj.DAO.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite u);

    List<Universite> addUniversites(List<Universite> foyers);
    Universite editUniversite(Long id, Universite u);
    List<Universite> findAll();
    Universite findById(long id);
    void deleteById(long id);
    void delete(Universite u);
}
