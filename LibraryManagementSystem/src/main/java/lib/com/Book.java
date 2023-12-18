package lib.com;

import java.util.Scanner;

public class Book {
    private String nome;
    private float preco;
    private String autor;
    private int quantidade;

    public void agendar(){
        if(getQuantidade() != 0) {
            setQuantidade(getQuantidade() - 1);
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
                System.out.println("How many books do you wanna add? ");
                    int aux1 = Est.nextInt();
                setQuantidade(getQuantidade() + aux1);
                System.out.println(aux1 + " was added to the library");
                System.out.println("______________________________________________\n");
                    break;
            case 2:
                System.out.println("How many books do you wanna remove? ");
                    int aux2 = Est.nextInt();
                setQuantidade(getQuantidade() - aux2);
                System.out.println(aux2 + " was removed from the library");
                System.out.println("______________________________________________\n");
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