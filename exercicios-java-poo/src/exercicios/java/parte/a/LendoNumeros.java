package exercicios.java.parte.a;

/*
 * EXERCÍCIO: Leia 5 números
 * Crie um programa que leia 5 números e imprima na tela:
 * • qual o maior número
 * • qual o menor número
 * • qual a média dos valores
 * Se os 5 números forem iguais, informe ao usuário que são iguais.
 */

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class LendoNumeros {
    public static void main(String[] args) {

        int[] numeros = new int[(5)];
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int media = 0;

        for (int i = 0; i < 5; i++) {
            String teste1 = JOptionPane.showInputDialog("Digite um número: " + (i + 1));
            numeros[i] = parseInt(teste1);

            if (i == 0) {
                maior = numeros[i];
                menor = numeros[i];
            }

            soma = soma + numeros[i];

            //salva maior nro em maior
            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            //salva menor nro em menor
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            media = (soma / 5);

        }
        String[] numerais = {String.valueOf(numeros)};

        String primeiroNumero = null;
        boolean tudoIgual = true;
            for (int i = 0; i < numerais.length; i++) {
                if (i == 0) {
                    primeiroNumero = numerais[i];
                }
                if (!numerais.equals(primeiroNumero)) {
                    continue;  //tudoIgual = false;
                }
            }

        if (tudoIgual) {
            JOptionPane.showMessageDialog(null, "Todos os números são iguais! Digite números diferentes.");
            //System.out.println("\"Todos os números são iguais! Digite números diferentes.\"");

        } else {
            JOptionPane.showMessageDialog( null, "Maior número: " + maior + "\n" + "Menor número: "
                    + menor + "\n" + "Média: " + media + "\n");
            System.exit(0);
        }
    }
}


