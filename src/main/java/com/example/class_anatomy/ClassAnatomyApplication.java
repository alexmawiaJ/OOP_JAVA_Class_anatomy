package com.example.class_anatomy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassAnatomyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClassAnatomyApplication.class, args);


        Duck mobyDuck = new Duck("Moby", 10, "cereal");
        Duck mobyGangDuck = new Duck("MobyGang", 15, "bread");

        mobyDuck.waddle();
        mobyDuck.waddle();
        mobyDuck.waddle();
        mobyDuck.waddle();
        mobyDuck.waddle();
        mobyGangDuck.waddle();
        System.out.println(mobyDuck);
    }


}
