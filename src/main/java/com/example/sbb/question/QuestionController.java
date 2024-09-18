package com.example.sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {

  private final QuestionRepositroy questionRepositroy;

  @GetMapping("/list")
  public String list(Model model) {
    List<Question> questionsList = questionRepositroy.findAll();
    model.addAttribute("questionList", questionsList);
    return "question_list";
  }
}
