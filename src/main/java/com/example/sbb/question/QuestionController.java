package com.example.sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {

  private final QuestionService questionService;

  @GetMapping("/list")
  public String list(Model model) {
    List<Question> questionsList = questionService.getList();
    model.addAttribute("questionList", questionsList);
    return "question_list";
  }

  @GetMapping(value = "/detail/{id}")
  public String detail(@PathVariable("id") Integer id, Model model) {
    Question question = this.questionService.getQuestion(id);
    model.addAttribute("question", question);
    return "question_detail";
  }
}
