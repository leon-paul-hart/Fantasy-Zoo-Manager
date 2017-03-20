import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class ZooTest {

  Zoo zoo;
  Creature creature;
  Enclosure enclosure;

  @Before
  public void before() {
    zoo = new Zoo( "Zizis Zodiac Ziggarut!" );
    creature = new Creature( "Morchock" , "Dragon" , "Fire" , true , true );
    enclosure = new Enclosure( "Volcanic Cave" , "Fire" , 3 , "Morchock" );
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

  @Test
  public void addEnclosureTest() {
    zoo.addEnclosure(enclosure);
    assertEquals( 1 , zoo.countEnclosures() );
  }

}
