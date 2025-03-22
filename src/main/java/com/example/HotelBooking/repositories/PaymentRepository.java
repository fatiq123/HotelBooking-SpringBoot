package com.example.HotelBooking.repositories;

import com.example.HotelBooking.entities.Payment;
import com.example.HotelBooking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {


}
