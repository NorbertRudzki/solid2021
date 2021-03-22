package pl.zzpj2021.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {

    private String title;
    private String author;
    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;
    private Map<Integer, String> pages = new HashMap<>();
    private int currentPage = 0;

    public Book(Map<Integer, String> pages) {
        this.pages = pages;
    }

    public Book(String title, String author, String libraryRoomName, 
                String rowLocator, int indexOnShelf, Map<Integer, String> pages) {
        this.title = title;
        this.author = author;
        this.libraryRoomName = libraryRoomName;
        this.rowLocator = rowLocator;
        this.indexOnShelf = indexOnShelf;
        this.pages = pages;
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

    public String getLibraryRoomName() {
        return libraryRoomName;
    }

    public void setLibraryRoomName(String libraryRoomName) {
        this.libraryRoomName = libraryRoomName;
    }

    public String getRowLocator() {
        return rowLocator;
    }

    public void setRowLocator(String rowLocator) {
        this.rowLocator = rowLocator;
    }

    public int getIndexOnShelf() {
        return indexOnShelf;
    }

    public void setIndexOnShelf(int indexOnShelf) {
        this.indexOnShelf = indexOnShelf;
    }

    public Map<Integer, String> getPages() {
        return pages;
    }

    public void setPages(Map<Integer, String> pages) {
        this.pages = pages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void turnPage() {
        currentPage ++;
    }

    public String getCurrentPageContents() {
        return pages.get(currentPage);
    }
}
