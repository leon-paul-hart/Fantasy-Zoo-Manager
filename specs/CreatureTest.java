import org.junit.Before;
import org.junit.Test;
import zoo.Creature;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

  private Creature creature;

  @Before
  public void before() {
    creature = new Creature( "Spot" , "Dog" );
  }

  @Test
  public void getNameTest() {
    assertEquals("Spot", creature.getCreatureName());
  }

  @Test
  public void getTypeTest() {
    assertEquals("Dog", creature.getCreatureType());
  }

  @Test
  public void getStomachContentsTest() {
    assertEquals( 0 , creature.getStomachContents() );
  }

  @Test
  public void getIsHungryEqualsTrueTest() {
    assertEquals(true, creature.getHungerState());
  }

  @Test
  public void getHasEnclosureEqualsTrueTest() {
    assertEquals(false, creature.getContainmentState());
  }

} // End of class
