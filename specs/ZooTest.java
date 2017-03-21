import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

import java.util.*;

public class ZooTest {

  Zoo zoo;
  Creature creature;
  Enclosure enclosure;
  FoodTypes food;

  @Before
  public void before() {
    zoo = new Zoo( "Zizis Zodiac Ziggarut!" );
    creature = new Creature( "Morchock" , "Dragon" , "Fire" );
    enclosure = new Enclosure( "Volcanic Cave" , "Fire" , 3 );
    food = new PiriPiriChicken();
  }

  @Test
  public void getZooNameTest() {
    assertEquals( "Zizis Zodiac Ziggarut!" , zoo.getZooName() );
  }

  @Test
  public void addEnclosureTest() {
    zoo.addEnclosure(enclosure);
    assertEquals( 1 , zoo.countEnclosures() );
  }

  @Test
  public void removeEnclosureTest() {
    zoo.addEnclosure(enclosure);
    zoo.removeEnclosure(enclosure);
    assertEquals( 0 , zoo.countEnclosures() );
  }

  @Test
  public void feedCreatureTest() {
    zoo.feedCreature( creature , food );
    assertEquals( 1 , creature.getStomachContents() );
  }

}
