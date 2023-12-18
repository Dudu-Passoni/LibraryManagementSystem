package lib.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book b[] = new Book[5];
        b[0] = new Book("The Lord of the Fire", 49.99F, "Joseph Diaz Correa");
        b[0].status();
        b[0].estocar();
        b[0].estocar();
        b[0].status();
    }
}