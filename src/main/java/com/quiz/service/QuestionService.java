package com.quiz.service;

import com.quiz.entity.exam.Question;
import com.quiz.entity.exam.Quiz;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface QuestionService {
    public Question addQuestion(Question question);
    public Question updateQuestion(Question question);
    public Set<Question> getQuestions();
    public Question getQuestion(Long qId);
    public void deleteQuestion(Long qId);
    public Set<Question> getQuestionsOfQuiz(Quiz quiz);
    public Question get(Long questionId);
}
