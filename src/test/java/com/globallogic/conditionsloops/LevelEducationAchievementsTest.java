package com.globallogic.conditionsloops;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LevelEducationAchievementsTest {

    private Task unit = new Task();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void levelEducationAchievementsInitialLevel(int grade) throws Exception {
        String actual = unit.levelEducationAchievements(grade);
        assertEquals("Initial", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6})
    void levelEducationAchievementsAverageLevel(int grade) throws Exception {
        String actual = unit.levelEducationAchievements(grade);
        assertEquals("Average", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 8, 9})
    void levelEducationAchievementsSufficientLevel(int grade) throws Exception {
        String actual = unit.levelEducationAchievements(grade);
        assertEquals("Sufficient", actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 11, 12})
    void levelEducationAchievementsHighLevel(int grade) throws Exception {
        String actual = unit.levelEducationAchievements(grade);
        assertEquals("High", actual);
    }
}
