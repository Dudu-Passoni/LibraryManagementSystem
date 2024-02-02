package lib.com;

import java.util.Scanner;

public class Book {
    private String nome;
    private float preco;
    private String autor;
    private int quantidade;

    public void agendar(){
        System.out.println("Which book would you like to schedule?");
        Scanner Est4 = new Scanner(System.in);
        Est4.nextLine();
        //fazer a consulta no banco de dados

        if(getQuantidade() != 0) {
            setQuantidade(getQuantidade() - 1);
            System.out.println("Scheduled!");
        }
        else
            System.out.println("It was not possible to schedule this book.");
    }

    public void status(){
        System.out.println("Nome: " + nome
                + "\nAutor: " + autor
                + "\nPreço: " + preco
                + "\nQuantidade em Estoque: " + quantidade
                + "\n______________________________________________\n");
    }

    public void estocar(){
        Scanner Est = new Scanner(System.in);
        System.out.println("What you want to do?\n\n1- Add\n2- Remove\n3- Exit");
        switch (Est.nextInt()){
            case 1:
                System.out.println("Would you like to register a new book, or add an existing one? 1/2");
                if(Est.nextInt() == 1){
                    cadastrarLivro();
                }
                else
                    System.out.println("What book would you like to add?");
                //fazer a consulta no banco de dados

                System.out.println("How many books do you wanna add? ");
                    int aux1 = Est.nextInt();
                setQuantidade(getQuantidade() + aux1);
                System.out.println("Done!");
                System.out.println("______________________________________________\n");
                    break;
            case 2:
                System.out.println("How many books do you wanna remove? ");
                    int aux2 = Est.nextInt();
                setQuantidade(getQuantidade() - aux2);
                System.out.println("Done!");
                System.out.println("______________________________________________\n");
                    break;
            default:
                    break;
        }
    }

    public void cadastrarLivro(){
        Scanner Est1 = new Scanner(System.in);
        System.out.println("_____REGISTER A BOOK_____");
        System.out.println("What you want to do?\n\n1- Register a new book\n2- Remove an existing book\n3- Exit");
            int aux1 = Est1.nextInt();
                switch (aux1){
                    case 1:
                        Scanner Est2 = new Scanner(System.in);
                        System.out.println("Name the author please: ");
                            autor = Est2.nextLine();
                        System.out.println("The name of the new book: ");
                            nome = Est2.nextLine();
                        System.out.println("The book will cost: ");
                            preco = Est2.nextFloat();
                        //salvar no banco de dados
                        System.out.println("A new book was registered!\n");
                        System.out.println("______________________________________________\n");
                            break;
                    case 2:
                        System.out.println("What is the name of the book that you want to remove? ");
                            Est1.nextLine(); //Fazer a pesquisa do livro e remover do banco de dados
                            break;
                    default:
                            break;
                }
    }


    public Book() {
    }

    public Book(String nome, float preco, String autor) {
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}