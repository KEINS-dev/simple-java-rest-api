package ge.ibsu.demo.services;

import ge.ibsu.demo.entities.Employees;
import ge.ibsu.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public List<Employees> getAll(){
        return employeeRepository.findAll();
    }
    public Employees getById(Long id) throws Exception{
        return employeeRepository.findById(id).orElseThrow(()-> new Exception("emplyee_not_founded"));
    }

}
