package ru.netology;

public class Radio {

    private int[] stationsAmount;
    private int stationNumber;
    private int soundVolume;
    private int maxStationNumber;

    public Radio() {
        this.stationsAmount = new int[10];
        this.stationNumber = station(stationsAmount);
        this.maxStationNumber = maxStation(stationsAmount);
    }

    public Radio(int[] stationsAmount) {
        this.stationsAmount = stationsAmount;
        this.stationNumber = station(stationsAmount);
        this.maxStationNumber = maxStation(stationsAmount);
    }

    private int station(int[] stationsAmount) {
        int stationNumber = 0;
        for (int i = 0; i < stationsAmount.length; i++) {
            stationsAmount[i] = i;
            stationNumber = i;
        }
        return stationNumber;
    }

    private int maxStation(int[] stationsAmount) {
        int maxMonth = 0;
        int month = 0;
        for (int max : stationsAmount) {
            if (max > stationsAmount[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public int getStationsAmount() {
        return stationsAmount.length;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }

        if (newStationNumber > maxStationNumber) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void nextStation() {
        int nextAfterMax = 0;
        if (stationNumber < maxStationNumber) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = nextAfterMax;
        }
    }

    public void prevStation() {
        int nextAfterMin = maxStation(stationsAmount);
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = nextAfterMin;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        int soundAfterMax = 100;
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        } else {
            soundVolume = soundAfterMax;
        }
    }

    public void decreaseVolume() {
        int soundBeforeMin = 0;
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = soundBeforeMin;
        }
    }
}