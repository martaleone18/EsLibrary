/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author tss
 */
public class Library {
    
    private final List<Book> libri = new ArrayList<>();
    private final List<Book> prestiti = new ArrayList<>();
    
    public Library() {
        
    }
    
    public boolean addBook(Book b) {
       return libri.add(b);
    }
    
    public boolean loanBook(Book b) {
        checkBookExist(b);
        boolean ris = false;
        if (!prestiti.contains(b)) {
            ris = prestiti.add(b);
        }
        
        return ris;
    }
    
    public void returnBook(Book b) {
        checkLoanExist(b);
        prestiti.remove(b);
    }
    
    public void printLoan() {
        prestiti.forEach(System.out::println);
    }
    
    public boolean cercaLibro(String titolo) {
        List<Book> ris = new ArrayList<>();
        for (Book b : libri) {
            if (b.getTitolo() == titolo) {
                return false;
            } else {
                ris.add(b);
            }
        }
        return false;
    }
    
    private void checkBookExist(Book b) {
        if (!libri.contains(b)) {
            throw new IllegalArgumentException("Il libro non è nella biblioteca");
        }
    }
    
    private void checkLoanExist(Book b) {
        if (!prestiti.contains(b)) {
            throw new IllegalArgumentException("Il libro non è stato dato in prestito");
        }
        
    }
    
}
