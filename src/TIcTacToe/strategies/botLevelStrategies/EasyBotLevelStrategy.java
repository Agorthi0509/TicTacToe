package TIcTacToe.strategies.botLevelStrategies;

import TIcTacToe.model.Board;
import TIcTacToe.model.Cell;
import TIcTacToe.model.TypeOfLevel;

public class EasyBotLevelStrategy implements  BotlevelStrategy{

    TypeOfLevel level= TypeOfLevel.EASY;
    public EasyBotLevelStrategy() {
    }

    @Override
    public Cell makeMove(Board board) {
        return null;
    }
}
