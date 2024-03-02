package TIcTacToe.strategies.winningStrategy;

import TIcTacToe.model.Board;
import TIcTacToe.model.Cell;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkMove(Board board, Cell cell) {
        return false;
    }
}
