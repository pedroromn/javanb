// ARS : Airline Reservations System

import java.util.Arrays;
import java.security.SecureRandom;


public class ARS{
    public static void main(String[] args) {

        boolean[] airplane = new boolean[10];
        Arrays.fill(airplane, false);
        SecureRandom randomOption = new SecureRandom();
        int seat_fc = 0;
        int seat_ec = 5;

        while(!isFull(airplane)){
            switch(1 + randomOption.nextInt(2)){
            case 1: // FirstClass
                // Assign seat -> index (0,1,2,3,4)
                if(seat_fc < 5){
                    airplane[seat_fc] = true;
                    seat_fc++;
                    System.out.printf("Seat: #%d sold - First Class.%n",
                                      seat_fc);
                }else{
                    System.out.printf("Economy Class ?%n");
                    if((1 + randomOption.nextInt(2)) == 1){ // YES
                        airplane[seat_ec] = true;
                        seat_ec++;
                        System.out.printf("Seat: #%d sold - Economy Class.%n",
                                      seat_ec);
                    }else{
                        System.out.printf("Next Flight leaves in 3 hours.%n");
                    }
                }
                break;

            case 2: // Economy
                // Assign seat -> index (5,6,7,8,9)
                if(seat_ec < 10){
                    airplane[seat_ec] = true;
                    seat_ec++;
                    System.out.printf("Seat: #%d sold - Economy Class.%n",
                                      seat_ec);
                }else{
                    System.out.printf("First Class ?%n");
                    if((1 + randomOption.nextInt(2)) == 1){ // YES
                        airplane[seat_fc] = true;
                        seat_fc++;
                        System.out.printf("Seat: #%d sold - First Class.%n",
                                      seat_fc);
                    }else{
                        System.out.printf("Next Flight leaves in 3 hours.%n");
                    }
                }
                break;
            }
            
        }
            

        
    }

    /*
    private static void displayAirplane(boolean[] airplane){
        for(boolean seat : airplane){
            System.out.printf("%b ", seat);
        }
        }*/

    private static boolean isFull(boolean[] airplane){
        for(boolean seat : airplane){
            if(!seat){
                return seat; 
            }
        }
        return true;
    }
    
} // end of class ARS
