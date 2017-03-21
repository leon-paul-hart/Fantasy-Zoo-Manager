import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;
import java.util.*;

public class EnclosureTest {

  Enclosure enclosure;
  Creature creature;
  ArrayList<Creature> creatures;

  @Before
  public void before() {
    enclosure = new Enclosure( "Volcanic Cave" , "Fire" , 3 );
    creature = new Creature( "Morchock" , "Dragon" , "Fire" );
    creatures = new ArrayList<Creature>();
  }

  @Test
  public void getEnclosureNameTest() {
    assertEquals( "Volcanic Cave" , enclosure.getEnclosureName() );
  }

  @Test
  public void getEnclosureTypeTest() {
    assertEquals( "Fire" , enclosure.getEnclosureType() );
  }

  @Test
  public void getEnclosureMaxCapacityTest() {
    assertEquals( 3 , enclosure.getEnclosureMaxCapacity() );
  }

  @Test
  public void getEnclosureCreaturesTest() {
    assertEquals( 0 , enclosure.getEnclosureCreatures().size() );
  }

  @Test
  public void countCreatures() {
    assertEquals( 0 , enclosure.countCreatures() );
  }

  @Test
  public void addCreatureTest() {
    enclosure.addCreature(creature);
    assertEquals( 1 , enclosure.countCreatures() );
  }

  @Test
  public void removeCreatureTest() {
    enclosure.addCreature(creature);
    enclosure.removeCreature(creature);
    assertEquals( 0 , enclosure.countCreatures() );
  }

}
