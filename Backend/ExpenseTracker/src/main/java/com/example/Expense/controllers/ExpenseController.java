package com.example.Expense.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Expense.entities.Expense;
import com.example.Expense.services.ExpenseService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api")
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/getall")
	public List<Expense>getExpense(){
		return expenseService.getAllExpense();
	}
	@PostMapping("/add")
	public Expense addExpense(@RequestBody Expense expense) {
		return expenseService.addNewExpense(expense);
	}
	@PutMapping("/expup/{id}")
	public void updateExpense(@RequestBody Expense expense,@PathVariable int id) {
		expenseService.updateExpense(expense, id);
	}
	@GetMapping("/{id}")
	public Expense getExpenses(@PathVariable int id) {
		return expenseService.searchById(id);
	}
	@DeleteMapping("/{id}")
	public void deleteExpense(@PathVariable int id) {
		expenseService.deleteExpense(id);
	}
}
