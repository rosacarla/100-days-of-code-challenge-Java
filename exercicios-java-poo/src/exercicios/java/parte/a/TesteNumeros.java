package exercicios.java.parte.a;

/*
 * EXERCÍCIO: Leia 5 números
 * Crie um programa que leia 5 números e imprima na tela:
 * • qual o maior número
 * • qual o menor número
 * • qual a média dos valores
 * Se os 5 números forem iguais, informe ao usuário que são iguais.
 */

import java.util.*;

public class TesteNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //aciona entrada de dados pelo teclado

        //inicialização das variaveis e array
        int i;
        double maior = 0;
        double menor = 0;
        double soma = 0;
        double media;
        Double[] numeros = new Double[5];

        System.out.println("Informe 5 números para saber qual é o maior, o menor e a média.");

        //loop para entrada de dados
        for (i = 0; i < 5; i++) {  //define contador i das iterações
            System.out.println("\nInforme número " + (i + 1) + ":"); //solicita numeros
            numeros[i] = scan.nextDouble(); //armazena entradas no array numeros

            //condição para armazenar numeros maior e menor
            if (i == 0) {
                maior = numeros[i];
                menor = numeros[i];
            }
            //guarda soma dos números do array para calcular media
            soma = soma + numeros[i];

            //condição para achar numero maior
            if (numeros[i] > maior) { //se valor digitado é maior que valor armazenado na var maior
                maior = numeros[i];
            }
            //condição para achar nro menor
            if (numeros[i] < menor) { //se valor digitado é menor que valor armazenado na var menor
                menor = numeros[i];
            }
        }
        //cálculo da média
        media = soma / 5;

        //verifica se elementos de array são diferentes
        var array = Arrays.stream(numeros).distinct().sorted().toArray();

        //condição para verificar tamanho de array
        if (array.length == 1) {  //se tamanho = 1, todos os elementos sao iguais
            //imprime mensagem que solicita novas entradas e encerra programa
            System.out.println("\nTodos os números são iguais, digite números diferentes.");

        } else {  //se elementos não são todos iguais, imprime resultados
            System.out.println("\nMaior número: " + maior);
            System.out.println("\nMenor número: " + menor);
            String med = String.format("%.04f", media); //metodo format() pra edicao de double com 4 casas decimais
            System.out.printf("\nMédia: " + med);
        }
        scan.close();
    }

    //metodo construtor da classe principal do programa
    public TesteNumeros() {
    }

    //sobrescreve toString para não imprimir endereço de memória
    @Override
    public String toString() {
        return "TesteNumeros{}";
    }
}