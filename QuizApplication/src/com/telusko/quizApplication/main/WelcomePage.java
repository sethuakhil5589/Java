package com.telusko.quizApplication.main;

import java.util.Scanner;

import com.quizApplication.Service.QuizService;
import com.telusko.quizApplication.dao.Admin;

public class WelcomePage {

	public void welcomingApplication() {
		System.out.println("Welcome to Quiz Application");
		System.out.println("Enter 1 if your an 'ADMIN'  and enter 2 if your a 'STUDENT'..");
		
		Scanner scan=new Scanner(System.in);
		Admin admin=new Admin();
		int codeForAdminOrStudent=scan.nextInt();
		if(codeForAdminOrStudent==1) {
			admin.CreatingNewQuestions();
		}
		else if(codeForAdminOrStudent==2) {
			System.out.println("Here for every correct answer you gonna get '+2' marks, for every wrong answer '-1' and for for skip '0'");
			

			QuizService service=new QuizService();
			service.creatingQuestions();
			service.collectingAnswerFromStudent();
			service.checkAnswer();
		}
		else {
			System.out.println("Please enter the correct value");
		}
	}

}
