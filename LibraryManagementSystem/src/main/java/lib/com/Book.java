package lib.com;

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