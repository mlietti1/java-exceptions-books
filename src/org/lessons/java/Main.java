package org.lessons.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("How many books? ");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Book[] library = new Book[n];

        for(int i = 0; i < library.length; i++){
            String title = "";
            do{
                System.out.print("Title: ");
                title = scan.nextLine();
                if(title.length() == 0){
                    System.out.println("Title must not be empty.");
                }
            }while (title.length() == 0);
            int pages = 0;
            do{
                System.out.print("Pages: ");
                pages = Integer.parseInt(scan.nextLine());
                if(pages == 0){
                    System.out.println("The number of pages must be grater than 0. ");
                }
            }while (pages <= 0);
            String author = "";
            do{
                System.out.print("Author: ");
                author = scan.nextLine();
                if(author.length() == 0){
                    System.out.println("Author must not be empty. ");
                }
            }while (author.length() == 0);
            String publisher = "";
            do{
                System.out.print("Publisher: ");
                publisher = scan.nextLine();
                if(publisher.length() == 0){
                    System.out.println("Publisher must not be empty. ");
                }
            }while (publisher.length() == 0);

            library[i] = new Book(title, pages, author, publisher);

        }

        System.out.println(Arrays.toString(library));

        try(FileWriter writer = new FileWriter("./library.txt")){
            for (Book book:
                 library) {
                writer.write(book.toString() + "\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Reading books from file...");

        try(Scanner reader = new Scanner(new File("./library.txt"))){
            while(reader.hasNext()){
                System.out.println(reader.nextLine());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
