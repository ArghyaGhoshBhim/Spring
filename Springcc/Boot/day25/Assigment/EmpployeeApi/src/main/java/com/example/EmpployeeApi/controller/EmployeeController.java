package com.example.EmpployeeApi.controller;


import com.example.EmpployeeApi.entity.Employee;
import com.example.EmpployeeApi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @PostMapping
    public ResponseEntity<Object>saveEmployee(@RequestBody Employee employee){
        Employee response=employeeService.saveEmployee(employee);
        return new ResponseEntity<Object>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Employee>>getAllEmp(){
        List<Employee>response=employeeService.getAllEmp();
        return new ResponseEntity<List<Employee>>(response, HttpStatus.FOUND);
    }

    @PutMapping
    public ResponseEntity<Object>updateEmployee(@RequestBody Employee employee){
        Employee respose=employeeService.updateEmployee(employee);
        if(respose==null){
            return new ResponseEntity<Object>("Not able to update", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Object>(respose, HttpStatus.CREATED);
    }


    @DeleteMapping("delete/{id}")
    public ResponseEntity<String>deleteEmployee(@PathVariable int id){
        String response= employeeService.deleteEmployee(id);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

    @GetMapping("findbydept/{dept}")
    public ResponseEntity<Object>findAllEmplsByDept(@PathVariable String dept){
        List<Employee>response=employeeService.findAllEmplsByDept(dept);
        if(response.isEmpty()){
            return new ResponseEntity<Object>("Department not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Object>(response, HttpStatus.FOUND);
    }



    @GetMapping("findbydeptandcity/{dept}/{city}")
    public ResponseEntity<Object>findAllEmplsByDeptAndCity(@PathVariable String dept, @PathVariable String city){
        List<Employee> response=employeeService.findAllEmplsByDeptAndCity(dept, city);
        if(response.isEmpty()){
            return new ResponseEntity<Object>("Employee not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Object>(response, HttpStatus.FOUND);
    }


    @GetMapping("findAllAmplsGetRating4")
    public ResponseEntity<Object>findAllAmplsGetRating4(){
        List<Employee>response=employeeService.findAllAmplsGetRating4();
        return new ResponseEntity<Object>(response, HttpStatus.FOUND);
    }


    @GetMapping("findAllEmplsHavingRatingGet4AndArePG")
    public ResponseEntity<Object>findAllEmplsHavingRatingGet4AndArePG(){
        List<Employee>response=employeeService.findAllEmplsHavingRatingGet4AndArePG();
        return new ResponseEntity<Object>(response, HttpStatus.FOUND);
    }

    @GetMapping("findAllEmplsUG")
    public ResponseEntity<Object>findAllEmplsUG(){
        List<Employee>response=employeeService.findAllEmplsUG();
        return new ResponseEntity<Object>(response, HttpStatus.FOUND);
    }

    @GetMapping("findAllEmplsRatingGet4AndCity/{city}")
    public ResponseEntity<Object>findAllEmplsRatingGet4AndCity(@PathVariable String city){
        List<Employee>response=employeeService.findAllEmplsRatingGet4AndCity(city);
        return new ResponseEntity<Object>(response, HttpStatus.FOUND);
    }


    @GetMapping("findAllEmplsRatingLes3IT")
    public ResponseEntity<Object>findAllEmplsRatingLes3IT(){
        List<Employee>response=employeeService.findAllEmplsRatingLes3IT();
        return new ResponseEntity<Object>(response, HttpStatus.FOUND);
    }

    @GetMapping("findAllEmplsRatingLes3")
    public ResponseEntity<Object>findAllEmplsRatingLes3(){
        List<Employee>response=employeeService.findAllEmplsRatingLes3();
        return new ResponseEntity<Object>(response, HttpStatus.FOUND);
    }

    @GetMapping("findAllEmplsRatingLess3AndDept/{dept}")
    public ResponseEntity<Object>findAllEmplsRatingLess3AndDept(@PathVariable String dept){
        List<Employee>response=employeeService.findAllEmplsRatingLess3AndDept(dept);
        return new ResponseEntity<Object>(response, HttpStatus.FOUND);
    }
}
