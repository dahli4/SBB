package com.example.sbb.answer;

import com.example.sbb.question.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Answer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(columnDefinition = "TEXT")
  private String content;

  private LocalDateTime createDate;

  //질문 하나에 여러 답변이 달릴 수 있음.
  @ManyToOne
  private Question question;
}
