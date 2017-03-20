import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class ZooTest {

  Zoo zoo;
  Creature creature;

  @Before
  public void before() {
    zoo = new Zoo( "Zizis Zodiac Ziggarut!" );
    creature = new Creature( "Morchock" , "Dragon" , "Fire" , true , true );
  }

  @Test
  public void getZooNameTest() {
    assertEquals( "Zizis Zodiac Ziggarut!" , zoo.getName() );
  }

  @Test
  public void addCreatureTest() {
    zoo.addCreature(creature);
    assertEquals( 1 , zoo.countCreatures() );
  }

}
