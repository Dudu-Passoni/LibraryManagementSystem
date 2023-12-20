package lib.com;

import java.util.Scanner;

public class Agendamento {
    private Book agendado;
    private String comprador;

    //Implementar a conexão com o banco
    public void agendarLivro(){
        agendado.agendar();
        System.out.println("Buyer's name: ");
            Scanner myScn = new Scanner(System.in);
                comprador = myScn.nextLine();
    }

    public Book getAgendado() {
        return agendado;
    }

    public void setAgendado(Book agendado) {
        this.agendado = agendado;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }
}
