import java.util.InputMismatchException;
import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            boolean repeat = true;
            
            while (repeat) {
                try {
                    System.out.print("Enter the number of binary numbers to convert: ");
                    int n = input.nextInt();
                    String[] binaryNumbers = new String[n];
                    int[] decimalNumbers = new int[n];

                    // Get binary numbers from user input
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter binary number " + (i+1) + ": ");
                        binaryNumbers[i] = input.next();
                    }

                    // Convert binary numbers to decimal
                    for (int i = 0; i < n; i++) {
                        int decimal = 0;
                        int base = 1;
                        String binary = binaryNumbers[i];
                        for (int j = binary.length()-1; j >= 0; j--) {
                            if (binary.charAt(j) == '1') {
                                decimal += base;
                            }
                            base *= 2;
                        }
                        decimalNumbers[i] = decimal;
                    }

                    // Print decimal numbers
                    System.out.println("Decimal numbers:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(decimalNumbers[i]);
                    }
                    
                    // Ask user if they want to input again
                    System.out.print("Do you want to input again? (Y/N): ");
                    String answer = input.next();
                    if (answer.equalsIgnoreCase("N")) {
                        repeat = false;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("It must be an integer.");
                    input.nextLine(); // clear input buffer
                }
            }
        }
        
   
    }
}
