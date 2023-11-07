package tn.esprit.springboot_angularproj.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springboot_angularproj.DAO.Entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
