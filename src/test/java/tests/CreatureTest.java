package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zoomanager.creature.Creature;
import zoomanager.food.Food;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    private Creature creature;

    @Before
    public void before() {
        creature = new Creature("Spot", "Dog", "Spicy");
    }

    @Test
    public void getCreatureName() {

        // Arrange

        //Act

        //Assert
        Assert.assertEquals("Spot", creature.getCreatureName());
    }

    @Test
    public void getCreatureType() {
        
        // Arrange

        //Act

        //Assert
        Assert.assertEquals("Dog", creature.getCreatureType());
    }

    @Test
    public void defaultStateStomachContentsIsEmpty() {
        
        // Arrange

        //Act

        //Assert
        Assert.assertEquals(0, creature.getStomachContentsCount());
    }

    @Test
    public void defaultStateIsHungryEqualsTrue() {
        
        // Arrange

        //Act

        //Assert
        Assert.assertEquals(true, creature.getHungerState());
    }

    @Test
    public void defaultStateHasEnclosureEqualsFalse() {
        
        // Arrange

        //Act

        //Assert
        Assert.assertEquals(false, creature.getContainmentState());
    }

    @Test
    public void getCreatureFoodPreferences() {
        
        // Arrange

        //Act

        //Assert
        assertEquals("Spicy", creature.getPreferences());
    }

    @Test
    public void creatureCanBeFedOnce() {
        
        // Arrange
        
        //Act
        creature.eat(new Food("Sausages"));

        //Assert
        assertEquals(1, creature.getStomachContentsCount());
    }

    @Test
    public void creatureCanBeFedMoreThanOnce() {
        
        // Arrange

        //Act
        creature.eat(new Food("Sausages"));
        creature.eat(new Food("Steak"));

        //Assert
        assertEquals(2, creature.getStomachContentsCount());
    }

    @Test
    public void creatureIsNoLongerHungryOnceFed() {
        
        // Arrange

        //Act
        creature.eat(new Food("Sausages"));

        //Assert
        assertEquals(false, creature.getHungerState());
    }

}
