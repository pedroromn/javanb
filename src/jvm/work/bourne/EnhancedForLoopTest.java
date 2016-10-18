public class EnhancedForLoopTest{
    public static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // ad each element's value to total
        for(int number : array){
            total += number;
        }

        System.out.printf("Total of array elements: %d%n", total);
    }
}
