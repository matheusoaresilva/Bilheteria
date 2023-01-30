package Bilheteria.src;

import Bilheteria.src.entities.Bilheteria;
import Bilheteria.src.entities.Shows;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bilheteria bilheteria = new Bilheteria();

//        CADASTRANDO SHOW
        System.out.print("INSIRA O NOME DO SHOW QUE DESEJA CADASTRAR: ");
        String nome = sc.nextLine();

        System.out.print("INSIRA A DATA DO SHOW (dd/MM/yyyy): ");
        String dataDigitada = sc.nextLine();
        LocalDate data = LocalDate.parse(dataDigitada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("INSIRA O HORARIO DO SHOW (HH:mm): ");
        String horaDigitada = sc.nextLine();
        LocalTime hora = LocalTime.parse(horaDigitada, DateTimeFormatter.ofPattern("HH:mm"));

        System.out.print("INSIRA O VALOR DE CADA INGRESSO: ");
        double valor = sc.nextDouble();

        System.out.print("INSIRA A QUANTIDADE DE INGRESSOS DISPONIVEIS INICIALMENTE PARA VENDAS: ");
        int qtd = sc.nextInt();
//
        Shows s1 = new Shows(nome, data, hora, valor, qtd);

        bilheteria.cadastrarShows(s1);


//        VENDENDO INGRESSOS
        System.out.println("Ingressos disponiveis: " + bilheteria.consultaShows());

        System.out.println("Qual show deseja comprar: ");
        sc.nextLine();
        Shows sh = new Shows(sc.nextLine());
        System.out.println("Qual a quantidade de ingressos: ");
        int qtdShow = sc.nextInt();

        bilheteria.vendasBilhete(s1, qtdShow);
        bilheteria.consultaShows();

    }
}
