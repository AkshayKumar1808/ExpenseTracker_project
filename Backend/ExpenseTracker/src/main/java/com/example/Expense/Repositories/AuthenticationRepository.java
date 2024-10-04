package com.example.Expense.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Expense.entities.Authentication;

@Repository
public interface AuthenticationRepository extends JpaRepository<Authentication, Integer> {

}
