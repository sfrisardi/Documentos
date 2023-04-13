package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ITaskDao extends CrudRepository<Task, Long>{

}
