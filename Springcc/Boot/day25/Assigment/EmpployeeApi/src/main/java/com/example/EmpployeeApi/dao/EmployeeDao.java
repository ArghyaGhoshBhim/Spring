package com.example.EmpployeeApi.dao;

import com.example.EmpployeeApi.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    List<Employee>findAllByDept(String dept);
    List<Employee> findAllByDeptAndCityIgnoreCase(String dept, String city);
//    @Query("select a from Author a where upper(a.authorName)=upper(:name)")

    @Query("select a from Employee a where a.rating>4")
    List<Employee>findAllEmplsGetRating4();

    @Query("select a from Employee a where a.rating>4 AND lower(a.qualification)='pg'")
    List<Employee>findAllEmplsHavingRatingGet4AndArePG();


    @Query("select a from Employee a where upper(a.qualification)='UG'")
    List<Employee>findAllEmplsUG();

    @Query("select a from Employee a where a.rating>4 AND upper(a.city)=upper(:city)")
    List<Employee>findAllEmplsRatingGet4AndCity(String city);

    @Query("select a from Employee a where a.rating<3 AND lower(a.dept)='it'")
    List<Employee>findAllEmplsRatingLes3IT();


    @Query("select a from Employee a where a.rating<3")
    List<Employee>findAllEmplsRatingLes3();

    @Query("select a from Employee a where a.rating<3 AND upper(a.dept)=upper(:dept)")
    List<Employee>findAllEmplsRatingLess3AndDept(String dept);
}
