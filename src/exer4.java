package Exerc2605;

import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Esse programa tem objetivo de zerar a fila de um banco");
        System.out.println("Qual a quantidade de pessoas na fila?");
        int pessoasAguardando = entrada.nextInt();
        int contador = pessoasAguardando -1;

        while(contador <= pessoasAguardando && contador != -1) {
            System.out.println("O seu número da fila é: " + (contador+ 1));
            System.out.println("O número de pessoas aguardando no momento é: " + contador);

            contador--;
        }
    }
}
