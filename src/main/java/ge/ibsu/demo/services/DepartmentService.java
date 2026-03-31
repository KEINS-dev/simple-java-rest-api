package ge.ibsu.demo.services;

import ge.ibsu.demo.entities.Departament;
import ge.ibsu.demo.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Departament> getAll(){
        return departmentRepository.findAll();
    }

    public Departament getById(long id)throws Exception{
        return departmentRepository.findById(id).orElseThrow(() ->  new Exception("department_not_found"));
    }

}
