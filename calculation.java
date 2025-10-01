import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if(choice >= 1 && choice <= 4){
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();
                double result = 0;

                switch(choice){
                    case 1: result = a + b; break;
                    case 2: result = a - b; break;
                    case 3: result = a * b; break;
                    case 4: 
                        if(b != 0) result = a / b;
                        else System.out.println("Cannot divide by zero!");
                        break;
                }
                if(choice != 4 || b != 0) System.out.println("Result: " + result);
            }
            else if(choice != 5) {
                System.out.println("Invalid choice!");
            }

        } while(choice != 5);

        System.out.println("Calculator Closed.");
    }
}
