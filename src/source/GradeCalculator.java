/**
 * 
 */
package source;

import java.util.Scanner;

/**
 * @author AnnaB For this assignment, you will need to ask user how many classes
 *         they took for the semester. You will use that number as a counter
 *         variable. Now ask the user to enter the grades they got in each class
 *         (ex: 86). Make sure that you ask the user each time using a loop, and
 *         the counter variable will determine how many times the loop executes
 *         (how many times it asks user for grade). Find their average. Now
 *         think of a way to run that average through an if-else statement or a
 *         switch statement to determine the letter grade. An if-else will be a
 *         little bit easier but you can challenge yourself to write a switch
 *         statement that works too. Print letter grade to screen, formatted
 *         however you like (ex: 'A' is fine or 'Your average is an A' is fine
 *         too, you can use your creativity)
 * 
 */
public class GradeCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ask user how many classes they took for the semester
		Scanner num = new Scanner(System.in);
		int numClasses = 0;
		int totalGrade = 0;
		double averageGrade = 0;
		int intAvgGrade = 0;
		System.out.println("How many classes were you in this semester?:");
		numClasses = num.nextInt();
		// Use that number as a counter variable
		// Ask user to enter class for each grade
		for (int i = 0; i < numClasses; i++) {
			int grade = 0;
			int gradeNumber = i +1;
			System.out.println("Please enter the grade you got for class " + gradeNumber + ": ");
			grade = num.nextInt();
			totalGrade = totalGrade + grade;
		}
		// Find grade average
		averageGrade = (double) ((totalGrade / numClasses) / 10);
		// Convert averageGrade to int
		intAvgGrade = (int) averageGrade;
		System.out.println("the average grade is " + averageGrade);

		// Run average through an if-else or switch statement to get letter
		// grade
		// Print letter grade to screen
		switch (intAvgGrade) {
		case 10:
			System.out.println("Way to go, Perfect score");
			break;
		case 9:
			System.out.println("Got an A");
			break;
		case 8:
			System.out.println("Got an B");
			break;
		case 7:
			System.out.println("Got an C");
			break;
		case 6:
			System.out.println("Got an D");
			break;
		default:
			System.out.println("Failed the class, see you this summer.");
			break;
		}
	}
}
