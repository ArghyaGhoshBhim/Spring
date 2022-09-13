package com.springCRUD.springCrud.dao;

import com.springCRUD.springCrud.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthDao extends CrudRepository<Author, Integer> {

}
