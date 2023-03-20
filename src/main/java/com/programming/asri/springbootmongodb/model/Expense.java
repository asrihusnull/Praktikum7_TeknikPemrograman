/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programming.asri.springbootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
/**
 *
 * @author Asri Husnul Rosadi
 */
@Document("expense")
public class Expense {
    @Id
    private String id;
    @Field(name = "name")
    private String expenseName;
    @Field(name = "category")
    private ExpenseCategory expenseCategory;
    @Field(name = "amount")
    private BigDecimal expenseAmount;
    
    public Expense(String id, String expenseName, ExpenseCategory expenseCategory, BigDecimal expenseAmount){
        this.id = id;
        this.expenseName = expenseName;
        this.expenseCategory = expenseCategory;
        this.expenseAmount = expenseAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(ExpenseCategory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(BigDecimal expenseAmount) {
        this.expenseAmount = expenseAmount;
    }   
}