package lib.com;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Newspaper extends Book{
    int editionNumber = 0;

    @Override
    public void cadastrarLivro() {
        System.out.println("_____REGISTER A NEWSPAPER_____");
        System.out.printf("What is the title of the NewsPaper?\n");
            Scanner Scn5 = new Scanner(System.in);
                setNome(Scn5.nextLine());
        System.out.println("Who is the publisher?");
                setAutor(Scn5.nextLine());
        System.out.println("What is the edition's number?");
                setEditionNumber(Scn5.nextInt());
        System.out.println("Do you want to continue?\n\n1- Yes\n2- No");
            switch (Scn5.nextInt()){
                case 1:
                    break;
                case 2:
                    setEditionNumber(0);
                    setAutor(null);
                    setNome(null);
                    break;
                default:
                    break;
            }
    }

    //Specials

    public int getEditionNumber() {
        return editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }
}
