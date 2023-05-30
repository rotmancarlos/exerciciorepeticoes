package Exerc2605;

import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("calculo de numero primo");
        double numero = sc.nextDouble();
        double divisao;
        int naoPrimo=0;
        int primo=0;
        for (int i =1;i<=numero;i++){
            divisao = numero % i;
            System.out.println(i+ " divisao "+divisao);
            if (divisao==0){
                primo++;
                // System.out.println(i+ " Primo "+primo);
            }
        }
        if(primo<=2) {
            System.out.println("o numero " + numero + " é primo");
        }else{
            System.out.println("o numero " + numero + " não é primo");
        }
    }
}
