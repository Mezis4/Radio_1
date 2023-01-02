package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationsAmountByDefault() {
        Radio function = new Radio();

        Assertions.assertEquals(10, function.getStationsAmount());
    }

    @Test
    public void shouldSetStationsAmount() {
        Radio function = new Radio(new int[4]);

        Assertions.assertEquals(4, function.getStationsAmount());
    }

    @Test
    public void shouldSetStationsAmount1() {
        Radio function = new Radio(new int[1]);

        Assertions.assertEquals(1, function.getStationsAmount());
    }

    @Test
    public void shouldSetStationsAmount9() {
        Radio function = new Radio(new int[9]);

        Assertions.assertEquals(9, function.getStationsAmount());
    }

    @Test
    public void shouldSetStationsAmount0() {
        Radio function = new Radio(new int[0]);

        Assertions.assertEquals(0, function.getStationsAmount());
    }

    @Test
    public void shouldSetStationNumberWithDefaultStationsAmount() {
        Radio function = new Radio();

        function.setStationNumber(7);

        int expected = 7;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber0WithDefaultStationsAmount() {
        Radio function = new Radio();

        function.setStationNumber(0);

        int expected = 0;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber1WithDefaultStationsAmount() {
        Radio function = new Radio();

        function.setStationNumber(1);

        int expected = 1;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber8WithDefaultStationsAmount() {
        Radio function = new Radio();

        function.setStationNumber(8);

        int expected = 8;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber9WithDefaultStationsAmount() {
        Radio function = new Radio();

        function.setStationNumber(9);

        int expected = 9;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberWithSetStationsAmount() {
        Radio function = new Radio(new int[6]);

        function.setStationNumber(3);

        int expected = 3;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStationNumberWithSetStationsAmount() {
        Radio function = new Radio(new int[6]);

        function.setStationNumber(5);

        int expected = 5;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        Radio function = new Radio();

        function.setStationNumber(-1);

        int expected = 9;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMaxWithDefaultStationsAmount() {
        Radio function = new Radio();

        function.setStationNumber(10);

        int expected = 9;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMaxWithSetStationsAmount() {
        Radio function = new Radio(new int[5]);

        function.setStationNumber(8);

        int expected = 4;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStationWithDefaultStationsAmount() {
        Radio function = new Radio();

        function.setStationNumber(8);

        function.nextStation();

        int expected = 9;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStationWithSetStationsAmount() {
        Radio function = new Radio(new int[6]);

        function.setStationNumber(4);

        function.nextStation();

        int expected = 5;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchTo0AfterMaxStationWithDefaultStationsAmount() {
        Radio function = new Radio();

        function.setStationNumber(9);

        function.nextStation();

        int expected = 0;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchTo0AfterMaxStationWithSetStationsAmount() {
        Radio function = new Radio(new int[6]);

        function.setStationNumber(5);

        function.nextStation();

        int expected = 0;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevStationWithDefaultStationsAmount() {
        Radio function = new Radio();

        function.setStationNumber(1);

        function.prevStation();

        int expected = 0;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevStationWithSetStationsAmount() {
        Radio function = new Radio(new int[7]);

        function.setStationNumber(1);

        function.prevStation();

        int expected = 0;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToStationBeforeMaxStationIfSetStationNumberAboveMaxWithDefaultStationsAmount() {
        Radio function = new Radio();

        function.setStationNumber(10);

        function.prevStation();

        int expected = 8;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToStationBeforeMaxStationIfSetStationNumberAboveMaxWithSetStationsAmount() {
        Radio function = new Radio(new int[6]);

        function.setStationNumber(7);

        function.prevStation();

        int expected = 4;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToMaxStationAfterStation0WithDefaultStationsAmount() {
        Radio function = new Radio();

        function.setStationNumber(0);

        function.prevStation();

        int expected = 9;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToMaxStationAfterStation0WithSetStationsAmount() {
        Radio function = new Radio(new int[7]);

        function.setStationNumber(0);

        function.prevStation();

        int expected = 6;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() {
        Radio function = new Radio();

        function.setSoundVolume(7);

        int expected = 7;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume0() {
        Radio function = new Radio();

        function.setSoundVolume(0);

        int expected = 0;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume1() {
        Radio function = new Radio();

        function.setSoundVolume(1);

        int expected = 1;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume99() {
        Radio function = new Radio();

        function.setSoundVolume(99);

        int expected = 99;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume100() {
        Radio function = new Radio();

        function.setSoundVolume(100);

        int expected = 100;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeUnderMin() {
        Radio function = new Radio();

        function.setSoundVolume(-1);

        int expected = 0;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() {
        Radio function = new Radio();

        function.setSoundVolume(101);

        int expected = 0;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpSoundVolume() {
        Radio function = new Radio();

        function.setSoundVolume(99);

        function.increaseVolume();

        int expected = 100;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnUpSoundVolumeAfter100() {
        Radio function = new Radio();

        function.setSoundVolume(100);

        function.increaseVolume();

        int expected = 100;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownSoundVolume() {
        Radio function = new Radio();

        function.setSoundVolume(1);

        function.decreaseVolume();

        int expected = 0;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnDownSoundVolumeAfter0() {
        Radio function = new Radio();

        function.setSoundVolume(0);

        function.decreaseVolume();

        int expected = 0;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
