import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        
        // Print a blank line after the number is entered and before the pattern starts
        System.out.println();
        
        // Print the upper half of the pattern including the middle line
        for (int i = 1; i <= n; i++) {
            // Print leading '*' for each line
            System.out.print("*");
            
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            // Print trailing '*' and move to the next line
            System.out.println("*");
        }
        
        // Print the lower half of the pattern excluding the middle line
        for (int i = n - 1; i >= 1; i--) {
            // Print leading '*' for each line
            System.out.print("*");
            
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            // Print trailing '*' and move to the next line
            System.out.println("*");
        }
        
        // Print the bottom line '*' alone
        System.out.println("*");
        
        // Close the scanner
        scanner.close();
    }
}
