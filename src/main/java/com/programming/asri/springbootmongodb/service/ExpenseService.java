/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programming.asri.springbootmongodb.service;

import com.programming.asri.springbootmongodb.model.Expense;
import com.programming.asri.springbootmongodb.repository.ExpenseRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asri Husnul Rosadi
 */

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;
    
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    
    public void addExpense(Expense expense){
        expenseRepository.insert(expense);
    }
    
    public void updateExpense(Expense expense){
        Expense savedExpense = expenseRepository.findById(expense.getId())
            .orElseThrow(()->new RuntimeException(
          String.format("Cannot Find Expense by ID %s", expense.getId())));
        
        savedExpense.setExpenseName(expense.getExpenseName());
        savedExpense.setExpenseCategory(expense.getExpenseCategory());
        savedExpense.setExpenseAmount(expense.getExpenseAmount());
        
        expenseRepository.save(expense);
    }
    
    public List<Expense> getAllExpense(){
        return expenseRepository.findAll();
    }
    
    public Expense getExpenseByName(String name){
        return expenseRepository.findByName(name).orElseThrow(()->new RuntimeException(
         String.format("Cannot Find Expense by Name %s", name)));
    }
    
    public void deleteExpense(String id){
        expenseRepository.deleteById(id);
    }
}