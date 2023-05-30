package Exerc2605;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        System.out.println("Com esse programa você poderá realizar a soma de 5 números após digita los");
        Scanner entrada = new Scanner(System.in);
        double soma =0;

        for (int numero = 1; numero <=5; numero++) {
            double numero1 = entrada.nextDouble();
            soma += numero1;

        }
        System.out.println("soma do resultado foi" + soma);

    }
}
