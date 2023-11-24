import java.util.Scanner;

public class QuizGame {
	// declare variable to store the questions
    private String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal in the world?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the powerhouse of the cell?"
    };

	// declare variable to store the options
    private String[][] options = {
            {"A. Paris", "B. Berlin", "C. Madrid", "D. Rome"},
            {"A. Venus", "B. Mars", "C. Jupiter", "D. Saturn"},
            {"A. Blue Whale", "B. Elephant", "C. Giraffe", "D. Gorilla"},
            {"A. William Shakespeare", "B. Jane Austen", "C. Charles Dickens", "D. Mark Twain"},
            {"A. Nucleus", "B. Mitochondria", "C. Ribosome", "D. Endoplasmic Reticulum"}
    };

	// declare variable to store the correct answers
    private char[] correctAnswers = {'A', 'B', 'A', 'A', 'B'};

    private int totalQuestions = questions.length; // declare variable to store the total number of questions
    private int correctResponses = 0; // declare variable to store the number of correct responses

    public void startQuiz() {
		// Initialize scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz Game! Please answer the following questions:");

		// Loop through the questions
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("\n" + questions[i]);

			// Loop through the options
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (A, B, C, or D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0); // Read user input and convert to uppercase

            if (userAnswer == correctAnswers[i]) { // Check if the user's answer is correct
                System.out.println("Correct!");
                correctResponses++; // Increment the number of correct responses
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + "."); // Display the correct answer
            }
        }

		// Calculate the score percentage
        double scorePercentage = (double) correctResponses / totalQuestions * 100;
		// Display the final score
        System.out.println("\nYour final score: " + correctResponses + "/" + totalQuestions + " (" + scorePercentage + "%)");

        scanner.close();
    }
}
