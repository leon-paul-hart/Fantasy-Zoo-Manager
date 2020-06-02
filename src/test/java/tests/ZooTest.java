package tests;

import org.junit.Before;
import org.junit.Test;
import zoomanager.creature.Creature;
import zoomanager.enclosure.Enclosure;
import zoomanager.food.Food;
import zoomanager.food.IFood;
import zoomanager.zoo.IZoo;
import zoomanager.zoo.Zoo;

import static org.junit.Assert.assertEquals;

public class ZooTest {

    IZoo IZoo;
    Creature creature;
    Enclosure enclosure1;
    Enclosure enclosure2;
    IFood food;

    @Before
    public void before() {
        IZoo = new Zoo("Zizis Zodiac Ziggarut!");
        creature = new Creature("Morchock", "Dragon");
        enclosure1 = new Enclosure("Volcanic Cave", "Fire", 3);
        enclosure2 = new Enclosure("Damp Cave", "Water", 2);
        food = new Food("Spicy Haggis");
    }

    @Test
    public void getZooNameTest() {
        assertEquals("Zizis Zodiac Ziggarut!", IZoo.getZooName());
    }

    @Test
    public void new_Zoo_Has_Zero_Enclosures() {
        assertEquals(0, IZoo.countEnclosures());
    }

    @Test
    public void new_Zoo_Can_Add_An_Enclosure() {
        IZoo.addEnclosure(enclosure1);
        assertEquals(1, IZoo.countEnclosures());
    }

    @Test
    public void new_Zoo_Can_Add_Two_Enclosures() {
        IZoo.addEnclosure(enclosure1);
        IZoo.addEnclosure(enclosure2);
        assertEquals(2, IZoo.countEnclosures());
    }

    @Test
    public void new_Zoo_Can_Add_And_Remove_An_Enclosure() {
        IZoo.addEnclosure(enclosure1);
        IZoo.removeEnclosure(enclosure1);
        assertEquals(0, IZoo.countEnclosures());
    }

    @Test
    public void new_Zoo_Can_Add_Two_Enclosures_And_Remove_One_Enclosure() {
        IZoo.addEnclosure(enclosure1);
        IZoo.addEnclosure(enclosure2);
        IZoo.removeEnclosure(enclosure1);
        assertEquals(1, IZoo.countEnclosures());
    }

    @Test
    public void feedCreatureTest() {
        IZoo.feedCreature(creature, food);
        assertEquals(1, creature.getStomachContents());
    }

}
