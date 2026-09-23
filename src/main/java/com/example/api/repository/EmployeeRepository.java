package com.example.api.repository;
import com.example.api.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired private JdbcTemplate jdbc;

    public List<Employee> findAll() {
        return jdbc.query("SELECT * FROM employees", (rs, rowNum) -> new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("department"), rs.getDouble("salary")));
    }
    public Employee findById(int id) {
        return jdbc.queryForObject("SELECT * FROM employees WHERE id=?", new Object[]{id}, (rs, rowNum) -> new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("department"), rs.getDouble("salary")));
    }
    public int save(Employee e) {
        return jdbc.update("INSERT INTO employees(name,email,department,salary) VALUES(?,?,?,?)", e.getName(), e.getEmail(), e.getDepartment(), e.getSalary());
    }
    public int update(Employee e, int id) {
        return jdbc.update("UPDATE employees SET name=?, email=?, department=?, salary=? WHERE id=?", e.getName(), e.getEmail(), e.getDepartment(), e.getSalary(), id);
    }
    public int delete(int id) {
        return jdbc.update("DELETE FROM employees WHERE id=?", id);
    }
}