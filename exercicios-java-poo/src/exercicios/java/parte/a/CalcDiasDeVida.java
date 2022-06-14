package exercicios.java.parte.a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcDiasDeVida {

        // Função para imprimir diferença entre data inicial e data final
        static void calcDiferenca(String data_inicial, String data_final) {

                // SimpleDateFormat converte o formato string para objeto data
                SimpleDateFormat diasdevida = new SimpleDateFormat( "dd-MM-yyyy");

                        // Try bloco
                        try {
                                // método parse é usado pra analisar texto da string e produzir a data
                                Date d1 = diasdevida.parse(data_inicial);
                                Date d2 = diasdevida.parse(data_final);

                                // Calcula diferença em millissegundos
                                long difference_In_Time = d2.getTime() - d1.getTime();

                                // Calcala differença em segundos, minutos, horas, anos e dias
                                long difference_In_Seconds = (difference_In_Time / 1000) % 60;

                                long difference_In_Minutes = (difference_In_Time / (1000 * 60)) % 60;

                                long difference_In_Hours = (difference_In_Time / (1000 * 60 * 60)) % 24;

                                long difference_In_Years = (difference_In_Time / (1000L * 60 * 60 * 24 * 365));

                                long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;

                                // Imprime diferença de data em dias
                                String nome1 = new String();
                                System.out.print(nome1 + " viveu até hoje " + difference_In_Days + "dias.");


/*
                                //System.out.println(
                                        difference_In_Years
                                                + " anos, "
                                                + difference_In_Days
                                                + " dias, "
                                                + difference_In_Hours
                                                + " horas, "
                                                + difference_In_Minutes
                                                + " minutos, "
                                                + difference_In_Seconds
                                                + " segundos");*/
                        }

                        // Tratamento de exceção
                        catch (ParseException e) {
                                e.printStackTrace();
                        }
                }



        }

/*
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

        LocalDate data1 = //Data 1;
        LocalDate data2 = //data 2;
        Period p = Period.between(data1, data2);
        System.out.println("DIFERENCA EM DIAS: "+p.getDays());



        LocalDateTime hoje = LocalDateTime.now();

        Calendar dataH = Calendar.getInstance();

        Period period = new Period(data1, data2);
        period.getDays(); // vai retornar a diferença de dias entre as duas datas*/