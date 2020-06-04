package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zoomanager.creature.Creature;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    private Creature creature;

    @Before
    public void before() {
        creature = new Creature("Spot", "Dog", "Spicy");
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Spot", creature.getCreatureName());
    }

    @Test
    public void getTypeTest() {
        Assert.assertEquals("Dog", creature.getCreatureType());
    }

    @Test
    public void getStomachContentsTest() {
        Assert.assertEquals(0, creature.getStomachContents());
    }

    @Test
    public void getIsHungryEqualsTrueTest() {
        Assert.assertEquals(true, creature.getHungerState());
    }

    @Test
    public void getHasEnclosureEqualsTrueTest() {
        Assert.assertEquals(false, creature.getContainmentState());
    }

    @Test
    public void getFoodPreferencesTest() {
        assertEquals("Spicy", creature.getPreferences());
    }

}
