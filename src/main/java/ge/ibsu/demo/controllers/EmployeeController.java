package ge.ibsu.demo.controllers;


import ge.ibsu.demo.entities.Employees;
import ge.ibsu.demo.services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;

    }
    @GetMapping("/all")
    private List<Employees> getAll(){
        return employeeService.getAll();
    }
    @GetMapping("/{id}")
    private Employees getbyId(@PathVariable Long id ) throws Exception{
        return employeeService.getById(id);
    }
}
