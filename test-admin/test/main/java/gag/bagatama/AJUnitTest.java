package gag.bagatama;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AJUnitTest {

    private static String printer = "Hello World!";

    @Test
    public void printSomething(){
//        System.out.println(printer);
//
//        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//
//        Instant instant = Instant.now();
//        System.out.println(instant == instant);
//        System.out.println(instant == Instant.now());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'proleptic' : u '= era:' y G");

        for (int i = 5; i > -6 ; i--) {
            LocalDate localDate = LocalDate.of(i, 3, 14);
            System.out.println(formatter.format(localDate));
        }
    }
}
