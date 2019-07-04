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
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("/", "Volumes", "Dev", "projets", "formations", "test-formation-java8", "cars.csv");
        
         Files
                .lines(path)
                .skip(2)
//                .limit(100)
                .map(Car::of)
//                .peek(System.out::println)
                .collect(Collectors.groupingBy(Car::getCar))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 3)
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue().size()));
        
//        System.out.println(nb);
    }

    private static class Car {

        String car;
        double mpg;
        int cylinders;
        double displacement;
        double horsepower;
        double weight;
        double acceleration;
        int model;
        String origin;

        public Car() {
        }

        public String getCar() {
            return car;
        }

        public double getMpg() {
            return mpg;
        }

        public int getCylinders() {
            return cylinders;
        }

        public double getDisplacement() {
            return displacement;
        }

        public double getHorsepower() {
            return horsepower;
        }

        public double getWeight() {
            return weight;
        }

        public double getAcceleration() {
            return acceleration;
        }

        public int getModel() {
            return model;
        }

        public String getOrigin() {
            return origin;
        }
        
        
        
        public static Car of(String info) {
            Car car = new Car();
            
            String[] infos = info.split(";");
            
            car.car = infos[0];
            car.mpg = Double.valueOf(infos[1]);
            car.cylinders = Integer.valueOf(infos[2]);
            car.displacement = Double.valueOf(infos[3]);
            car.horsepower = Double.valueOf(infos[4]);
            car.weight = Double.valueOf(infos[5]);
            car.acceleration = Double.valueOf(infos[6]);
            car.model = Integer.valueOf(infos[7]);
            car.origin = infos[8];
            
            return car;
        }

        @Override
        public String toString() {
            return "Car{" + "car=" + car + ", mpg=" + mpg + ", cylinders=" + cylinders + ", displacement=" + displacement + ", horsepower=" + horsepower + ", weight=" + weight + ", acceleration=" + acceleration + ", model=" + model + ", origin=" + origin + '}';
        }


    }
}
