//package gradecalculator;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Subjects/Modules: ");
        int numSubjects = scanner.nextInt();

        int[] grades = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the mark for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        double averageGrade = calculateAverageGrade(grades);

        System.out.println("Your average mark is: " + averageGrade);

        scanner.close();
    }

    public static double calculateAverageGrade(int[] grades) {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        double average = (double) sum / grades.length;

        return average;
    }
}
