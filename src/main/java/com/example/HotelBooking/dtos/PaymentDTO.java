package com.example.HotelBooking.dtos;

import com.example.HotelBooking.entities.User;
import com.example.HotelBooking.enums.PaymentGateway;
import com.example.HotelBooking.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {

    private Long id;

    private BookingDTO booking;

    private String transactionId;

    private BigDecimal amount;

    private PaymentGateway paymentMethod;   // e.g PAYPAL, STRIPE

    private LocalDateTime paymentDate;

    private PaymentStatus status;   // e.g COMPLETED, FAILED

    private String bookingReference;
    private String failureReason;


    private String approvalLink;    // paypal payment approval


}
