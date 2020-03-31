import Model.RecordDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {
    
    private RecordDeck recordDeck;
    
    @Before
    public void before() {
        recordDeck = new RecordDeck("Mambo", "No. 5", 2.4);
    }
    
    @Test
    public void hasPlaySpeed() {
        assertEquals(2.4, recordDeck.getPlaySpeed(), 0.01);
    } 
}
