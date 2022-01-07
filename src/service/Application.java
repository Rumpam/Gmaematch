package service;

import dto.ConsoleOutputLog;
import entity.LogicPc;
import repository.MatchStorage;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ConsoleOutputLog aConsoleOutputLog = new ConsoleOutputLog();
        aConsoleOutputLog.presentStartGame();

        LogicPc aLogicPc = new LogicPc();
        aLogicPc.stepPC();

        Scanner in = new Scanner(System.in);
        System.out.print("Ход игрока. Введите колличество спичек: ");
        int numberChoiceUser = in.nextInt();

        MatchStorage aMatchStorage = new MatchStorage();
        int result = aMatchStorage.getMatchers() - numberChoiceUser;
        aMatchStorage.setMatchers(result);

        System.out.println(aMatchStorage.getMatchers());
    }
}
