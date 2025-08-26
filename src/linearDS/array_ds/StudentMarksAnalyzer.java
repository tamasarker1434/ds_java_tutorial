package linearDS.array_ds;

import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input student
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        //array create to store marks
        int[] marks = new int[n];
        //input marks
        System.out.println("Enter marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        //calculations: sum,avg, high, low
        int sum = 0, highest = marks[0], lowest = marks[0];
        for (int i = 0; i < n; i++) {
            sum += marks[i];
            if (marks[i] > highest)
                highest = marks[i];
            if (marks[i] < lowest)
                lowest = marks[i];
        }
        double avg = (double) sum / n;
        //Display analysis data
        System.out.println("\n--- Result Analysis ---");
        System.out.println("Average Marks: " + avg);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        //specific marks search
        System.out.print("\nEnter a mark to search: ");
        int search = sc.nextInt();
        boolean found = false;
        //input searching mark
        for (int mark: marks) {
            if (mark == search) {
                found = true;
                break;
            }
        }
        //search and output result of search
        if (found) {
            System.out.println("Mark " + search + " found in the list.");
        } else {
            System.out.println("Mark " + search + " not found.");
        }
    }
}
