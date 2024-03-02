package TIcTacToe.strategies.winningStrategy;

import TIcTacToe.model.Board;
import TIcTacToe.model.Cell;

public interface WinningStrategy {
    boolean checkMove(Board board, Cell cell);
}
