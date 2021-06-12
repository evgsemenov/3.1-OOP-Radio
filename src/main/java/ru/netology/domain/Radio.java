package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int minFrequency = 0;
    private int userMaxFrequency = 9;
    private int currentFrequency;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public void setCurrentFrequency(int currentFrequency) {
        if (currentFrequency > userMaxFrequency)
            return;
        if (currentFrequency < minFrequency)
            return;
        this.currentFrequency = currentFrequency;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;
    }

    public void increaseFrequency() {
        if (currentFrequency < userMaxFrequency) {
            currentFrequency = currentFrequency + 1;
        } else {
            currentFrequency = minFrequency;
        }
    }

    public void decreaseFrequency() {
        if (currentFrequency > minFrequency) {
            currentFrequency = currentFrequency - 1;
        } else {
            currentFrequency = userMaxFrequency;
        }
    }

    void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}