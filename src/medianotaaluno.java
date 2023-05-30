package Exerc2605;


// - Faça um programa que receba duas notas parciais de um aluno. O programa deve calcular
//        a média alcançada por aluno e apresentar:
//        A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//        A mensagem "Reprovado", se a média for menor do que sete;
//        A mensagem "Aprovado com Distinção", se a média for igual a dez.

import java.util.Scanner;

public class medianotaaluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo de média de um aluno");
        System.out.println("Digite a primeira nota");
        double nota1 = sc.nextDouble();

        System.out.println("digite a segunda");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2)/2;

        if (media >=7.0 && media <10.0){
            System.out.println("aluno aprovado"+ media);
        } else if (media <7.0){
            System.out.println("aluno reprovado"+ media);

        }else {
            System.out.println("aluno aprovado com louvor"+media);
        }
    }
}
