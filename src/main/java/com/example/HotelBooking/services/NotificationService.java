package com.example.HotelBooking.services;

import com.example.HotelBooking.dtos.NotificationDTO;

public interface NotificationService {

    void sendMail(NotificationDTO notificationDTO);

    void sendSms();

    void sendWhatsapp();
}
