package practicedQuestionOfAllConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class EmployeeManagement {

    private ArrayList<String> employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addEmployee() {
        System.out.println("Enter employee name to add:");
        String name = sc.nextLine();
        employees.add(name);
        System.out.println("Employee added successfully!");
    }

    public void removeEmployee() {
        System.out.println("Enter employee name to remove:");
        String name = sc.nextLine();
        if (employees.remove(name)) {
            System.out.println("Employee removed successfully!");
        } else {
            System.out.println("Employee not found!");
        }
    }

    public void searchEmployee() {
        System.out.println("Enter employee name to search:");
        String name = sc.nextLine();
        if (employees.contains(name)) {
            System.out.println("Employee found!");
        } else {
            System.out.println("Employee not found!");
        }
    }

    public void displayEmployees() {
        System.out.println("\nEmployee List:");
        if (employees.isEmpty()) {
            System.out.println("No employees available!");
        } else {
            for (String emp : employees) {
                System.out.println(emp);
            }
        }
    }

    public void sortEmployees() {
        Collections.sort(employees);
        System.out.println("Employees sorted alphabetically!");
        displayEmployees();
    }
}

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagement obj = new EmployeeManagement();
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add employee");
            System.out.println("2. Remove employee");
            System.out.println("3. Search employee");
            System.out.println("4. Display employees");
            System.out.println("5. Sort employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();  // clear buffer

            switch (choice) {
                case 1: obj.addEmployee(); break;
                case 2: obj.removeEmployee(); break;
                case 3: obj.searchEmployee(); break;
                case 4: obj.displayEmployees(); break;
                case 5: obj.sortEmployees(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
