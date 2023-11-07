package tn.esprit.springboot_angularproj.DAO.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springboot_angularproj.DAO.Entities.Reservation;
import tn.esprit.springboot_angularproj.DAO.Services.Reservation.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("reservation")
public class ReservationRestController {
    @Autowired
    IReservationService iReservationService;

    @GetMapping("/findAll")
    List<Reservation> findAll(){
        return  iReservationService.findAll();
    }

    @PostMapping("/add")
    Reservation addReservation(@RequestBody Reservation r) {
        return iReservationService.addReservation(r);
    }

    @PutMapping("update/{id}")
    Reservation updateReservation(@PathVariable("id") String id, @RequestBody Reservation r){
        return iReservationService.editReservation(id, r);
    }

    @DeleteMapping("/delete/{id}")
    void deleteReservation(@PathVariable("id") String id){
        iReservationService.deleteById(id);
    }

    @GetMapping("/{id}")
    Reservation findById(@PathVariable("id") String id){
        return iReservationService.findById(id);
    }
}
