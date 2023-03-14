package org.lessons.java;

public class Book {

    private String title;
    private int pages;
    private String author;
    private String publisher;

    public Book(String title, int pages, String author, String publisher) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.length() < 1){
            throw new IllegalArgumentException("The title must be at least 1 char.");
        }
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages < 1){
            throw new IllegalArgumentException("There must be more than 0 pages.");
        }
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author.length() < 1){
            throw new IllegalArgumentException("The author must be at least 1 char.");
        }
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if(publisher.length() < 1){
            throw new IllegalArgumentException("The publisher must be at least 1 char.");
        }
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
