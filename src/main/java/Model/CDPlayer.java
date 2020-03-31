package Model;

import Behaviours.IPlay;

public class CDPlayer extends Component implements IPlay {
    private int numCDs;

    public CDPlayer(String make, String model, int numCDs) {
        super(make, model);
        this.numCDs = numCDs;
    }

    public int getNumCDs() {
        return this.numCDs;
    }

    @Override
    public String play() {
        return "This is CD Player playing.";
    }
}
