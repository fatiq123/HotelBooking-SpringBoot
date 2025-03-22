package com.example.HotelBooking.repositories;

import com.example.HotelBooking.entities.Notification;
import com.example.HotelBooking.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {


}
