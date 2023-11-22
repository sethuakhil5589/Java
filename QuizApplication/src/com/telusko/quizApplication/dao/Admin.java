package com.telusko.quizApplication.dao;
import java.util.*;

public class Admin {
	
	public void CreatingNewQuestions() {
//		int questionId;
//		String question;
//		String option1;
//		String option2;
//		String option3;
//		String option4;
//		String answer;
		int numberOfQuestions;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of Questions");
		numberOfQuestions=scan.nextInt();

		
		Questions questions[]=new Questions[numberOfQuestions];
		
		System.out.println("Start entering questions");
		
		for(int i=0;i<numberOfQuestions;i++) {
			System.out.println("Enter the question number");
			int questionNumber=0;
			int questionId=scan.nextInt();
			scan.nextLine();
			
			System.out.println("Enter Question for: "+ questionId);
			String question= scan.nextLine();
			
			
			System.out.println("Enter option-1: for question number"+questionId);
			String option1=scan.nextLine();
			
			System.out.println("Enter option-2: for question number"+questionId);
			String option2=scan.nextLine();
			
			System.out.println("Enter option-3: for question number"+questionId);
			String option3=scan.nextLine();
			
			System.out.println("Enter option-4: for question number"+questionId);
			String option4=scan.nextLine();
			
			System.out.println("Enter Answer for question number"+questionId);
			String answer=scan.nextLine();
			
			questions [questionNumber]=new Questions(questionId, question, option1, option2, option3, option4, answer);
			questionNumber=questionNumber+1;
		}
		for(Questions element:questions) {
			System.out.println(element);
		}
	}

}
