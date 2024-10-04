package com.example.Expense.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Expense.Repositories.ExpenseRepository;
import com.example.Expense.entities.Expense;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepo;
	@Override
	public List<Expense> getAllExpense() {
		
		return expenseRepo.findAll();
	}

	@Override
	public Expense addNewExpense(Expense expense) {
		
		return expenseRepo.save(expense);
	}

	@Override
	public void updateExpense(Expense expense, int id) {
		expenseRepo.updateEx(
				expense.getName(),
				expense.getAmount(),
				expense.getDate(),
				expense.getDescription(),
				id
				);
	}

	@Override
	public Expense searchById(int id) {
		Expense e=null;
		try {
		 e=expenseRepo.getById(id);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return e;
	}

	@Override
	public void deleteExpense(int id) {
		Expense e=expenseRepo.getById(id);
		if(e!=null) {
			expenseRepo.delete(e);
		}
	}

}
