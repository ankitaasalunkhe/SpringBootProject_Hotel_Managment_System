package com.example.HMS_Project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HMS_Project.Entity.BookingForm;

public interface GuestBookingRepository extends JpaRepository<BookingForm, Integer>
{

	

}
