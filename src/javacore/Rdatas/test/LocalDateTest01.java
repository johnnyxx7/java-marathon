package javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(2008, Month.SEPTEMBER, 28);
        System.out.println("Ano: " + date.getYear());
        System.out.println("Mês: " + date.getMonth());
        System.out.println("Dia: " + date.getDayOfMonth());
        System.out.println("Dia da semana: " + date.getDayOfWeek());
        System.out.println("Dia do ano: " + date.getDayOfYear());
        if (date.isLeapYear()) {
            System.out.println("O ano não era bissexto.");
        } else {
            System.out.println("O ano era bissexto");
        }

        System.out.println(date);
        System.out.println(now);
    }
}
