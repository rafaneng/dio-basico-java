import java.io.IOException;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int notaNumerica = leitor.nextInt();
        char notaAlfabetica = 0;

        if(notaNumerica == 0){
            notaAlfabetica = 'E';
        }else if(notaNumerica >= 1 && notaNumerica <= 35 ){
            notaAlfabetica = 'D';
        }else if(notaNumerica >= 36 && notaNumerica <= 60 ){
            notaAlfabetica = 'C';
        }else if(notaNumerica >= 61 && notaNumerica <= 85 ){
            notaAlfabetica = 'B';
        }else if(notaNumerica >= 86 && notaNumerica <= 100 ){
            notaAlfabetica = 'A';
        }

        System.out.println(notaAlfabetica);

    }
}
