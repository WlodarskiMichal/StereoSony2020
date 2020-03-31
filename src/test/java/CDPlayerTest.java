import Model.CDPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    private CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sony", "Walkman", 1);
    }

    @Test
    public void hasNumCDs() {
        assertEquals(1, cdPlayer.getNumCDs());
    }
}
