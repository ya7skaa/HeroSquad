import org.junit.*;
import static org.junit.Assert.*;
//import java.util.List;

public class HeroTest {

    //Test to check if it will instantiate hero correctly
    @Test
    public void Hero_instantiatesCorrectly_true(){
        Hero testHero = new Hero("Batman",30,"Strength","Parents");
                assertEquals(true,testHero instanceof Hero);

    }

    //Test to check if Hero can be assigned a Name
    @Test
    public void getName_instantiatesWithName_String() {
        Hero testHero = new Hero("Batman",30,"Strength","Parents");
        assertEquals("Batman", testHero.getName());
    }

    //Test to check if Hero can be assigned an Age
    @Test
    public void getAge_instantiatesWithAge_int() {
        Hero testHero = new Hero("Batman",30,"Strength","Parents");
        assertEquals(30, testHero.getAge());
    }

    //Test to check if Hero can be assigned a Power
    @Test
    public void getPower_instantiatesWithPower_String() {
        Hero testHero = new Hero("Batman",30,"Strength","Parents");
        assertEquals("Strength", testHero.getPower());
    }

    //Test to check if Hero can be assigned a Weakness
    @Test
    public void getWeakness_instantiatesWithWeakness_String() {
        Hero testHero = new Hero("Batman",30,"Strength","Parents");
        assertEquals("Parents", testHero.getWeakness());
    }

    //Test to return all instances of of Squad
    @Test
    public void all_returnsAllInstancesOfHero_true() {
        Hero firstHero = new Hero("Batman",30,"Strength","Parents");
        Hero secondHero = new Hero("Spiderman",17,"Flying","Age");
        assertEquals(true, Hero.all().contains(firstHero));
        assertEquals(true, Hero.all().contains(secondHero));
    }

    //Test to clear the list of all Squads
    @Test
    public void clear_emptiesAllHeroesFromArrayList_0() {
        Hero testHero = new Hero("Batman",30,"Strength","Parents");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }

    //Test of Assigning Unique Id
    @Test
    public void getId_SquadsInstantiateWithId_1(){

        Hero.clear(); //To clear List for test to work

        Hero myHero = new Hero("Batman",30,"Strength","Parents");

        assertEquals(1, myHero.getId());

    }
    //Test for finding Specific object
    @Test
    public void squad_WillReturnHeroWithSameId_secondHero(){

        Hero firstHero = new Hero("Batman",30,"Strength","Parents");

        Hero secondHero = new Hero("Spiderman",17,"Flying","Age");

        assertEquals(Hero.find(secondHero.getId()), secondHero);

    }






}
