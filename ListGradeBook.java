import java.util.*;

public class ListGradeBook extends Student{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> studentNames = new ArrayList<>();
        List<Double> grades = new ArrayList<>();

        getInfo(scanner, studentNames, grades);
        mean(grades);
        median(grades);

    }
    private static void getInfo(Scanner scanner, List<String> studentNames, List<Double> grades){
        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter a Students Name (First Name, Last Name): ");
            String name = scanner.nextLine();
            studentNames.add(name);
            System.out.print("\nEnter their grade for quiz 1: ");
            double grade = scanner.nextDouble();
            grades.add((double) grade);
            scanner.nextLine();
        }
    }
    private static void mean(List<Double> grades) {
        double sum = 0;
        double mean = 0;
        for (Double total : grades) {
            sum += total;
            mean = sum/10;
        }
        System.out.println("\nMean: " + mean);
    }
    private static void median(List<Double> grades) {
        Collections.sort(grades);
        if (grades.size() % 2 == 0) { // even
            System.out.println("Median: " + (grades.get(grades.size() / 2) + grades.get(grades.size() / 2 - 1))/2.0);
        }
    }

}
