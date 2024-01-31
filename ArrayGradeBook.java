import java.util.Arrays;
import java.util.Scanner;

public class ArrayGradeBook extends Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to teachers assistant\n");

//        System.out.println("Enter their grade for quiz 1: ");
//        int grade = scanner.nextInt();
//        scanner.nextLine();

        String[] students = new String[10];
        Integer[] grades = new Integer[10];


        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a Students Name (First Name, Last Name): ");
            String name = scanner.nextLine();
            students[i] = name;
//            System.out.println(i);
            System.out.print("Enter their grade for quiz 1: ");
            int grade = scanner.nextInt();
            grades[i] = grade;
            scanner.nextLine();
            }
//            System.out.println(i);
        System.out.println(students[3]);
//        Arrays.sort(students);
//        System.out.println(students[3]);
//        System.out.println(grades[3]);

    }
}
