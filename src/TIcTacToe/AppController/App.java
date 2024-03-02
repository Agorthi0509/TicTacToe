package TIcTacToe.AppController;

import TIcTacToe.controller.GameController;
import TIcTacToe.exception.InvalidBotCountException;
import TIcTacToe.exception.NotUniqueException;
import TIcTacToe.exception.PlayerCountException;
import TIcTacToe.model.*;
import TIcTacToe.strategies.winningStrategy.ColWinningStrategy;
import TIcTacToe.strategies.winningStrategy.DiagWinningStrategy;
import TIcTacToe.strategies.winningStrategy.RowWinningStrategy;
import TIcTacToe.strategies.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws InvalidBotCountException, PlayerCountException, NotUniqueException {
        GameController gameController = new GameController();
        int dimension=3;
//        (dimension,players,winningStrategies);

        List<Player> players = new ArrayList<>();
        players.add(new Player('X',"Aditya",1, PlayerType.HUMAN));
        players.add( new Bot('O',"GPT",2,PlayerType.BOT, TypeOfLevel.EASY));
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStrategy());
        winningStrategies.add( new DiagWinningStrategy());
        Game game = gameController.startGame(dimension, players, winningStrategies);
        game.printBoard();

    }
}



