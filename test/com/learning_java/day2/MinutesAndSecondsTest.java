package com.learning_java.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesAndSecondsTest {

    @Test
    void shouldReturnInvalidValueString() {
        String durationString = MinutesAndSeconds.getDurationString(-1);
        assertEquals("Invalid Value", durationString);
    }

    @Test
    void shouldReturnZeroHourZeroMinutesAndZeroSecondsForZeroSecondsDuration() {
        String durationString = MinutesAndSeconds.getDurationString(0);
        assertEquals("0h 0m 0s", durationString);
    }

    @Test
    void shouldReturnAppropriateDurationStringForMoreThanZeroSeconds() {
        String durationString = MinutesAndSeconds.getDurationString(60);
        assertEquals("0h 1m 0s", durationString);
    }
}