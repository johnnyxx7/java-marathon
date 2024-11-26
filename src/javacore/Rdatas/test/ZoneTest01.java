package javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortsIds = ZoneId.SHORT_IDS;
        System.out.println(shortsIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);
        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        ZoneOffset offsetRoma = ZoneOffset.of("+01:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetRoma);
        System.out.println(offsetDateTime);
        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(offsetRoma);
        System.out.println(offsetDateTime2);
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1911, 9, 20);
        JapaneseDate meijiEra = java.time.chrono.JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
