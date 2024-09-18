package com.example.sbb;

import com.example.sbb.question.Question;
import com.example.sbb.question.QuestionRepositroy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SbbApplicationTests {
  @Autowired
  private QuestionRepositroy questionRepositroy;

  @Test
  void contextLoads() {
    Optional<Question> oq = questionRepositroy.findById(1);
    if(oq.isPresent()) {
      Question q = oq.get();
      assertEquals("sbb?", q.getSubject());
    }
  }

}
