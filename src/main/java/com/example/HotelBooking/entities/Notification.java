package com.example.HotelBooking.entities;

import com.example.HotelBooking.enums.NotificationType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;

    @NotBlank(message = "Recipient is required")
    private String recipient;

    private String body;

    private String bookingReference;

    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;


    private final LocalDateTime createdAt = LocalDateTime.now();
}
