package com.example.sbb.question;

import com.example.sbb.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class QuestionService {
  private final QuestionRepositroy questionRepositroy;

  public List<Question> getList() {
    return this.questionRepositroy.findAll();
  }

  public Question getQuestion(Integer id) {
    Optional<Question> question = this.questionRepositroy.findById(id);
    if (question.isPresent()) {
      return question.get();
    } else {
      throw new DataNotFoundException("question not found");
    }
  }
}
