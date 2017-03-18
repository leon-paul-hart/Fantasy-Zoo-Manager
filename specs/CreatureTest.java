import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class CreatureTest {

  Creature creature;

  @Before
  public void before() {
    creature = new Creature( "Morchock" , "Dragon" , "Fire" , true , true );
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
  public void getIsHungryTrueTest() {
    assertEquals( true , creature.getIsHungryTrue() );
  }

}
