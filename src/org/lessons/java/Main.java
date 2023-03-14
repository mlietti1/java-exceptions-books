package org.lessons.java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("How many books? ");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Book[] library = new Book[n];
        boolean validInput;
        for (int i = 0; i < n; i++){
            validInput = false;
            while (!validInput){
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
                    library[i] = book;
                    System.out.println("Book: '" + book.getTitle() + "' added to your library.");
                    validInput = true;
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
        }

        FileWriter myFile;
        try{
            myFile = new FileWriter("./my-library.txt");
            for(int i = 0; i < library.length; i++){
                myFile.write(i+1 + ". " + library[i].toString() + "\n");
                System.out.println(i+1 + " Title: " + library[i].getTitle());
            }
            myFile.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        scan.close();
    }
}
