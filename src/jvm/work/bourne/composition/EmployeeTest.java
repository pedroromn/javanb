/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvm.work.bourne.composition;

/**
 *
 * @author pyuser
 */
public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);
        
        System.out.println(employee);
    }
} // end class EmployeeTest

