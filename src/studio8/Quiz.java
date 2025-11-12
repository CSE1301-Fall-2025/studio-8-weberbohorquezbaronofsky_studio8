package studio8;

import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class Quiz {
	
	/**
	 * Constructor
	 * @param questions
	 */
	private Question[] questions;

	public Quiz(Question[] questions) {
		this.questions=questions;
	}
	
	/**
	 * Prompts the user to answer, then returns a String containing their answer.
	 * @param in
	 * @return String answer
	 */
	private String getUserAnswer(Scanner in) {
		System.out.print("Please enter your answer: ");
		String out = in.next();
		return out;
	}
	
	/**
	 * Gets the number of points possible in the quiz.
	 * @return int number of total points
	 */
	public int getTotalPoints() {
		int count=0;
		for (int x=0;x<questions.length;x++){
			count+=questions[x].getPoints();
		}
		return count;
	}
	
	/**
	 * Asks the user all question in the quiz, then prints out 
	 * the amount of points the user earned. This print statement
	 * should include "You earned ____ points"
	 * 
	 * @param in Scanner object to feed into getUserAnswer
	 */
	public void takeQuiz(Scanner in) {
		int score =0;
		for (int x=0;x<questions.length;x++){
			questions[x].displayPrompt();
			int points = questions[x].checkAnswer(getUserAnswer(in));
			System.out.println(points);
			score+=points;
		}
		System.out.println("You ahave earned " + score + "points out of " + getTotalPoints()+ ".");
	}
	
	
	public static void main(String[] args) {
		// TODO: Make your own Quiz!
	}
}
