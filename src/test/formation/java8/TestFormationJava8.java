/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.formation.java8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author sidaty
 */
public class TestFormationJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("zone : " + now);
        ZonedDateTime nextMeeting = now.plus(1, ChronoUnit.WEEKS);
        System.out.println("nextMeeting : " + nextMeeting);
        
        ZonedDateTime nextMeetingForNairobi = nextMeeting.withZoneSameInstant(ZoneId.of("Africa/Nairobi"));
        System.out.println("nextMeetingForNairobi : " + nextMeetingForNairobi);
        
        Date date = new Date();
        Instant instant = date.toInstant();
        
        Date date2 = Date.from(instant);
    }

}
