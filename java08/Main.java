import java.util.Scanner;
import files.UserFileHandler;

public class Main {
    public static void main(String[] args) {
        String file_path = null;
        Scanner input = new Scanner(System.in);
        System.out.println("File Handler");
        System.out.println("************");
        System.out.println("Enter the file path:");
        file_path = input.nextLine(); // Use nextLine() to read the full path
        new UserFileHandler(file_path).fileDetails();
        input.close(); // Close the scanner to prevent resource leak
    }
}
