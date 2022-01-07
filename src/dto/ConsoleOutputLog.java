package dto;

import repository.MatchStorage;

public class ConsoleOutputLog {
    public void presentStartGame() {
        MatchStorage aMatchStorage = new MatchStorage();
        int matchers = aMatchStorage.getMatchers();
        System.out.println("Игра началась! На столе " + matchers + " спичек");
    }
}