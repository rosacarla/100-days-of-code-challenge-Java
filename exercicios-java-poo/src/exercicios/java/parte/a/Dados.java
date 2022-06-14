package exercicios.java.parte.a;


/* EXERCÍCIO: Calcular dias vivo
 * As entradas devem ser datas de nascimento passadas para a função no formato de Strings
 * dividida por / conforme exemplo abaixo:
 *
 * String data1 = “ Vinicius 14 02 92”;
 *
 * A função deve calcular a idade da pessoa em dias e apresentar conforme formatos abaixo:
 * “Vinicius viveu até hoje N dias”
 *
 * Usar os inputs abaixo:
 * “Helena 28 03 1989”
 * “Romeu 21 04 1950”
 * “Raquel 14 01 2000”
 * “Enzo 25 12 2021"
 */

public class Dados {
    public String data1;
    public String data2;
    public String data3;
    public String data4;
    public String nome1;
    public String nome2;
    public String nome3;
    public String nome4;

    //metodo construtor vazio
    public Dados() {
    }
    public Dados(String data1, String data2, String data3, String data4,
                 String nome1, String nome2, String nome3, String nome4) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.nome3 = nome3;
        this.nome4 = nome4;
    }
//metodos getters e setters da classe Datas


    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    public String getData4() {
        return data4;
    }

    public void setData4(String data4) {
        this.data4 = data4;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getNome3() {
        return nome3;
    }

    public void setNome3(String nome3) {
        this.nome3 = nome3;
    }

    public String getNome4() {
        return nome4;
    }

    public void setNome4(String nome4) {
        this.nome4 = nome4;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "data1='" + data1 + '\'' +
                ", data2='" + data2 + '\'' +
                ", data3='" + data3 + '\'' +
                ", data4='" + data4 + '\'' +
                ", nome1='" + nome1 + '\'' +
                ", nome2='" + nome2 + '\'' +
                ", nome3='" + nome3 + '\'' +
                ", nome4='" + nome4 + '\'' +
                '}';
    }
}

/*

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


Pattern pattern = Pattern.compile("(\\d{2} \\d{2} \\d{4})");

        Matcher matcher = pattern.matcher(data1);

        if(matcher.find()) {
            System.out.println(matcher.group()); // printa, por ex.: 28 03 1989
        }

        // transformação do formatos de datas possíveis
        String s = "10 de abr de 2019";
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("[dd/MM/uuuu][dd MMM uuuu]");
        LocalDate data = LocalDate.parse(s, parser); // obter a data
        // formato de saída
        DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        System.out.println(formatoSaida.format(data)); //
    } */