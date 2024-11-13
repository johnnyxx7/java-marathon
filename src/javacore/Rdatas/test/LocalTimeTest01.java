package javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(21, 7, 12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
    }
}
