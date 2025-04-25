package com.amazon.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.Model.Orders;

public interface Dao extends JpaRepository<Orders, String>{

}
