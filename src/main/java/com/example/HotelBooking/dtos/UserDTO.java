package com.example.HotelBooking.dtos;

import com.example.HotelBooking.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

    private Long id;

    private String email;

    private String password;
    private String firstName;
    private String lastName;

    private String phoneNumber;

    private UserRole role;  // e.g CUSTOMER, ADMIN

    private Boolean isActive;
    private LocalDateTime createdAt;

}
