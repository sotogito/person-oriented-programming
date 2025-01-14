package com.pop.person_oriented_programming.body;

public enum MajorOrgan {
    BRAIN("뇌"),
    HEART("심장"),
    LUNG("폐"),
    LIVER("간"),
    KIDNEY("신장"),
    STOMACH("위"),
    INTESTINE("장");

    private final String koreanName;

    MajorOrgan(String koreanName) {
        this.koreanName = koreanName;
    }

}
