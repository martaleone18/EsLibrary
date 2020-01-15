/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.library;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Book {
    private final String titolo;

    public Book(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.titolo, other.titolo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Book{" + "titolo=" + titolo + '}';
    }

   
    
}
