package com.example.HotelBooking.dtos;


import com.example.HotelBooking.enums.RoomType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoomDTO {

    private Long id;

    private Integer roomNumber;

    private RoomType type;

    private BigDecimal pricePerNight;

    private Integer capacity;

    private String description; // additional data for the room
    private String imageUrl;    // this will hold the room picture

}
