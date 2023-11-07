package tn.esprit.springboot_angularproj.DAO.Services.Chambre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springboot_angularproj.DAO.Entities.Chambre;
import tn.esprit.springboot_angularproj.DAO.Repositories.ChambreRepository;

import java.util.List;

@Service
public class ChambreService implements IChambreService {

    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> addChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public Chambre editChambre(Long id, Chambre c) {
        if(chambreRepository.findById(id).isPresent()){
            Chambre toUpdateChambre = chambreRepository.findById(id).get();
            toUpdateChambre.setNumeroChambre(c.getNumeroChambre());
            toUpdateChambre.setTypeChambre(c.getTypeChambre());
            toUpdateChambre.setBloc(c.getBloc());
            toUpdateChambre.setReservations(c.getReservations());
            return chambreRepository.save(toUpdateChambre);
        }
        return null;
    }

    @Override
    public List<Chambre> findAll() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findById(long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public void deleteById(long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public void delete(Chambre c) {
        chambreRepository.delete(c);
    }
}
