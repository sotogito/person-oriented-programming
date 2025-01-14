package com.pop.person_oriented_programming.body.organs;

import com.pop.person_oriented_programming.body.MajorOrgan;

public class Heart {
    private int heartRate;

    public Heart(int heartRate) {
        this.heartRate = heartRate;
    }

    public void beat() {
    }

    public void excited(final int risingBeatValue) {
        heartRate += risingBeatValue;
    }

    public void clamDown(final int fallingBeatValue) {
        heartRate -= fallingBeatValue;
    }

    public MajorOrgan getOrganType() {
        return MajorOrgan.HEART;
    }

}
