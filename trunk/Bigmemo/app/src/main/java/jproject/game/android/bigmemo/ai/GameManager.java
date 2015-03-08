package jproject.game.android.bigmemo.ai;

import java.util.List;

import jproject.game.android.bigmemo.dataModel.Game;
import jproject.game.android.bigmemo.dataModel.Step;

/**
 * Created by Jonathan on 7/03/15.
 */
public class GameManager {


    public static final int DURATION_IN_SECONDES = 60;

    public static final int MAX_NUMBER_OF_STEPS = 10;
    public static final int MAX_NUMBER_OF_PICKED_COLORS = 3;
    public static final String GAME_LOST_MESSAGE = "Game over!";

    private List<Long> colors;

    public GameManager(List<Long> colors) {
        this.colors = colors;
    }

    public Game createGame() {
        Game game = new Game();

        for (int i = 0; i < MAX_NUMBER_OF_STEPS; i++) {
            game.addStep(createStep(MAX_NUMBER_OF_PICKED_COLORS));
        }

        return game;
    }

    private Step createStep(int numberOfPickedColors) {
        Step step = new Step(DURATION_IN_SECONDES);

        for(int i = 0; i < numberOfPickedColors; i++){
            step.addPickedColor(ColorPicker.pick(colors));
        }

        return step;
    }

    public void validateStep(List<Long> userPickedColors, Step step) throws Exception{

        if(!step.getPickedColors().equals(userPickedColors)){
            throw new Exception(GAME_LOST_MESSAGE);
        }
    }

}
