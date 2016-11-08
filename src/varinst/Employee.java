/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varinst;

/**
 *
 * @author pyuser
 */
public class Employee {
    
    private static int count = 0;
    private String firstName;
    private String lastName;
    
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        
        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n",
                this.firstName, this.lastName, count);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getCount() {
        return count;
    }
    
    
} // end class Employee
