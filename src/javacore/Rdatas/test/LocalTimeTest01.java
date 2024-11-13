package javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(21, 7, 12);
        LocalTime timeNow = LocalTime.now();
        System.out.println("Hora criada: " + time);
        System.out.println("Hora atual: " + timeNow);
        System.out.println("Hora: " + timeNow.getHour());
        System.out.println("Minuto: " + timeNow.getMinute());
        System.out.println("Segundo: " + timeNow.getSecond());
        System.out.println("Nanosegundo: " + timeNow.getNano());
    }
}
