package com.example.EmpployeeApi.service;


import com.example.EmpployeeApi.entity.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee>getAllEmp();
    Employee updateEmployee(Employee employee);
    String deleteEmployee(int id);
    List<Employee>findAllEmplsByDept(String dept);
    List<Employee>findAllEmplsByDeptAndCity(String dept, String city);
    List<Employee>findAllAmplsGetRating4();
    List<Employee>findAllEmplsHavingRatingGet4AndArePG();
    List<Employee>findAllEmplsUG();
    List<Employee>findAllEmplsRatingGet4AndCity(String city);
    List<Employee>findAllEmplsRatingLes3IT();

    List<Employee>findAllEmplsRatingLes3();
    List<Employee>findAllEmplsRatingLess3AndDept(String dept);
}
