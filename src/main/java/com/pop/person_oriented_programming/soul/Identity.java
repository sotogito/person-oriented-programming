package com.pop.person_oriented_programming.soul;

import java.time.LocalDateTime;

public class Identity {
    private final String name;
    private final LocalDateTime birthday;
    private String identity;

    public Identity(String name, LocalDateTime birthday, String identity) {
        this.name = name;
        this.birthday = birthday;
        this.identity = identity;
    }

}
