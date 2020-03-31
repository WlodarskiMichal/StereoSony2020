package Model;
import Behaviours.IPlay;
import Model.Component;
public class Radio extends Component implements IPlay {
    public Radio(String make, String model) {
        super(make, model);
    }

    public String tune(String station){
        return station;
    }

    @Override
    public String play() {
        return "The radio is playing";
    }
}
