/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.formation.java8;

import java.util.Objects;

/**
 *
 * @author sidaty
 */
public class Car {

    private String car;
    private double mpg;
    private int cylinders;
    private double displacement;
    private double horsepower;
    private double weight;
    private double acceleration;
    private int model;
    private String origin;

    private Car() {
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

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {

        private String car;
        private double mpg;
        private int cylinders;
        private double displacement;
        private double horsepower;
        private double weight;
        private double acceleration;
        private int model;
        private String origin;

        private CarBuilder() {
        }

        public CarBuilder car(String car) {
            this.car = car;
            return this;
        }
        

        public CarBuilder mpg(double mpg) {
            this.mpg = mpg;
            return this;
        }
        

        public CarBuilder cylinders(int cylinders) {
            this.cylinders = cylinders;
            return this;
        }
        

        public CarBuilder origin(String origin) {
            this.origin = origin;
            return this;
        }
        
        
        public Car build() {
            Objects.requireNonNull(car, "car must be not null");
            Objects.requireNonNull(origin, "origin must be not null");
            if(cylinders < 4) {
                throw new IllegalArgumentException("cylinders kjhl");
            }
            
            Car c = new Car();
            c.car = this.car;
            c.origin = this.origin;
            c.mpg = this.mpg;
            c.cylinders = this.cylinders;
            return c;
        }
        
    }

}
