import org.junit.*;
import static org.junit.Assert.*;


public class SquadTest {

    //Test to check if it will instantiate hero correctly
    @Test
    public void Squad_instantiatesCorrectly_true(){
        Squad testSquad = new Squad(" Sevens Squad",4,"Fighting bad breath");
        assertEquals(true, testSquad instanceof Squad);
    }

    //Test to check if Squad can be assigned a Name
    @Test
    public void getName_instantiatesWithName_String(){
        Squad testSquad = new Squad("Sevens Squad",4,"Fighting bad breath");
        assertEquals("Sevens Squad",testSquad.getName());
    }

    //Test to check if Squad can be assigned a Size
    @Test
    public void getSize_instantiatesWithSize_int() {
        Squad testSquad = new Squad("Sevens Squad",4,"Fighting bad breath");
        assertEquals(4, testSquad.getSize());
    }

    //Test to check if Squad can be assigned a Cause
    @Test
    public void getCause_instantiatesWithCause_String(){
        Squad testSquad = new Squad("Sevens Squad",4,"Fighting bad breath");
        assertEquals("Fighting bad breath",testSquad.getCause());
    }

    //Test to return all instances of of Squad
    @Test
    public void all_returnsAllInstancesOfSquad_true(){
        Squad firstSquad = new Squad ("Sevens Squad",4,"Fighting bad breath");
        Squad secondSquad = new Squad("Ya7ska",6,"Fighting racists");
        assertEquals(true, Squad.all().contains(firstSquad));
        assertEquals(true, Squad.all().contains(secondSquad));

    }

    //Test to clear the list of all Squads
    @Test
    public void clear_emptiesAllSquadFromArrayList_0(){
        Squad testSquad = new Squad("Sevens Squad",4,"Fighting bad breath");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);

    }

    //Test of Assigning Unique Id
    @Test
    public void getId_SquadsInstantiateWithId_1(){

        Squad.clear(); //To clear List for test to work

        Squad testSquad = new Squad("Sevens Squad",4,"Fighting bad breath");

        assertEquals(1, testSquad.getId());

    }
    //Test to find a Specific object
    @Test
    public void squad_WillReturnSquadWithSameId_secondSquad(){
        Squad firstSquad = new Squad("Sevens Squad",4,"Fighting bad breath");
        Squad secondSquad = new Squad("Ya7ska",6,"Fighting racists");
        assertEquals(Squad.find(firstSquad.getId()), secondSquad);
    }


    @Test
    public void getHeroes_instantiatesRetutnAnEmptyList_ArrayList(){
        Squad.clear();
        Squad testSquad = new Squad("Sevens Squad",4,"Fighting bad breath");
        assertEquals(0,testSquad.getHeroes().size());

    }

    @Test
    public void addHero_addHeroToList_true(){
        Squad testSquad = new Squad("Sevens Squad",4,"Fighting bad breath");
        Hero testHero = new Hero("Batman",4,"Strength","Parents");
        testSquad.addHero(testHero);
        assertTrue(testSquad.getHeroes().contains(testHero));
    }


}
