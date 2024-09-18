package com.example.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepositroy extends JpaRepository<Question, Integer> {
}
