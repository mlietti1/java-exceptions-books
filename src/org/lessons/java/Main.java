package org.lessons.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("How many books? ");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Book[] library = new Book[n];
        boolean validInput;
        for (int i = 0; i < n; i++){
            validInput = true;
            while (validInput){
                System.out.println("Title: ");
                String title = scan.nextLine();
                System.out.println("Pages: ");
                int pages = Integer.parseInt(scan.nextLine());
                System.out.println("Author: ");
                String author = scan.nextLine();
                System.out.println("Publisher: ");
                String publisher = scan.nextLine();
                try{
                    Book book = new Book(title, pages, author, publisher);
                    validInput = false;
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
