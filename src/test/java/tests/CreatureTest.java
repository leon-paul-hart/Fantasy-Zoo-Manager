package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zoomanager.creature.Creature;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    private Creature creature;

    @Before
    public void before() {
        creature = new Creature("Spot", "Dog", "Spicy");
    }

    @Test
    public void getCreatureName() {
        Assert.assertEquals("Spot", creature.getCreatureName());
    }

    @Test
    public void getCreatureType() {
        Assert.assertEquals("Dog", creature.getCreatureType());
    }

    @Test
    public void defaultStateStomachContentsIsEmpty() {
        Assert.assertEquals(0, creature.getStomachContents());
    }

    @Test
    public void defaultStateIsHungryEqualsTrue() {
        Assert.assertEquals(true, creature.getHungerState());
    }

    @Test
    public void defaultStateHasEnclosureEqualsFalse() {
        Assert.assertEquals(false, creature.getContainmentState());
    }

    @Test
    public void getCreatureFoodPreferences() {
        assertEquals("Spicy", creature.getPreferences());
    }

}
