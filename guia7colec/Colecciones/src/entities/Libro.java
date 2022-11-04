/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 *
 * @author Xhemanuelv
 */
public class Libro {
    
    private String title;
    private String author;
    private int bookStock;
    private int bookBorrowed;

    public Libro() {
    }

    public Libro(String title, String author, int bookStock, int bookBorrowed) {
        this.title = title;
        this.author = author;
        this.bookStock = bookStock;
        this.bookBorrowed = bookBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookStock() {
        return bookStock;
    }

    public void setBookStock(int bookStock) {
        this.bookStock = bookStock;
    }

    public int getBookBorrowed() {
        return bookBorrowed;
    }

    public void setBookBorrowed(int bookBorrowed) {
        this.bookBorrowed = bookBorrowed;
    }
    
    

}
