package com.quizApplication.Service;

import java.util.Scanner;

import com.telusko.quizApplication.dao.Questions;

public class QuizService {
	
	String answer;
	String answerFromStudent;
	int points=0;
	public void creatingQuestions(){
		Questions question1=new Questions(1, "  \n"
				+ "Number of primitive data types in Java are?","six","seven","eight","nine","eight");
		System.out.println(question1);
		
		answer=question1.getAnswer();
	}
	public String collectingAnswerFromStudent() {
		Scanner scan=new Scanner(System.in);
		answerFromStudent=scan.nextLine();
		return answerFromStudent;
	}
	public void checkAnswer() {
		if(answer.endsWith(answerFromStudent)) {
			points=points+2;
		}
		else  {
			points=points-1;
		}
		
		System.out.println(points);
	}
	
	

}
