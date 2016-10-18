import java.util.Scanner;

class Addition
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int number1, number2, sum;

        System.out.printf("Enter first integer: ");
        number1 = input.nextInt();

        System.out.printf("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);
        
    }
}
