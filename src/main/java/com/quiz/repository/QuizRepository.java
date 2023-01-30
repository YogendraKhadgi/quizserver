package com.quiz.repository;

import com.quiz.entity.exam.Category;
import com.quiz.entity.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findByCategory(Category category);


    List<Quiz> findByActive(Boolean b);

    List<Quiz> findByCategoryAndActive(Category c, Boolean b);

}
