class Barchart
{
    public static void main(String args[])
    {
        int[] array = {10,5,3,9,2,1,5,2,4,6,11};

        for(int counter = 0; counter < array.length; counter++){

            if(counter == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", counter * 10,
                                  counter * 10 + 9);
            }

            for(int stars = 0; stars < array[counter]; stars++){
                System.out.printf("*");
            }

            System.out.printf("%n");
            
        }
    }
}
