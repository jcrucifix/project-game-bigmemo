package jproject.game.android.bigmemo.dataModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonathan on 7/03/15.
 */
public class Game {

    private List<Step> steps;

    public List<Step> getSteps() {
        return steps;
    }

    public void addStep(Step step) {
        if(steps == null){
            steps = new ArrayList<>();
        }

        steps.add(step);
    }
}
