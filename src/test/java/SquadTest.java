import org.junit.*;
import static org.junit.Assert.*;


public class SquadTest {
    @Test
    public void Squad_instantiatesCorrectly_true(){
        Squad testSquad = new Squad(" Sevens Squad",4);
        assertEquals(true, testSquad instanceof Squad);
    }
    @Test
    public void getName_instantiatesWithName_String(){
        Squad testSquad = new Squad("Sevens Squad",4);
        assertEquals("Sevens Squad",testSquad.getName());
    }
    @Test
    public void getSize_squadInstantiatesWithSize_int() {
        Squad testSquad = new Squad("Sevens Squad",4);
        assertEquals(4, testSquad.getSize());
    }

}
