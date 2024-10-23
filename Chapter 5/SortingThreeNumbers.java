import java.util.Scanner;
public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Ascending order: " + num1 + " " + num2 + " " + num3);
        } else if (num1 >= num2 && num2 >= num3) {
            System.out.println("Descending order: " + num1 + " " + num2 + " " + num3);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.println("Ascending order: " + num1 + " " + num3 + " " + num2);
        } else if (num1 >= num3 && num3 >= num2) {
            System.out.println("Descending order: " + num1 + " " + num3 + " " + num2);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.println("Ascending order: " + num2 + " " + num1 + " " + num3);
        } else {
            System.out.println("Descending order: " + num2 + " " + num1 + " " + num3);
        }
        scanner.close();
    }
}
