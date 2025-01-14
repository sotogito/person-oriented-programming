package com.pop.person_oriented_programming.body.organs;

import com.pop.person_oriented_programming.body.MajorOrgan;
import com.pop.person_oriented_programming.body.brain.Emotion;
import com.pop.person_oriented_programming.body.brain.Memory;
import com.pop.person_oriented_programming.body.brain.Thinking;
import java.util.List;

public class Brain {
    private final List<Memory> memories;
    private Emotion nowEmotion;
    private final Thinking thinking;

    public Brain(List<Memory> memories, Emotion emotion, Thinking thinking) {
        this.memories = memories;
        this.nowEmotion = emotion;
        this.thinking = thinking;
    }

    public void addMemory(Memory memory) {
        memories.add(memory);
    }

    public void setNowEmotion(Emotion emotion) {
        this.nowEmotion = emotion;
    }

    public MajorOrgan getOrganType() {
        return MajorOrgan.BRAIN;
    }

}
