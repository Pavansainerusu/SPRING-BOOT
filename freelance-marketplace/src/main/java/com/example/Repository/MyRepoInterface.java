package com.example.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Model.DataFile;

public interface MyRepoInterface extends CrudRepository<DataFile,Long>{

}
