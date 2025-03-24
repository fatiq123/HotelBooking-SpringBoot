package com.example.HotelBooking.services;

import com.example.HotelBooking.dtos.LoginRequest;
import com.example.HotelBooking.dtos.RegisterRequest;
import com.example.HotelBooking.dtos.Response;
import com.example.HotelBooking.dtos.UserDTO;
import com.example.HotelBooking.entities.User;

public interface UserService {

    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    Response getOwnAccountDetails();

    User getCurrentLoggedInUser();

    Response updateOwnAccount(UserDTO userDTO);

    Response deleteOwnAccount();

    Response getMyBookingHistory();

}
