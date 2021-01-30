package com.rohit.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.expensetracker.model.Expense;
import com.rohit.expensetracker.service.ExpenseService;

@CrossOrigin("*") // * means any request coming from outside of the application allow them
@Controller
@RequestMapping("/api/v1")
public class ExpenseController {

	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/expenses")
	public ResponseEntity<List<Expense>> get(){
		List<Expense> expenses=expenseService.findAll();
		return new ResponseEntity<List<Expense>>(expenses,HttpStatus.OK);
	}
	
	
	@PostMapping("/expenses")
	public ResponseEntity<Expense> save(@RequestBody Expense expense){
		Expense expenseOne=expenseService.save(expense);
		return new ResponseEntity<Expense>(expenseOne,HttpStatus.OK);
	}
	
}
