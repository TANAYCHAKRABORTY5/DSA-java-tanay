
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practical_25 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tanay 21BCS5063");

        while (true) {
            System.out.println("1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the string to insert: ");
                    String insertString = scanner.nextLine();
                    insert(stringList, insertString);
                    break;
                case 2:
                    System.out.print("Enter the string to search: ");
                    String searchString = scanner.nextLine();
                    search(stringList, searchString);
                    break;
                case 3:
                    System.out.print("Enter the string to delete: ");
                    String deleteString = scanner.nextLine();
                    delete(stringList, deleteString);
                    break;
                case 4:
                    display(stringList);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void insert(List<String> list, String item) {
        list.add(item);
        System.out.println("Inserted successfully.");
    }

    private static void search(List<String> list, String item) {
        if (list.contains(item)) {
            System.out.println("Found: " + item);
        } else {
            System.out.println("Not found: " + item);
        }
    }

    private static void delete(List<String> list, String item) {
        if (list.remove(item)) {
            System.out.println("Deleted successfully: " + item);
        } else {
            System.out.println("Not found, deletion failed: " + item);
        }
    }

    private static void display(List<String> list) {
        System.out.println("List contents:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}