import Model.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void setUp(){
        radio = new Radio("Sony", "404");
    }

    @Test
    public void canTune() {
        assertEquals("Station1", radio.tune("Station1"));
    }

    @Test
    public void hasModel(){
        assertEquals("404", radio.getModel());
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", radio.getMake());
    }
}
