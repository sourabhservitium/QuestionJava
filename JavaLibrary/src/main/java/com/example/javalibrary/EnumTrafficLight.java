package com.example.javalibrary;


// enum Example
//The primary benefit of enums is that they provide a type-safe, readable, and maintainable way to
// represent a fixed set of constants.
public class EnumTrafficLight {
    public static void main(String[] args) {

        TrafficLight light = TrafficLight.RED;

        switch (light) {
            case RED:
                System.out.println("Light is RED: " + light.getAction());
                break;
            case YELLOW:
                System.out.println("Light is YELLOW: " + light.getAction());
                break;
            case GREEN:
                System.out.println("Light is GREEN: " + light.getAction());
                break;
        }

        for (TrafficLight tl : TrafficLight.values()) {
            System.out.println(tl + ": " + tl.getAction());
        }

        TrafficLight greenLight = TrafficLight.valueOf("GREEN");
        System.out.println("Green light action: " + greenLight.getAction());
    }

    public enum TrafficLight {
        RED("Stop"),
        YELLOW("Caution"),
        GREEN("Go");

        private final String action;

        TrafficLight(String action) {
            this.action = action;
        }

        public String getAction() {
            return action;
        }
    }

}


