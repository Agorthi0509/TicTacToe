package TIcTacToe.strategies.botLevelStrategies;

import TIcTacToe.model.TypeOfLevel;

public class BotLevelStrategyFactory {

    BotlevelStrategy botlevelStrategy;
    public static BotlevelStrategy getBotlevelStrategyFac(TypeOfLevel typeOfLevel){
        return new EasyBotLevelStrategy();

    }
}
