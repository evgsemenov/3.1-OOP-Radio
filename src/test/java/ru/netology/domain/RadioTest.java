package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
//    @Test
//    public void shouldGetAndSetRadioOn(){
//        Radio radio = new Radio();
//        boolean expected = false;
//        radio.setRadioOn(expected);
//        assertEquals(expected, radio.isRadioOn());
//}

    @Test
    public void shouldIncreaseCurrentFrequencyUnderMaxFrequency() {
        Radio radio = new Radio();
        int currentFrequency = 8;
        int expected = 9;
        radio.setCurrentFrequency(currentFrequency);
        radio.increaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldIncreaseCurrentFrequencyEqualMaxFrequency() {
        Radio radio = new Radio();
        int currentFrequency = 9;
        int expected = 0;
        radio.setCurrentFrequency(currentFrequency);
        radio.increaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldIncreaseCurrentFrequencyEqualMinFrequency() {
        Radio radio = new Radio();
        int currentFrequency = 0;
        int expected = 1;
        radio.setCurrentFrequency(currentFrequency);
        radio.increaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldDecreaseCurrentFrequencyOverMinFrequency() {
        Radio radio = new Radio();
        int currentFrequency = 1;
        int expected = 0;
        radio.setCurrentFrequency(currentFrequency);
        radio.decreaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldDecreaseCurrentFrequencyEqualMinFrequency() {
        Radio radio = new Radio();
        int currentFrequency = 0;
        int expected = 9;
        radio.setCurrentFrequency(currentFrequency);
        radio.decreaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldDecreaseCurrentFrequencyEqualMaxFrequency() {
        Radio radio = new Radio();
        int currentFrequency = 9;
        int expected = 8;
        radio.setCurrentFrequency(currentFrequency);
        radio.decreaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldReturnCurrentFrequencyOverMaxFrequency() {
        Radio radio = new Radio();
        int currentFrequency = 10;
        int expected = 0;
        assertEquals(expected, radio.getCurrentFrequency());

    }

    @Test
    public void shouldReturnCurrentFrequencyUnderMinFrequency() {
        Radio radio = new Radio();
        int currentFrequency = -1;
        int expected = 0;
        assertEquals(expected, radio.getCurrentFrequency());

    }

    @Test
    public void shouldIncreaseCurrentVolumeUnderMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = radio.getCurrentVolume();
        int expected = 1;
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }
//    @Test
//    public void shouldIncreaseCurrentVolumeEqualMaxVolume() {
//        Radio radio = new Radio();
//        int currentVolume = 10;
//        int expected = 10;
//        radio.increaseVolume();
//        assertEquals(expected, radio.getCurrentVolume());
//
//
//    }
}







