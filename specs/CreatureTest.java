import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;
import java.util.*;

public class CreatureTest {

  Creature creature;

  @Before
  public void before() {
    creature = new Creature( "Spot" , "Dog" );
  }

  @Test
  public void getNameTest() {
    assertEquals( "Spot" , creature.getName() );
  }

  @Test
  public void getTypeTest() {
    assertEquals( "Dog" , creature.getType() );
  }

  @Test
  public void getStomachContentsTest() {
    assertEquals( 0 , creature.getStomachContents() );
  }

  @Test
  public void getIsHungryEqualsTrueTest() {
    assertEquals( true , creature.getIsHungry() );
  }

  @Test
  public void getHasEnclosureEqualsTrueTest() {
    assertEquals( false , creature.getHasEnclosure() );
  }

} // End of class
