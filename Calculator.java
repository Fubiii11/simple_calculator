import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            // Display the menu
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            if(choice == 5){
                System.out.println("Exiting...");
                break;
            }
        

            // Get the two numbers
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number");
            double num2 = scanner.nextDouble();

            // Perform the selected operation

            switch(choice) {
                case 1:
                    System.out.println("Result: " + Operations.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + Operations.subtract(num1, num2));
                    break;

                case 3:
                    System.out.println("Result: " + Operations.multiply(num1, num2));
                    break;

                case 4:
                    if(num2 != 0){
                        System.out.println("Result: " + Operations.divide(num1, num2));
                    }
                    else{
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    
            }
            // Empty line for formating
            System.out.println("\n");

        }
        scanner.close();
    }
}
