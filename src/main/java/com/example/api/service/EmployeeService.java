package com.example.api.service;
import com.example.api.model.Employee;
import com.example.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

    @Service
    public class EmployeeService {
        @Autowired private EmployeeRepository repo;
        public List<Employee> getAll() { return repo.findAll(); }
        public Employee getById(int id) { return repo.findById(id); }
        public String add(Employee e) { repo.save(e); return "Employee Added Successfully"; }
        public String update(Employee e, int id) { repo.update(e, id); return "Employee Updated"; }
        public String delete(int id) { repo.delete(id); return "Employee Deleted"; }
    }

