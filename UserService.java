package com.example.HMS_Project.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HMS_Project.Entity.BookingForm;
import com.example.HMS_Project.Repository.GuestBookingRepository;
@Service
public class UserService 
{
	@Autowired
	private GuestBookingRepository guestepo;
    public List<BookingForm> guestdetailAll() {
        return guestepo.findAll();
    }
     

}
