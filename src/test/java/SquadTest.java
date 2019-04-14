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
    @Test
    public void all_returnsAllInstancesOfSquad_true(){
        Squad firstSquad = new Squad ("Sevens Squad",4,"Fighting bad breath");
        Squad secondSquad = new Squad("Ya7ska",6,"Fighting racists");
        assertEquals(true, Squad.all().contains(firstSquad));
        assertEquals(true, Squad.all().contains(secondSquad));

    }
    @Test
    public void clear_emptiesAllSquadFromArrayList_0(){
        Squad testSquad = new Squad("Sevens Squad",4,"Fighting bad breath");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);

    }

}
