package tn.esprit.springboot_angularproj.DAO.Services.Universite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springboot_angularproj.DAO.Entities.Universite;
import tn.esprit.springboot_angularproj.DAO.Repositories.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteService implements IUniversiteService{
    @Autowired
    private UniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public List<Universite> addUniversites(List<Universite> universites) {
        return universiteRepository.saveAll(universites);
    }

    @Override
    public Universite editUniversite(Long id, Universite u) {
        if(universiteRepository.findById(id).isPresent()){
            Universite toUpdateUniversite = universiteRepository.findById(id).get();
            toUpdateUniversite.setNomUniversite(u.getNomUniversite());
            toUpdateUniversite.setAdresse(u.getAdresse());
            toUpdateUniversite.setFoyer(u.getFoyer());

            return universiteRepository.save(toUpdateUniversite);
        }
        return null;
    }

    @Override
    public List<Universite> findAll() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite findById(long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public void deleteById(long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public void delete(Universite e) {
        universiteRepository.delete(e);
    }
}
