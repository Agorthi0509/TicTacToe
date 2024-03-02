package TIcTacToe.model;

public class Player {
    private Character symbol;
   private  String name;
    private Integer id;
    private PlayerType playerType;

    public Player(Character symbol, String name, Integer id, PlayerType playerType) {
        this.symbol = symbol;
        this.name = name;
        this.id = id;
        this.playerType = playerType;
    }

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
