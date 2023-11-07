package tn.esprit.springboot_angularproj.DAO.Services.Reservation;

import tn.esprit.springboot_angularproj.DAO.Entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation r);

    List<Reservation> addReservations(List<Reservation> reservations);
    Reservation editReservation(String id, Reservation r);
    List<Reservation> findAll();
    Reservation findById(String id);
    void deleteById(String id);
    void delete(Reservation r);
}
