package pl.zzpj2021.solid.srp.book.solution;

import java.util.Map;

public class Printer {
    
    private Book book;

    public Printer() {
    }

    public Printer(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String printAllPages() {
        StringBuilder allPages = new StringBuilder();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages.append(page.getKey())
                    .append(" ")
                    .append(page.getValue());
        }
        return allPages.toString();
    }

    public void printCurrentPage() {
        System.out.println(book.getCurrentPage());
    }
}
