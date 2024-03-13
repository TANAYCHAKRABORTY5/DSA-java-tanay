
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaclass3 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Search");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the string to insert: ");
                    String insertString = scanner.nextLine();
                    stringList.add(insertString);
                    System.out.println("'" + insertString + "' inserted into the list.");
                    break;
                case 2:
                    if (!stringList.isEmpty()) {
                        System.out.print("Enter the index to delete (0 to " + (stringList.size() - 1) + "): ");
                        int deleteIndex = scanner.nextInt();
                        if (deleteIndex >= 0 && deleteIndex < stringList.size()) {
                            String deletedString = stringList.remove(deleteIndex);
                            System.out.println("'" + deletedString + "' deleted from the list.");
                        } else {
                            System.out.println("Invalid index. Please enter a valid index.");
                        }
                    } else {
                        System.out.println("List is empty. Cannot delete from an empty list.");
                    }
                    break;
                case 3:
                    if (!stringList.isEmpty()) {
                        System.out.println("String List:");
                        for (String str : stringList) {
                            System.out.println(str);
                        }
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;
                case 4:
                    if (!stringList.isEmpty()) {
                        System.out.print("Enter the string to search: ");
                        String searchString = scanner.nextLine();
                        if (stringList.contains(searchString)) {
                            System.out.println("'" + searchString + "' found in the list.");
                        } else {
                            System.out.println("'" + searchString + "' not found in the list.");
                        }
                    } else {
                        System.out.println("List is empty. Cannot search in an empty list.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
