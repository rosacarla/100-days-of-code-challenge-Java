package exercicios.java.parte.a;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppDiasDeVida {

    public static void main(String[] args) throws ParseException {

        //inicialização de strings com datas e nomes para extração
        String data01 = "Helena 28 03 1989";
        String data02 = "Romeu 21 04 1950";
        String data03 = "Raquel 14 01 2000";
        String data04 = "Enzo 25 12 2021";

        //extração de substrings com datas
        String data11 = data01.substring(7, 17);
        String data22 = data02.substring(6, 16);
        String data33 = data03.substring(7, 17);
        String data44 = data04.substring(5, 15);

        //extração de substrings com nomes
        String nome1 = data01.substring(0, 6);
        String nome2 = data02.substring(0, 5);
        String nome3 = data03.substring(0, 6);
        String nome4 = data04.substring(0, 4);

        //transformação de datas para formato dd/mm/aaa
        String d1 = data11.replaceAll(" ", "/");
        String[] s1 = d1.split("/");
        String data1 = s1[0] + "/" + s1[1] + "/" + s1[2];
        String d2 = data22.replaceAll(" ", "/");
        String[] s2 = d2.split("/");
        String data2 = s2[0] + "/" + s2[1] + "/" + s2[2];
        String d3 = data33.replaceAll(" ", "/");
        String[] s3 = d3.split("/");
        String data3 = s3[0] + "/" + s3[1] + "/" + s3[2];
        String d4 = data44.replaceAll(" ", "/");
        String[] s4 = d4.split("/");
        String data4 = s4[0] + "/" + s4[1] + "/" + s4[2];

        //Calculo da diferenca entre data atual e datas extraídas de string
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        Date d00 = df.parse("04/06/2022"); //ajustar para a data atual
        Date d01 = df.parse(data1);
        long dt1 = (d00.getTime() - d01.getTime() + 3600000) / 86400000L;
        Date d02 = df.parse(data2);
        long dt2 = (d00.getTime() - d02.getTime() + 3600000) / 86400000L;
        Date d03 = df.parse(data3);
        long dt3 = (d00.getTime() - d03.getTime() + 3600000) / 86400000L;
        Date d04 = df.parse(data4);
        long dt4 = (d00.getTime() - d04.getTime() + 3600000) / 86400000L;

        //instanciado objeto dados com as strings completas
        Dados dados = new Dados(data1, data2, data3, data4, nome1, nome2, nome3, nome4);
        System.out.println(dados);

        //imprime resultados calculados
        System.out.println("\n" + nome1 + " viveu até hoje " + dt1 + " dias.");
        System.out.println("\n" + nome2 + " viveu até hoje " + dt2 + " dias.");
        System.out.println("\n" + nome3 + " viveu até hoje " + dt3 + " dias.");
        System.out.println("\n" + nome4 + " viveu até hoje " + dt4 + " dias.");

    }
}

/*

//Transformação de datas em strings para tipo date
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date d01 = formato.parse(dat1);
        Date d02 = formato.parse(dat2);
        Date d03 = formato.parse(dat3);
        Date d04 = formato.parse(dat4);

        LocalDate data1 = LocalDate.parse(d01);
        LocalDate data2 = LocalDate.parse(hoje);
        Period p = Period.between(data1, data2);
        System.out.println(nome1 + " viveu até hoje " + p.getDays() + " dias.");

        Period period = new Period(d01,hoje);
        period.getDays(); // vai retornar a diferença de dias entre as duas datas*/