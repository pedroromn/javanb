import java.security.SecureRandom;

public class RandomIntegers
{
    public static void main(String args[])
    {
        SecureRandom randomNumbers = new SecureRandom();

        for (int counter = 1; counter <= 20; counter++) {
            int face = 1 + randomNumbers.nextInt(6); //1 + (0-5)

            System.out.printf("%d ", face);
            
            if(counter % 5 == 0){
                System.out.printf("%n");
            }
        }
    }
}
