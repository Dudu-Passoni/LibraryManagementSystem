package lib.com;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book b[] = new Book[5];
        b[0] = new Book("The Lord of the Fire", 49.99F, "Joseph Diaz Correa");
        Newspaper c = new Newspaper();

        Scanner Scn = new Scanner(System.in);
        int aux =4;
        while(aux == 4) {
            System.out.println("*-------LIBRARY MANAGEMENT SYSTEM-------*\n");
            System.out.println("What you want to do?\n1- Register a new book\n2- Store books\n3- Show all\n4- Schedule a book\n5- Exit");

            switch (Scn.nextInt()) {
                case 1:
                    b[0].cadastrarLivro();
                    break;
                case 2:
                    b[0].estocar();
                    break;
                case 3:
                    //mostrar livros (implementar banco de dados)
                    System.out.println("Livros exemploasdasdasd");
                    System.out.println("______________________________________________\n");
                    break;
                case 4:
                    b[0].agendar();
                    break;
                case 5:
                    System.out.println("Exiting...");
                        aux = 5;
                    break;
                default:
                    System.out.println("Please, choose a legal number!");
                    System.out.println("______________________________________________\n");
            }
        }
    }
}