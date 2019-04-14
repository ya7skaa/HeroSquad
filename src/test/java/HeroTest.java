import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void Hero_instantiatesCorrectly_true(){
        Hero testHero = new Hero("Superman",21,"Flying","Kryptonite");
                assertEquals(true,testHero instanceof Hero);

    }

    @Test
    public void getName_instantiatesWithName_String() {
        Hero testHero = new Hero("Superman",21,"Flying","Kryptonite");
        assertEquals("Superman", testHero.getName());
    }

    @Test
    public void getAge_instantiatesWithAge_int() {
        Hero testHero = new Hero("Superman",21,"Flying","Kryptonite");
        assertEquals(21, testHero.getAge());
    }

    @Test
    public void getPower_instantiatesWithPower_String() {
        Hero testHero = new Hero("Superman",21,"Flying","Kryptonite");
        assertEquals("Flying", testHero.getPower());
    }

    @Test
    public void getWeakness_instantiatesWithWeakness_String() {
        Hero testHero = new Hero("Superman",21,"Flying","Kryptonite");
        assertEquals("Kryptonite", testHero.getWeakness());
    }


}
