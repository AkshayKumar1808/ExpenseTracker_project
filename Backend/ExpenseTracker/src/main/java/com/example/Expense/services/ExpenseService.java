package com.example.Expense.services;

import java.util.List;

import com.example.Expense.entities.Expense;

public interface ExpenseService {

	List<Expense>getAllExpense();
	Expense addNewExpense(Expense expense);
	void updateExpense(Expense expense,int id);
	Expense searchById(int id);
	void deleteExpense(int id);
}
