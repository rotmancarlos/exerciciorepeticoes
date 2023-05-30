package Exerc2605;

import java.util.Scanner;

public class somenumerosimpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o limite inferior");
        int limiteInferior = sc.nextInt();
        System.out.println("digite o limite superior");
        int limiteSuperior= sc.nextInt();
        int soma =0;
        if (limiteInferior<=limiteSuperior){
            if ((limiteInferior % 2) >= 1) {
                for (int i = limiteInferior; i <= limiteSuperior; i = i + 2) {
                    soma += i;
                }
            } else if ((limiteInferior % 2) == 0) {
                for (int i = limiteInferior + 1; i <= limiteSuperior; i = i + 2) {
                    soma += i;
                }
            }
            System.out.println("soma dos numeros impares de "+ limiteInferior+" a "+  limiteSuperior +" é "+ soma);
        }else {
            System.out.println("Intervalo de valores inválidos");
        }
    }
}
