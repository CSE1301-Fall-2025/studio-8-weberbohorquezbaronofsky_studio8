package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	/**
	 * Constructor
	 * 
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	private String[] choices;
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.choices=choices;
	}

	/**
	 * Display the prompt for the question in addition to
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		for (int x=0;x<choices.length;x++){
			System.out.println((x+1) +". " + choices[x]);
		}
	}

	/**
	 * Getter method for the available choices
	 * 
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}

	public static void main(String[] args) {
		String[] x = {"1","2","3","4"};
		Question mcq1 = new MultipleChoiceQuestion("What is 1+1?","2",3,x);
		mcq1.displayPrompt();
 	}

}
