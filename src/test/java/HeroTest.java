import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true(){
        Hero testHero = new Hero("Batman",30,"Strength","Parents");
                assertEquals(true,testHero instanceof Hero);

    }

    @Test
    public void getName_instantiatesWithName_String() {
        Hero testHero = new Hero("Batman",30,"Strength","Parents");
        assertEquals("Batman", testHero.getName());
    }

    @Test
    public void getAge_instantiatesWithAge_int() {
        Hero testHero = new Hero("Batman",30,"Strength","Parents");
        assertEquals(30, testHero.getAge());
    }

    @Test
    public void getPower_instantiatesWithPower_String() {
        Hero testHero = new Hero("Batman",30,"Strength","Parents");
        assertEquals("Strength", testHero.getPower());
    }

    @Test
    public void getWeakness_instantiatesWithWeakness_String() {
        Hero testHero = new Hero("Batman",30,"Strength","Parents");
        assertEquals("Parents", testHero.getWeakness());
    }
    @Test
    public void all_returnsAllInstancesOfHero_true() {
        Hero firstHero = new Hero("Batman",30,"Strength","Parents");
        Hero secondHero = new Hero("Spiderman",17,"Flying","Age");
        assertEquals(true, Hero.all().contains(firstHero));
        assertEquals(true, Hero.all().contains(secondHero));
    }
    @Test
    public void clear_emptiesAllHeroesFromArrayList_0() {
        Hero testHero = new Hero("Batman",30,"Strength","Parents");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }




}
