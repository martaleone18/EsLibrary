/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.library;

/**
 *
 * @author tss
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

     Library lib = new Library();
Book a = new Book("a"), b = new Book("b"), c = new Book(
"c"), d= new Book ("d");
System.out.println( lib .addBook(a));
System.out.println( lib .addBook(b));
System.out.println( lib .addBook(c));
System.out.println( lib .addBook(d));
System.out.println( lib .loanBook(c));
System.out.println( lib .loanBook(d));
lib.printLoan();
    }

}
