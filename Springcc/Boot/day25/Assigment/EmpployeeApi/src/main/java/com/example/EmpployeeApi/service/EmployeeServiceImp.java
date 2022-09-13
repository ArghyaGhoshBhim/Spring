package com.example.EmpployeeApi.service;


import com.example.EmpployeeApi.dao.EmployeeDao;
import com.example.EmpployeeApi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public Employee saveEmployee(Employee employee) {
        if(employee!=null){
            return employeeDao.save(employee);
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmp() {
        return (List<Employee>)employeeDao.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee updateEmp;
        for (Employee emp:employeeDao.findAll()){
            if(emp.getEmpId()==employee.getEmpId()){
                employeeDao.delete(emp);
                employeeDao.save(employee);
                return emp;
            }
        }
        return null;
    }

    @Override
    public String deleteEmployee(int id) {
        for(Employee emp:getAllEmp()){
            if(emp.getEmpId()==id){
                employeeDao.deleteById(id);
                return "Delete successfuly";
            }
        }
        return "Not able to delete";
    }

    @Override
    public List<Employee> findAllEmplsByDept(String dept) {
        List<Employee>listOfEmp=employeeDao.findAllByDept(dept);
        return listOfEmp;
    }

    @Override
    public List<Employee> findAllEmplsByDeptAndCity(String dept, String city) {
        List<Employee>employeeList=employeeDao.findAllByDeptAndCityIgnoreCase(dept, city);
        return employeeList;
    }

    @Override
    public List<Employee> findAllAmplsGetRating4() {
        List<Employee>employeeList=employeeDao.findAllEmplsGetRating4();
        return employeeList;
    }

    @Override
    public List<Employee> findAllEmplsHavingRatingGet4AndArePG() {
        List<Employee>employeeList=employeeDao.findAllEmplsHavingRatingGet4AndArePG();
        return employeeList;
    }

    @Override
    public List<Employee> findAllEmplsUG() {
        List<Employee>employeeList=employeeDao.findAllEmplsUG();
        return employeeList;
    }

    @Override
    public List<Employee> findAllEmplsRatingGet4AndCity(String city) {
        List<Employee>employeeList=employeeDao.findAllEmplsRatingGet4AndCity(city);
        return employeeList;
    }

    @Override
    public List<Employee> findAllEmplsRatingLes3IT() {
        List<Employee>employeeList=employeeDao.findAllEmplsRatingLes3IT();
        return employeeList;
    }
    @Override
    public List<Employee> findAllEmplsRatingLes3() {
        List<Employee>employeeList=employeeDao.findAllEmplsRatingLes3();
        return employeeList;
    }

    @Override
    public List<Employee> findAllEmplsRatingLess3AndDept(String dept) {
        List<Employee>employeeList=employeeDao.findAllEmplsRatingLess3AndDept(dept);
        return employeeList;
    }
}
