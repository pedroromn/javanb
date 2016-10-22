/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvm.work.bourne;

/**
 *
 * @author pyuser
 */
public class Time1Test {
    
    public static void main(String[] args) {
        
        // create and initialize a Time1 object
        Time1 time = new  Time1();
        
        // change time and output updated time
        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.printf("%n");
        
        // attempt to set time with invalid values
        try{
            time.setTime(99, 99, 99);
        }
        catch(IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        
        // display time after attempt to set invalid values
        displayTime("After calling setTime with invalid values", time);
    }
    
    
    // display a Time1 object in 24-hour and 12-hour formats
    public static void displayTime(String header, Time1 t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", 
                header, t.toUniversalString(), t.toString());
    }
}
