package com.telusko.quizApplication.main;

import com.quizApplication.Service.QuizService;

public class LaunchQuizApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Quiz Application");
		QuizService service=new QuizService();
		service.creatingQuestions();
		service.collectingAnswerFromStudent();
		service.checkAnswer();
		

	}

}
