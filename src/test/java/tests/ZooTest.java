package tests;

import org.junit.Before;
import org.junit.Test;
import zoomanager.creature.Creature;
import zoomanager.enclosure.Enclosure;
import zoomanager.food.IFood;
import zoomanager.food.types.PiriPiriChicken;
import zoomanager.zoo.Zoo;

import static org.junit.Assert.assertEquals;

public class ZooTest {

    Zoo zoo;
    Creature creature;
    Enclosure enclosure1;
    Enclosure enclosure2;
    IFood food;

    @Before
    public void before() {
        zoo = new Zoo("Zizis Zodiac Ziggarut!");
        creature = new Creature("Morchock", "Dragon");
        enclosure1 = new Enclosure("Volcanic Cave", "Fire", 3);
        enclosure2 = new Enclosure("Damp Cave", "Water", 2);
        food = new PiriPiriChicken();
    }

    @Test
    public void getZooNameTest() {
        assertEquals("Zizis Zodiac Ziggarut!", zoo.getZooName());
    }

    @Test
    public void new_Zoo_Has_Zero_Enclosures() {
        assertEquals(0, zoo.countEnclosures());
    }

    @Test
    public void new_Zoo_Can_Add_An_Enclosure() {
        zoo.addEnclosure(enclosure1);
        assertEquals(1, zoo.countEnclosures());
    }

    @Test
    public void new_Zoo_Can_Add_Two_Enclosures() {
        zoo.addEnclosure(enclosure1);
        zoo.addEnclosure(enclosure2);
        assertEquals(2, zoo.countEnclosures());
    }

    @Test
    public void new_Zoo_Can_Add_And_Remove_An_Enclosure() {
        zoo.addEnclosure(enclosure1);
        zoo.removeEnclosure(enclosure1);
        assertEquals(0, zoo.countEnclosures());
    }

    @Test
    public void new_Zoo_Can_Add_Two_Enclosures_And_Remove_One_Enclosure() {
        zoo.addEnclosure(enclosure1);
        zoo.addEnclosure(enclosure2);
        zoo.removeEnclosure(enclosure1);
        assertEquals(1, zoo.countEnclosures());
    }

    @Test
    public void feedCreatureTest() {
        zoo.feedCreature(creature, food);
        assertEquals(1, creature.getStomachContents());
    }

} // End of class
