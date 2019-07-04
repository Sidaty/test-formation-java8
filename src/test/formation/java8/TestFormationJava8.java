/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.formation.java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sidaty
 */
public class TestFormationJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds()
                .stream()
                .filter(s -> s.contains("Tim"))
                .forEach(System.out::println);
        System.out.println("count : " + ZoneId.getAvailableZoneIds().stream().count());
        
        ZoneId zone = ZoneId.of("Europe/Athens");
        
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zone : " + zonedDateTime.getZone().getId());
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime : " + localDateTime);
    }

    private static void test03() {
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(2000, Month.MARCH, 3);
        System.out.println(localDate);
        System.out.println("getDayOfWeek : " + localDate.getDayOfWeek());
        System.out.println("getDayOfMonth : " + localDate.getDayOfMonth());
        System.out.println("getDayOfYear : " + localDate.getDayOfYear());
        
        Period period = localDate.until(now);
        System.out.println("getYears : " + period.getYears());
        System.out.println("getMonths : " + period.getMonths());
        System.out.println("getDays : " + period.getDays());
//        System.out.println("HOURS : " + period.get(ChronoUnit.HOURS));
    }

    private static void test02() throws InterruptedException {
        Date date = new Date(2019, 6, 4);

        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.YEAR);
        calendar.get(Calendar.MONTH);
        calendar.get(Calendar.DATE);
        calendar.get(Calendar.DAY_OF_MONTH);

        long time = calendar.getTime().getTime();

        System.out.println("time : " + time + ", " + calendar.getTime());

        date.toInstant();
        Instant instant1 = Instant.now();
        Thread.sleep(2390l);
        Instant instant2 = Instant.now();
        Duration duration = Duration.between(instant1, instant2);
        System.out.println("Nano : " + duration.getNano());
        System.out.println("Secondes : " + duration.getSeconds());
//        Instant instant2 = Instant.now().plus(10, ChronoUnit.MINUTES);

        duration.plusDays(2);
        duration.minusMillis(30);
    }

    private static void test01() {
        List<Integer> elts = Arrays.asList(3, 5, 8, 9, 19);

        int sum = Utils.sum(elts);

        System.out.println(elts + " = " + sum);
    }

}
