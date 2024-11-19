package javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2005, Month.DECEMBER, 2, 21, 7, 0);
        LocalDateTime now = LocalDateTime.now();
        long anos = ChronoUnit.YEARS.between(aniversario, now);
        long meses = ChronoUnit.MONTHS.between(aniversario, now);
        long semanas = ChronoUnit.WEEKS.between(aniversario, now);
        long dias = ChronoUnit.DAYS.between(aniversario, now);

        System.out.println("-----------------------------------");
        System.out.println("Se passou desde o seu aníversário: ");
        System.out.println("-----------------------------------");
        System.out.println("Anos: " + anos);
        System.out.println("Meses: " + meses);
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
    }
}
