package Model;

import Behaviours.IPlay;

public class RecordDeck extends Component implements IPlay {
    private double playSpeed;

    public RecordDeck(String make, String model, Double playSpeed) {
        super(make, model);
        this.playSpeed = playSpeed;
    }

    public double getPlaySpeed() {
        return this.playSpeed;
    }

    @Override
    public String play() {
        return "This is Record Deck playing";
    }
}
