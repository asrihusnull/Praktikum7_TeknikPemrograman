/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.programming.asri.springbootmongodb.repository;

import com.programming.asri.springbootmongodb.model.Expense;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Asri Husnul Rosadi
 */
public interface ExpenseRepository extends MongoRepository<Expense, String>{  
    @Query("{'name': ?0}")
    Optional<Expense> findByName(String name);
}
