package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reservations")
public class ReservationController {
	 @Autowired private ReservationRepository reservationRepo;

	    @PostMapping
	    public Reservation createReservation(@RequestBody Reservation reservation) {
	        return reservationRepo.save(reservation);
	    }

	    @GetMapping
	    public List<Reservation> getAllReservations() {
	        return reservationRepo.findAll();
	    }

	    @PutMapping("/{id}")
	    public Reservation updateReservation(@PathVariable String id, @RequestBody Reservation reservation) {
	        reservation.setId(id);
	        return reservationRepo.save(reservation);
	    }
	}