package weekOne;

import java.util.Scanner;

public class StudentGrade {
    private static int[][] scores;
    private static int numberOfStudents;
    private static int numberOfSubjects;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students do you have?");
        numberOfStudents = getValidInput(input);

        System.out.println("How many subject do they offer?");
        numberOfSubjects = getValidInput(input);

        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully\n");

        scores = new int[numberOfStudents][numberOfSubjects];

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfSubjects; j++) {
                int score;
                while (true) {
                    System.out.printf("Entering score for student %d%n", i + 1);
                    System.out.printf("Enter score for subject %d%n", j + 1);
                    score = input.nextInt();
                    if (score >= 0 && score <= 100) {
                        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>");
                        System.out.println("Saved successfully\n");
                        break;
                    } else {
                        System.out.println("Score must be between 0 and 100. Try again.");
                    }
                }
                scores[i][j] = score;
            }
        }

        displayClassSummary();
        displaySubjectSummary();
        displayOverallClassSummary();
    }

    private static int getValidInput(Scanner input) {
        int value;
        while (true) {
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value > 0) break;
            } else {
                input.next();
            }
            System.out.println("Please enter a valid positive integer.");
        }
        return value;
    }

    public static void displayClassSummary() {
        System.out.println("===============================================================================");
        System.out.print("STUDENT\t\t");
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("SUB" + i + "\t");
        }
        System.out.println("TOT\tAVE\tPOS");
        System.out.println("===============================================================================");

        int[] totals = new int[numberOfStudents];
        double[] averages = new double[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            int total = 0;
            for (int j = 0; j < numberOfSubjects; j++) {
                total += scores[i][j];
            }
            totals[i] = total;
            averages[i] = (double) total / numberOfSubjects;
        }

        int[] positions = calculatePositions(totals);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + "\t");
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.printf("%d\t%.2f\t%d%n", totals[i], averages[i], positions[i]);
        }
        System.out.println("===============================================================================");
        System.out.println("===============================================================================");
    }

    public static int[] calculatePositions(int[] totals) {
        int[] positions = new int[totals.length];
        for (int i = 0; i < totals.length; i++) {
            int pos = 1;
            for (int j = 0; j < totals.length; j++) {
                if (totals[j] > totals[i]) {
                    pos++;
                }
            }
            positions[i] = pos;
        }
        return positions;
    }

    public static void displaySubjectSummary() {
        for (int j = 0; j < numberOfSubjects; j++) {
            System.out.println("SUBJECT SUMMARY");
            System.out.println("Subject " + (j + 1));
            
            int highestScore = -1;
            int lowestScore = 101;
            int highestStudent = -1;
            int lowestStudent = -1;
            int totalScore = 0;
            int passes = 0;
            int fails = 0;

            for (int i = 0; i < numberOfStudents; i++) {
                int score = scores[i][j];
                totalScore += score;
                if (score > highestScore) {
                    highestScore = score;
                    highestStudent = i + 1;
                }
                if (score < lowestScore) {
                    lowestScore = score;
                    lowestStudent = i + 1;
                }
                if (score >= 50) passes++;
                else fails++;
            }

            System.out.printf("Highest scoring student is: Student %d scoring %d%n", highestStudent, highestScore);
            System.out.printf("Lowest Scoring student is: student %d scoring %d%n", lowestStudent, lowestScore);
            System.out.printf("Total Score is: %d%n", totalScore);
            System.out.printf("Average score is: %.2f%n", (double) totalScore / numberOfStudents);
            System.out.printf("Number of passes: %d%n", passes);
            System.out.printf("Number of Fails: %d%n%n", fails);
        }
    }

    public static void displayOverallClassSummary() {
        int hardestSubject = -1;
        int easiestSubject = -1;
        int maxFails = -1;
        int maxPasses = -1;
        
        int overallHighestScore = -1;
        int overallHighestStudent = -1;
        int overallHighestSubject = -1;
        
        int overallLowestScore = 101;
        int overallLowestStudent = -1;
        int overallLowestSubject = -1;

        for (int j = 0; j < numberOfSubjects; j++) {
            int passes = 0;
            int fails = 0;
            for (int i = 0; i < numberOfStudents; i++) {
                int score = scores[i][j];
                if (score >= 50) passes++;
                else fails++;
                
                if (score > overallHighestScore) {
                    overallHighestScore = score;
                    overallHighestStudent = i + 1;
                    overallHighestSubject = j + 1;
                }
                if (score < overallLowestScore) {
                    overallLowestScore = score;
                    overallLowestStudent = i + 1;
                    overallLowestSubject = j + 1;
                }
            }
            if (fails > maxFails) {
                maxFails = fails;
                hardestSubject = j + 1;
            }
            if (passes > maxPasses) {
                maxPasses = passes;
                easiestSubject = j + 1;
            }
        }

        System.out.printf("The hardest subject is Subject %d with %d failures%n", hardestSubject, maxFails);
        System.out.printf("The easiest subject is Subject %d with %d passes%n", easiestSubject, maxPasses);
        System.out.printf("The overall Highest score is scored by Student %d in subject %d scoring %d%n", overallHighestStudent, overallHighestSubject, overallHighestScore);
        System.out.printf("The overall Lowest score is scored by Student %d in subject %d scoring %d%n", overallLowestStudent, overallLowestSubject, overallLowestScore);
        System.out.println("================================================");

        int bestStudent = -1;
        int worstStudent = -1;
        int maxTotal = -1;
        int minTotal = Integer.MAX_VALUE;
        int totalClassScore = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            int total = 0;
            for (int j = 0; j < numberOfSubjects; j++) {
                total += scores[i][j];
            }
            totalClassScore += total;
            if (total > maxTotal) {
                maxTotal = total;
                bestStudent = i + 1;
            }
            if (total < minTotal) {
                minTotal = total;
                worstStudent = i + 1;
            }
        }

        System.out.println("\nCLASS SUMMARY");
        System.out.println("================================================");
        System.out.printf("Best Graduating Student is: Student %d scoring %d%n", bestStudent, maxTotal);
        System.out.println("------------------------------------------------");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.printf("Worst Graduating Student is: Student %d scoring %d%n", worstStudent, minTotal);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("================================================");
        
        System.out.printf("\nClass total score is: %d%n", totalClassScore);
        System.out.printf("Class average score is: %.1f%n", (double) totalClassScore / numberOfStudents);
        System.out.println("================================================");
    }
    
    // Test helper
    public static void setScoresForTesting(int[][] testScores) {
        scores = testScores;
        numberOfStudents = testScores.length;
        numberOfSubjects = testScores[0].length;
    }
}
