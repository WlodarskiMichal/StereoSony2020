package Model;

import Behaviours.IPlay;

public class TapePlayer extends Component implements IPlay {

    public TapePlayer(String make, String model) {
        super(make, model);
    }

    @Override
    public String play() {
        return "This is Tape Player playing";
    }
}
