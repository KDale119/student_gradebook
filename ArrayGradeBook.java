
import java.util.Arrays;
import java.util.Scanner;

public class ArrayGradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to teachers assistant");

        String[] studentNames = new String[10];
        Double[] grades = new Double[10];

        getInfo(scanner, studentNames, grades);
        mean(grades);
        median(grades);
    }
    private static void getInfo(Scanner scanner, String[] studentNames, Double[] grades) {
        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter a Students Name (First Name, Last Name): ");
            String name = scanner.nextLine();
            studentNames[i] = name;
            System.out.print("\nEnter their grade for quiz 1: ");
            double grade = scanner.nextDouble();
            grades[i] = (double) grade;
            scanner.nextLine();
        }
    }
    private static void mean(Double[] grades) {
        double sum = 0;
        double mean = 0;
        for (Double total : grades) {
            sum += total;
            mean = sum/10;
        }
        System.out.println("\nMean: " + mean);
    }
    private static void median(Double[] grades) {
        Arrays.sort(grades);
        if (grades.length % 2 == 0) { // even
            System.out.println("Median: " + (grades[grades.length/2] + grades[grades.length/2-1])/2.0);
        }
    }

}

