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

}
