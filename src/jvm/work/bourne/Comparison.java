// Comparison.java
// Compare integers if statements, relational operators
// and equality operators

import java.util.Scanner;

public class Comparison{
    public static void main(String[] args) {
        // Create Scanner to obtain of Java application
        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.printf("Enter first integer: ");
        number1 = input.nextInt();

        System.out.printf("Enter second integer: ");
        number2 = input.nextInt();

        if(number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);

        if(number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);

        if(number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);

        if(number1 > number2)
            System.out.printf("%d > %d", number1, number2);

        System.out.printf("\n");
        
    }
}
