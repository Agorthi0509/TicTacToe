package TIcTacToe.model;

import TIcTacToe.strategies.botLevelStrategies.BotLevelStrategyFactory;
import TIcTacToe.strategies.botLevelStrategies.BotlevelStrategy;

public class Bot extends Player{


    private Character symbol;
    private  String name;
    private Integer id;
    private PlayerType playerType;
    private TypeOfLevel level;

    private BotlevelStrategy botlevelStrategy;
    public Bot(Character symbol, String name, Integer id ,PlayerType playerType,TypeOfLevel level) {
        super(symbol, name, id, playerType);

        this.level = level;
        BotLevelStrategyFactory.getBotlevelStrategyFac(level);

    }

    @Override
    public Character getSymbol() {
        return symbol;
    }

    @Override
    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public PlayerType getPlayerType() {
        return playerType;
    }

    @Override
    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public TypeOfLevel getLevel() {
        return level;
    }

    public void setLevel(TypeOfLevel level) {
        this.level = level;
    }
}
