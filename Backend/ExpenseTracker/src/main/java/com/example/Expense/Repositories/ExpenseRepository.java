package com.example.Expense.Repositories;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Expense.entities.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
	
	@Modifying
	@Transactional
	@Query("update Expense e set e.name=:name,e.amount=:amount,e.date=:date,e.description=:description where e.id=:id")
	void updateEx(
			@Param("name") String name,
			@Param("amount") double amount,
			@Param("date") Date date,
			@Param("description") String description,
			@Param("id") int id
			);
	@Query("from Expense e where e.id=:id")
	Expense getById(@Param("id") int id);
}
