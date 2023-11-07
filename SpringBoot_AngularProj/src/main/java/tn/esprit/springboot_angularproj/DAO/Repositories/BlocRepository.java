package tn.esprit.springboot_angularproj.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springboot_angularproj.DAO.Entities.Bloc;
import tn.esprit.springboot_angularproj.DAO.Entities.Foyer;
import tn.esprit.springboot_angularproj.DAO.Entities.Universite;

import java.util.List;


public interface BlocRepository extends JpaRepository<Bloc, Long> {
    List<Bloc> findByNomBloc(String nomBloc);
    List<Bloc> findByCapaciteBloc(Long capaciteBloc);
    List<Bloc> findByNomBlocAndCapaciteBloc(String nomBloc, Long capaciteBloc);
    List<Bloc> findByNomBlocIgnoreCase(String nomBloc);
    List<Bloc> findByCapaciteBlocGreaterThan(Long capaciteBloc);
    List<Bloc> findByNomBlocContains(String nomBloc);
    //List<Bloc> findAllByNomBlocOrderByNomBlocAsc();
    List<Bloc> findByNomBlocOrCapaciteBloc(String nomBloc, Long capaciteBloc);
    List<Bloc> findByFoyer(Foyer foyer);
    List<Bloc> findByFoyerUniversite(Universite universite);
}
