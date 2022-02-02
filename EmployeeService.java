package com.example.HMS_Project.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.HMS_Project.Entity.EmployeeDetails;
import com.example.HMS_Project.Repository.EmployeeReposistory;

@Service
@Transactional
public class EmployeeService 
{
	@Autowired
    private EmployeeReposistory repo;
     
    public List<EmployeeDetails> listAll() {
        return repo.findAll();
    }
     
    public void save(EmployeeDetails employeeDetails) {
        repo.save(employeeDetails);
    }
     
    public EmployeeDetails get(int id) {
        return repo.findById(id).get();
    }
     
    public void delete(int id) {
        repo.deleteById(id);
    }
	

}
