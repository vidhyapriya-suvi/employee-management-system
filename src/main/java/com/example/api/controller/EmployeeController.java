package com.example.api.controller;
import com.example.api.model.Employee;
import com.example.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin
public class EmployeeController {
    @Autowired private EmployeeService service;

    @GetMapping public List<Employee> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Employee getOne(@PathVariable int id) { return service.getById(id); }
    @PostMapping public String create(@RequestBody Employee emp) { return service.add(emp); }
    @PutMapping("/{id}") public String update(@RequestBody Employee emp, @PathVariable int id) { return service.update(emp, id); }
    @DeleteMapping("/{id}") public String delete(@PathVariable int id) { return service.delete(id); }
}