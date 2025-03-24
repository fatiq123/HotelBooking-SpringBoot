package com.example.HotelBooking.services;

import com.example.HotelBooking.entities.BookingReference;
import com.example.HotelBooking.repositories.BookingReferenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class BookingCodeGenerator {

    private final BookingReferenceRepository bookingReferenceRepository;

    public String generateBookingReference() {
        String bookingReference;

        // keep generating until a unique code is found
        do {
            bookingReference = generateRandomAlphaNumericCode(10);
        } while (isBookingReferenceExist(bookingReference));    // check if the code already exist. If it doesn't exist regenerate

        saveBookingReferenceToDatabase(bookingReference);

        return bookingReference;
    }

    private String generateRandomAlphaNumericCode(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        Random random = new Random();
        StringBuilder builder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int character = random.nextInt(characters.length());
            builder.append(characters.charAt(character));
        }

        return builder.toString();
    }

    private boolean isBookingReferenceExist(String bookingReference) {
        return bookingReferenceRepository.findByReferenceNumber(bookingReference).isPresent();
    }

    private void saveBookingReferenceToDatabase(String bookingReference) {

        BookingReference newBookingReference = BookingReference.builder()
                .referenceNumber(bookingReference)
                .build();

        bookingReferenceRepository.save(newBookingReference);
    }

}
