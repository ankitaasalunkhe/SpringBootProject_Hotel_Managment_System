package com.example.HMS_Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HMS_Project.Entity.EmployeeDetails;

public interface EmployeeReposistory extends JpaRepository<EmployeeDetails, Integer>
{
	

}
