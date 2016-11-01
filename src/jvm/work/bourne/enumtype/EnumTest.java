/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvm.work.bourne.enumtype;

import java.util.EnumSet;
/**
 *
 * @author pyuser
 */
public class EnumTest {

    public static void main(String[] args) {
        
        System.out.println("All books");
        
        // print all books in enum Book
        for(Book book : Book.values())
            System.out.printf("%-10s%-45s%s%n",
                    book, book.getTitle(), book.getCopyrightYear());
        
        System.out.printf("%nDisplay a range of enum constants:%n" );
        
        // print first four books
        for(Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
            System.out.printf("%-10s%-45s%s%n",
                    book, book.getTitle(), book.getCopyrightYear());
    }
}
