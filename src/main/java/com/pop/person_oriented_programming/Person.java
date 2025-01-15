package com.pop.person_oriented_programming;

import com.pop.person_oriented_programming.body.Organ;
import com.pop.person_oriented_programming.profile.Profile;
import com.pop.person_oriented_programming.soul.Identity;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private final Identity identity;
    private final Profile profile;
    private final List<Organ> organs = new ArrayList<>();

    public Person(Identity identity, Profile profile) {
        this.identity = identity;
        this.profile = profile;
    }

    public void eat(){

    }

    public void sleep(){

    }

    public void poop(){

    }

}
