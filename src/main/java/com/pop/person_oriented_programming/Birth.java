package com.pop.person_oriented_programming;

import com.pop.person_oriented_programming.profile.Profile;
import com.pop.person_oriented_programming.soul.Identity;
import java.time.LocalDateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Birth {

    public static void main(String[] args) {
        SpringApplication.run(Birth.class, args);

        Person me = beBorn();
        System.out.println("Hello Person");
    }

    private static Person beBorn() {
        cry();
        return new Person(
                new Identity("myName", LocalDateTime.of(1, 1, 1, 0, 0, 0), "the only one in the world."),
                new Profile(0, 0, 0)
        );
    }

    private static void cry() {
        System.out.println("WAH-WAH");
    }

}
