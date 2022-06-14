package exercicios.java.parte.a;

import java.util.Scanner;
/**
 * EXERCÍCIO: Leia 5 números
 * Crie um programa que leia 5 números e imprima na tela:
 * • qual o maior número
 * • qual o menor número
 * • qual a média dos valores
 * Se os 5 números forem iguais, informe ao usuário que são iguais.
 */
public class ComparaNumeros {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);  //entrada de fluxo de dados
            double maior = 0;
            double menor = 0;
            double soma = 0;
            double media;

            for (int x = 0; x < 5; x++) {

                System.out.println("Informe um número:");
                double nro = scan.nextDouble();

                if (x == 0) {

                    maior = nro;
                    menor = nro;
                }

                if (nro > maior) {  //condicao para nro maior

                    maior = nro;  //variavel recebe nro maior
                }

                if (nro < menor) {  //cocndicao para nro menor

                    menor = nro;   //variavel recebe nro menor
                }

                soma = soma + nro; //soma nro informado com variável soma (independente do valor)

            }

            media = soma / 5; //calcula media

            //impressao dos números lidos
            System.out.println("Maior número: " + maior + " - Menor número: " + menor + " - Média: " + media);
        }
}
