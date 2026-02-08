

import java.util.Scanner;

public class ToDoListManagerWithArray {
    public static void main(String[] args) {
        final int MAX_TASKS = 10; // Maximum number of tasks allowed
        String[] tasks = new String[MAX_TASKS];
        boolean[] isComplete = new boolean[MAX_TASKS]; // To track completion status
        int taskCount = 0; // Keeps track of the number of tasks
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the To-Do List Manager!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a task");
            System.out.println("3. Mark a task as complete");
            System.out.println("4. Display tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1: // Add a task
                    if (taskCount < MAX_TASKS) {
                        System.out.print("Enter the task description: ");
                        tasks[taskCount] = sc.nextLine();
                        isComplete[taskCount] = false; // Initially, the task is incomplete
                        taskCount++;
                        System.out.println("Task added successfully!");
                    } else {
                        System.out.println("Task list is full! Remove a task to add more.");
                    }
                    break;

                case 2: // Remove a task
                    if (taskCount > 0) {
                        System.out.println("Enter the task number to remove:");
                        displayTasks(tasks, isComplete, taskCount);
                        int removeIndex = sc.nextInt() - 1;
                        if (removeIndex >= 0 && removeIndex < taskCount) {
                            // Shift tasks to the left to fill the gap
                            for (int i = removeIndex; i < taskCount - 1; i++) {
                                tasks[i] = tasks[i + 1];
                                isComplete[i] = isComplete[i + 1];
                            }
                            taskCount--; // Reduce task count
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Invalid task number!");
                        }
                    } else {
                        System.out.println("No tasks to remove!");
                    }
                    break;

                case 3: // Mark as complete
                    if (taskCount > 0) {
                        System.out.println("Enter the task number to mark as complete:");
                        displayTasks(tasks, isComplete, taskCount);
                        int completeIndex = sc.nextInt() - 1;
                        if (completeIndex >= 0 && completeIndex < taskCount) {
                            isComplete[completeIndex] = true; // Mark as complete
                            System.out.println("Task marked as complete!");
                        } else {
                            System.out.println("Invalid task number!");
                        }
                    } else {
                        System.out.println("No tasks to mark as complete!");
                    }
                    break;

                case 4: // Display tasks
                    displayTasks(tasks, isComplete, taskCount);
                    break;

                case 5: // Exit
                    System.out.println("Exiting To-Do List Manager. Have a great day!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    private static void displayTasks(String[] tasks, boolean[] isComplete, int taskCount) {
        if (taskCount == 0) {
            System.out.println("No tasks in your list!");
        } else {
            System.out.println("Your Tasks:");
            for (int i = 0; i < taskCount; i++) {
                System.out.println((i + 1) + ". " + (isComplete[i] ? "[✔] " : "[ ] ") + tasks[i]);
            }
        }
    }
}
