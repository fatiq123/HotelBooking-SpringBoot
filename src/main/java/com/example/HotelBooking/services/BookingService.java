package com.example.HotelBooking.services;

import com.example.HotelBooking.dtos.BookingDTO;
import com.example.HotelBooking.dtos.Response;

public interface BookingService {

    Response getAllBookings();

    Response createBooking(BookingDTO bookingDTO);

    Response findBookingByReferenceNo(String bookingReferenceNo);

    Response updateBooking(BookingDTO bookingDTO);

}
