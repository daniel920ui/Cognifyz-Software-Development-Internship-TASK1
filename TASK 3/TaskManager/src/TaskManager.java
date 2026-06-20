import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {

            System.out.println("\n===== TASK MANAGER =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task Added Successfully!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Available.");
                    } else {
                        System.out.println("\nTask List:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Available.");
                    } else {

                        System.out.println("\nTask List:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }

                        System.out.print("Enter Task Number to Update: ");
                        int updateIndex = sc.nextInt();
                        sc.nextLine();

                        if (updateIndex > 0 && updateIndex <= tasks.size()) {
                            System.out.print("Enter New Task: ");
                            String newTask = sc.nextLine();
                            tasks.set(updateIndex - 1, newTask);
                            System.out.println("Task Updated Successfully!");
                        } else {
                            System.out.println("Invalid Task Number!");
                        }
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Available.");
                    } else {

                        System.out.println("\nTask List:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }

                        System.out.print("Enter Task Number to Delete: ");
                        int deleteIndex = sc.nextInt();

                        if (deleteIndex > 0 && deleteIndex <= tasks.size()) {
                            tasks.remove(deleteIndex - 1);
                            System.out.println("Task Deleted Successfully!");
                        } else {
                            System.out.println("Invalid Task Number!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}