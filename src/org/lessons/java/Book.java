package org.lessons.java;

public class Book {

    private String title; // not empty
    private int pages; // > 0
    private String author; // not empty
    private String publisher; // not empty

    public Book(String title, int pages, String author, String publisher) throws IllegalArgumentException {
        String exceptionMessage = "";
        if(isEmptyString(title)){
            exceptionMessage += "The title shouldn't be empty.";
        }
        if(isEmptyString(author)){
            exceptionMessage += "The author shouldn't be empty.";        }
        if(isEmptyString(publisher)){
            exceptionMessage += "The publisher shouldn't be empty.";        }
        if(pages <= 0){
            exceptionMessage += "The number of pages should be greater than 0.";
        }
        if(exceptionMessage.length() > 0){
            throw new IllegalArgumentException(exceptionMessage);
        }
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if(isEmptyString(title)){
            throw new IllegalArgumentException("The title shouldn't be empty.");
        }
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) throws IllegalArgumentException {
        if(pages < 1){
            throw new IllegalArgumentException("The number of pages should be greater than 0.");
        }
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if(isEmptyString(author)){
            throw new IllegalArgumentException("The author shouldn't be empty.");
        }
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) throws  IllegalArgumentException {
        if(isEmptyString(publisher)){
            throw new IllegalArgumentException("The publisher shouldn't be empty.");
        }
        this.publisher = publisher;
    }

    private boolean isEmptyString(String s){
        return s == null || s.trim().isEmpty();
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
