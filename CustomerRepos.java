package com.example.demo.dai.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dai.entities.Customer;

public interface CustomerRepos extends JpaRepository<Customer, Long> {

}
