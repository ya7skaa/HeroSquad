import org.junit.*;
import static org.junit.Assert.*;


public class SquadTest {
    @Test
    public void Squad_instantiatesCorrectly_true(){
        Squad testSquad = new Squad();
        assertEquals(true, testSquad instanceof Squad);
    }

}
