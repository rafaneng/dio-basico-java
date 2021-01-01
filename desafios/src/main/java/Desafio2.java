import java.io.IOException;
import java.util.Scanner;

/*
Você terá o desafio de ler um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Observação apenas para facilitar o cálculo  considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste
nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
 */
public class Desafio2 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int idadeDias = leitor.nextInt();
        int idadeAnos = idadeDias / 365;
        idadeDias -= idadeAnos * 365;
        int idadeMeses = idadeDias / 30;
        int novaIdadeDias = (idadeDias -= idadeMeses * 30);

        System.out.println(idadeAnos + " ano(s)");
        System.out.println(idadeMeses + " mes(es)");
        System.out.println(novaIdadeDias + " dia(s)");
    }
}
