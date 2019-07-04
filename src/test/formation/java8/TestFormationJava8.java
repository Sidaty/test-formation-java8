/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.formation.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 *
 * @author sidaty
 */
public class TestFormationJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/", "Volumes", "Dev", "projets", "formations", "test-formation-java8", "data", "cars.csv");
        

        Files.lines(path)
                .skip(2)
                .limit(200)
                .map(Car::of)
                .peek(System.out::println)
                .collect(Collectors.groupingBy(Car::getCar))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 3)
                .max((e1, e2) -> Integer.valueOf(e1.getValue().size()).compareTo(e2.getValue().size()))
                .map(e -> e.getValue().size() + " - " + e)
                .ifPresent(System.out::println);
        
        Car car = Car.builder().car("Toyota").cylinders(10).mpg(34).origin("ML").build();
        
        System.out.println(car);
        
    }

}
