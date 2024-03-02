package TIcTacToe.model;

import TIcTacToe.exception.InvalidBotCountException;
import TIcTacToe.exception.NotUniqueException;
import TIcTacToe.exception.PlayerCountException;
import TIcTacToe.strategies.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
   private List<Player> players;
   private Board board;
   private  List<Move> moves;
   private GameState gameState;
   private List<WinningStrategy> winningStrategies;

   private Game(int dimension,List<Player> players,List<WinningStrategy> winningStrategies){
       this.board = new Board(dimension);
       this.players=players;
       this.winningStrategies = winningStrategies;
   }


    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }


    public static Builder createBuilder(){
        return new Builder();
    }

    public void printBoard() {
       board.printBoard();
    }

    public static class Builder{
        private List<Player> players;
        private int dimension;

        private List<WinningStrategy> winningStrategies;
        private  Builder(){
            this.dimension = 0;
            this.players=new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return  this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return  this;

        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Game build() throws InvalidBotCountException, NotUniqueException, PlayerCountException {
            validateBotCount();
            uniquePlayerSymbol();
            checkPlayerCount();

            return new Game(dimension,players,winningStrategies);
        }

        private void checkPlayerCount() throws PlayerCountException {
            if(dimension != (players.size()+1)){
                throw new PlayerCountException();
            }
        }

        private void uniquePlayerSymbol() throws NotUniqueException {
            Set<Character> hs= new HashSet<>();
            for(Player player:players){
                if(hs.contains(player.getSymbol())){
                    throw new NotUniqueException();
                }
            }
        }

        private void validateBotCount() throws InvalidBotCountException {
            int c=0;
            for(Player player:players){
                if(PlayerType.BOT.equals(player.getPlayerType())){
                    c++;
                }
            }
            if(c>0){
                throw new InvalidBotCountException();
            }
        }


    }
}
