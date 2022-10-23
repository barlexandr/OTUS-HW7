package ru.otus.tests.unit.utils;

import ru.otus.game.Dice;

public class MyMockDiceImplRealisationForWinSecondTest implements Dice {
    private int callCounter = 2;

    @Override
    public int roll() {
        return callCounter--;
    }
}
