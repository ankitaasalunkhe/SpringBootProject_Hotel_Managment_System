package com.example.HMS_Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.HMS_Project.Entity.BookingForm;
import com.example.HMS_Project.Entity.User;


public interface UserRepository extends JpaRepository<User, Long>
{
	@Query("Select u from User u where u.email=?1")
	public User findByEmail(String email);

	public void save(BookingForm book);


}
