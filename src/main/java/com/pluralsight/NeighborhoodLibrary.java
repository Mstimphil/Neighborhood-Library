package com.pluralsight;


import java.util.Arrays;
import java.util.Scanner;

public class NeighborhoodLibrary {
    private static Book[] books = new Book[6];
    public static void main(String[] args) {
        books[0] = new Book(1, "978-0451524935", "1984", false, "");

        books[1] = new Book(2, "978-0439708180", "Harry Potter and the Sorcerer's Stone", true, "Alice");
        books[2] = new Book(3, "978-0141439518", "Pride and Prejudice", false, "");
        books[3] = new Book(4, "978-0743273565", "The Great Gatsby", false, "");
        books[4] = new Book(5, "978-0061120084", "To Kill a Mockingbird", true, "Bob");
        books[5] = new Book(6, "978-0547928227", "The Hobbit", false, "");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Store Home Screen:");
            System.out.println("-----------------");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit-close out of the application");

            int choice = scanner.nextInt();
            scanner.nextLine();

            for (int i = 1; i < 5 ; i++) {

            }


            switch(choice){
                case 1:
                    System.out.println("You picked Book \"Harry Potter and the Sorcerer's Stone\"");

                    break;

                case 2:
                    System.out.println("You picked Book \"Pride and Prejudice\"");

                    break;
                case 3:
                    System.out.println("You picked Book \"The Great Gatsby\" ");

                    break;

                case 4:
                    System.out.println("You picked Book \"To Kill a Mockingbird\"");

                    break;

                case 5:
                    System.out.println("You picked Book \"The Hobbit\"");

                    break;

                default:
                    System.out.println("Exit-Close Application");


            }






        }

    }}