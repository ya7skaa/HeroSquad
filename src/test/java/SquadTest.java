import org.junit.*;
import static org.junit.Assert.*;


public class SquadTest {
    @Test
    public void Squad_instantiatesCorrectly_true(){
        Squad testSquad = new Squad(" Sevens Squad");
        assertEquals(true, testSquad instanceof Squad);
    }
    @Test
    public void getName_instantiatesWithName_String(){
        Squad testSquad = new Squad("Sevens Squad");
        assertEquals("Sevens Squad",testSquad.getName());
    }

}
