// QuizGame.java
import java.util.Scanner;

public class QuizGame {
    private String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal in the world?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the powerhouse of the cell?"
    };

    private String[][] options = {
            {"A. Paris", "B. Berlin", "C. Madrid", "D. Rome"},
            {"A. Venus", "B. Mars", "C. Jupiter", "D. Saturn"},
            {"A. Blue Whale", "B. Elephant", "C. Giraffe", "D. Gorilla"},
            {"A. William Shakespeare", "B. Jane Austen", "C. Charles Dickens", "D. Mark Twain"},
            {"A. Nucleus", "B. Mitochondria", "C. Ribosome", "D. Endoplasmic Reticulum"}
    };

    private char[] correctAnswers = {'A', 'B', 'A', 'A', 'B'};

    private int totalQuestions = questions.length;
    private int correctResponses = 0;

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz Game! Please answer the following questions:");

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("\n" + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (A, B, C, or D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                correctResponses++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".");
            }
        }

        double scorePercentage = (double) correctResponses / totalQuestions * 100;
        System.out.println("\nYour final score: " + correctResponses + "/" + totalQuestions + " (" + scorePercentage + "%)");

        scanner.close();
    }
}
