/*B) Write a java program for the following:
1. To create a file. 
2. To rename a file. 
3. To delete a file. 
4. To display path of a file. */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FileOperations {

    // Method to create a file
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    // Method to rename a file
    public static void renameFile(String oldFileName, String newFileName) {
        File oldFile = new File(oldFileName);
        File newFile = new File(newFileName);
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully to: " + newFileName);
        } else {
            System.out.println("Error renaming file.");
        }
    }

    // Method to delete a file
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    // Method to display the file path
    public static void displayFilePath(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File path: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file to create:");
        String fileName = scanner.nextLine();
        createFile(fileName);

        System.out.println("Enter the new name for the file:");
        String newFileName = scanner.nextLine();
        renameFile(fileName, newFileName);

        System.out.println("Displaying the path of the renamed file:");
        displayFilePath(newFileName);

        System.out.println("Do you want to delete the file? (yes/no):");
        String deleteChoice = scanner.nextLine();
        if (deleteChoice.equalsIgnoreCase("yes")) {
            deleteFile(newFileName);
        } else {
            System.out.println("File not deleted.");
        }

        scanner.close();
    }
}
