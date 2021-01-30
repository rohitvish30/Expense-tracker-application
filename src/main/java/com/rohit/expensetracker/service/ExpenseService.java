package com.rohit.expensetracker.service;

import java.util.List;

import com.rohit.expensetracker.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();
	
	Expense save(Expense expense);
}
