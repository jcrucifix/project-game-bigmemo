package jproject.game.android.bigmemo.dataModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonathan on 7/03/15.
 */
public class Step {

    private List<Long> pickedColors;
    private Integer duration;

    public Step(Integer duration) {
        this.duration = duration;
    }

    public List<Long> getPickedColors() {
        return pickedColors;
    }

    public void addPickedColor(Long pickedColor) {

        if(pickedColors == null){
            pickedColors = new ArrayList<>();
        }

        pickedColors.add(pickedColor);
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
