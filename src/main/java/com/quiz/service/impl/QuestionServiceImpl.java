package com.quiz.service.impl;

import com.quiz.entity.exam.Question;
import com.quiz.entity.exam.Quiz;
import com.quiz.repository.QuestionRepository;
import com.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question addQuestion(Question question) {
        return this.questionRepository.save(question);
    }

    @Override
    public Question updateQuestion(Question question) {
        return this.questionRepository.save(question);
    }

    @Override
    public Set<Question> getQuestions() {
        return new HashSet<>(this.questionRepository.findAll());
    }

    @Override
    public Question getQuestion(Long qId) {
        return this.questionRepository.findById(qId).get();
    }


    @Override
    public void deleteQuestion(Long qId) {
        this.questionRepository.deleteById(qId);
    }

    @Override
    public Set<Question> getQuestionsOfQuiz(Quiz quiz) {
        return this.questionRepository.findByQuiz(quiz);
    }

    @Override
    public Question get(Long questionId) {
        return this.questionRepository.getOne(questionId);

    }

}
