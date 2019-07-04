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
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 *
 * @author sidaty
 */
public class TestFormationJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> noms = Arrays.asList("Toto78", "Tata", "Titi travaille");

        int tailleTotale = 0;

        long nb = noms
                .stream()
                .peek(nom -> System.out.println(nom))
                .map(nom -> nom.length())
                .peek(taille -> System.out.println(taille))
                .filter(taile -> taile > 4)
                .peek(taille -> System.out.println(taille))
                .count();

        System.out.println("Count : " + nb);
//        for (String nom : noms) {
//            int taille = transformateur.transformer(nom);
//            System.out.println("taille : " + taille);
//            tailleTotale += taille;
//        }

        System.out.println("tailleTotale : " + tailleTotale);
    }

}
