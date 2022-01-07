package entity;

import myGame.repository.MatchStorage;

public class LogicPc {
    private final int firstNumber = 1;

    public void stepPC() {
        MatchStorage aMatchStorage = new MatchStorage();
        int result = aMatchStorage.getMatchers() - firstNumber;
        aMatchStorage.setMatchers(result);
        System.out.println("Колличество выбранных компьютером спичек: " + firstNumber);
        System.out.println("На столе осталось спичек: " + result);

    }
}
