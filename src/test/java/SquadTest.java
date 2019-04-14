import org.junit.*;
import static org.junit.Assert.*;


public class SquadTest {
    @Test
    public void Squad_instantiatesCorrectly_true(){
        Squad testSquad = new Squad(" Sevens Squad",4,"Fighting bad breath");
        assertEquals(true, testSquad instanceof Squad);
    }
    @Test
    public void getName_instantiatesWithName_String(){
        Squad testSquad = new Squad("Sevens Squad",4,"Fighting bad breath");
        assertEquals("Sevens Squad",testSquad.getName());
    }
    @Test
    public void getSize_instantiatesWithSize_int() {
        Squad testSquad = new Squad("Sevens Squad",4,"Fighting bad breath");
        assertEquals(4, testSquad.getSize());
    }
    @Test
    public void getCause_instantiatesWithCause_String(){
        Squad testSquad = new Squad("Sevens Squad",4,"Fighting bad breath");
        assertEquals("Fighting bad breath",testSquad.getCause());
    }

}
