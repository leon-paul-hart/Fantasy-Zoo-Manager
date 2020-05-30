package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zoomanager.creature.Creature;

public class CreatureTest {

  private Creature creature;

  @Before
  public void before() {
    creature = new Creature( "Spot" , "Dog" );
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
    Assert.assertEquals( 0 , creature.getStomachContents() );
  }

  @Test
  public void getIsHungryEqualsTrueTest() {
    Assert.assertEquals(true, creature.getHungerState());
  }

  @Test
  public void getHasEnclosureEqualsTrueTest() {
    Assert.assertEquals(false, creature.getContainmentState());
  }

} // End of class
