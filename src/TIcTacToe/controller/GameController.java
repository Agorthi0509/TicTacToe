package TIcTacToe.controller;

import TIcTacToe.exception.InvalidBotCountException;
import TIcTacToe.exception.NotUniqueException;
import TIcTacToe.exception.PlayerCountException;
import TIcTacToe.model.Game;
import TIcTacToe.model.Player;
import TIcTacToe.strategies.winningStrategy.WinningStrategy;

import java.util.List;

public class GameController {


    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws InvalidBotCountException, PlayerCountException, NotUniqueException {

       return Game.createBuilder()
               .setDimension(dimension)
               .setPlayers(players)
               .setWinningStrategies(winningStrategies)
               .build();


    }
    public void printBoard(Game game){
        game.printBoard();
    }
}
