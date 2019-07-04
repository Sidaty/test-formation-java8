/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.formation.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author sidaty
 */
public class TestFormationJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> noms = Arrays.asList("Toto78", "Tata", "Titi", "Titi travaille");
        
        int tailleTotale = 0;

        long nb = noms
                .stream()
                .peek(System.out::println)
                .map(String::length)
                .peek(System.out::println)
                .filter(taile -> taile > 4)
                .peek(System.out::println)
                .count();

        List<String> NOMS = noms
                .stream()
                .parallel()
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .collect(Collectors.toList());
        
        System.out.println(NOMS);

        Map<String, List<String>> NOMS_P = noms
                .stream()
                .parallel()
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .collect(Collectors.groupingBy(nom -> nom.substring(1, 2)));
        
        System.out.println(NOMS_P);

        System.out.println("Count : " + nb);
//        for (String nom : noms) {
//            int taille = transformateur.transformer(nom);
//            System.out.println("taille : " + taille);
//            tailleTotale += taille;
//        }

        System.out.println("tailleTotale : " + tailleTotale);
        
    }

}
