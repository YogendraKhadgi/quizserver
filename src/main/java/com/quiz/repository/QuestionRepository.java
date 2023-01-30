package com.quiz.repository;

import com.quiz.entity.exam.Question;
import com.quiz.entity.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    Set<Question> findByQuiz(Quiz quiz);
}
