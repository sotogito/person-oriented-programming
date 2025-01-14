package com.pop.person_oriented_programming.body;

public enum OrganSystem {
    DIGESTIVE("소화계"),
    RESPIRATORY("호흡계"),
    CIRCULATORY("순환계"),
    URINARY("비뇨계"),
    REPRODUCTIVE("생식계"),
    ENDOCRINE("내분비계"),
    NERVOUS("신경계"),
    IMMUNE("면역계"),
    SKELETAL("골격계"),
    MUSCULAR("근육계"),
    INTEGUMENTARY("외피계");

    private final String koreanName;

    OrganSystem(String koreanName) {
        this.koreanName = koreanName;
    }

}
