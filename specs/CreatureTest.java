import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;
import java.util.*;

public class CreatureTest {

  Creature creature;

  @Before
  public void before() {
    creature = new Creature( "Morchock" , "Dragon" , "Fire" , new ArrayList<FoodTypes>() , true , true );
  }

  @Test
  public void getNameTest() {
    assertEquals( "Morchock" , creature.getName() );
  }

  @Test
  public void getTypeTest() {
    assertEquals( "Dragon" , creature.getType() );
  }

  @Test
  public void getMagicalAffinityTest() {
    assertEquals( "Fire" , creature.getMagicalAffinity() );
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
    assertEquals( true , creature.getHasEnclosure() );
  }

}
