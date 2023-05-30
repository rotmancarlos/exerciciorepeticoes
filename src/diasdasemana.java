package Exerc2605;

import java.util.Scanner;

public class diasdasemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digitar um número correspondente ao dia da semana: ");
        int numeroDia = scanner.nextInt();
        String diaSemana = "";
        switch (numeroDia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sabado";
                break;
            default:
                diaSemana = "Valor inválido";

        }
        System.out.println("Dia da semana correspondente: " + diaSemana);
    }
}
