package com.example.literature.main;

import com.example.literature.service.ConsumptionAPI;

import java.util.Scanner;

public class Main {
    private Scanner sc = new Scanner(System.in);
    private ConsumptionAPI consumptionApi = new ConsumptionAPI();

    public void showMenu() {
        final var menu = """
                \n\tPlease, select an option:
                \t1 - Search book by title
                \t2 - List registered books
                \t3 - List registered authors
                \t4 - List authors alive in a given year
                \t5 - List books by language
                \n\t0 - Exit
                """;
        var option = -1;
        System.out.println("****************************************");
        while (option != 0) {
            System.out.println(menu);
            System.out.print("Option: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    searchBookByTitle();
                    break;
                case 2:
                    listRegisteredBooks();
                    break;
                case 3:
                    listRegisteredAuthors();
                    break;
                case 4:
                    listAuthorsAliveInYear();
                    break;
                case 5:
                    listBooksByLanguage();
                    break;
                case 0:
                    System.out.println("ending application...");
                    break;
                default:
                    System.out.println("Invalid option, please, try again");
                    break;
            }
        }
        System.out.println("****************************************");
    }

    private void searchBookByTitle() {
        System.out.print("Search book by title...Please, enter title: ");
        //Confessions of a Neurasthenic
        //confessions%20of%20a%20neurasthenic
        //jackal
        String inTitle = sc.nextLine();
        var json = consumptionApi.getBookByTitle(inTitle.replace(" ", "%20"));
        System.out.println("json: " + json);
    }

    private void listRegisteredBooks() {
        System.out.println("List registered books...");
    }

    private void listRegisteredAuthors() {
        System.out.println("List registered authors...");
    }

    private void listAuthorsAliveInYear() {
        System.out.println("List authors alive in a given year...");
    }

    private void listBooksByLanguage() {
        System.out.println("List books by language...");
    }
}
