package com.example.sbb.question;

import com.example.sbb.answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Question {
  //GeneratedValue로 속성값을 자동으로 증가, IDENTITY - 고유 번호를 생성
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(length = 200)
  private String subject;

  @Column(columnDefinition = "TEXT")
  private String content;

  private LocalDateTime createDate;

  //참조 엔티티의 속성명을 mappedBy에 정의. Answer의 question
  //질문과 답변은 1:N 관계. 질문 하나에 여러개 답변이 달리니 Answer를 List로 구성.
  @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
  private List<Answer> answerList;
}
