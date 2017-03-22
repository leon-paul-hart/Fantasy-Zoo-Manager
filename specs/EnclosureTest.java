import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;
import java.util.*;

public class EnclosureTest {

  Enclosure enclosure;
  Enclosure enclosure2;
  Creature creature;
  Creature creature2;
  Creature creature3;
  ArrayList<Creature> creatures;

  @Before
  public void before() {
    enclosure = new Enclosure( "Volcanic Cave" , "Fire" , 3 );
    enclosure2 = new Enclosure( "Volcano Cliff Face" , "Fire" , 2 );
    creature = new Creature( "Morchock" , "Dragon" );
    creature2 = new Creature( "Phoosh" , "Phoenix" );
    creature3 = new Creature( "Deimos" , "Hellhound" );
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
  public void addTwoCreaturesTest() {
    enclosure.addCreature(creature);
    enclosure.addCreature(creature2);
    assertEquals( 2 , enclosure.countCreatures() );
  }

  @Test
  public void removeCreatureTest() {
    enclosure.addCreature(creature);
    enclosure.removeCreature(creature);
    assertEquals( 0 , enclosure.countCreatures() );
  }

  @Test
  public void checkIfEnclosureIsEmptyTest() {
    assertEquals( true , enclosure.checkIfEnclosureIsEmpty() );
  }

  @Test
  public void checkIfEnclosureIsNotEmpty() {
    enclosure.addCreature(creature);
    assertEquals( false , enclosure.checkIfEnclosureIsEmpty() );
  }

  @Test
  public void checkIfEnclosureIsNotFullTest() {
    enclosure.addCreature(creature);
    enclosure.addCreature(creature2);
    assertEquals( false , enclosure.checkIfEnclosureIsFull() );
  }

  @Test
  public void checkIfEnclosureIsFullTest() {
    enclosure.addCreature(creature);
    enclosure.addCreature(creature2);
    enclosure.addCreature(creature3);
    assertEquals( true , enclosure.checkIfEnclosureIsFull() );
  }

  @Test
  public void newEnclosureCountIncreasesByOneTest() {
    enclosure.addCreature(creature);
    enclosure.moveCreatureBetweenEnclosures( creature , enclosure2 );
    assertEquals( 1 , enclosure2.countCreatures() );
  }

  @Test
  public void previousEnclosureDecreasesByOneTest() {
    enclosure.addCreature(creature);
    enclosure.moveCreatureBetweenEnclosures( creature , enclosure2 );
    assertEquals( 0 , enclosure.countCreatures() );
  }

} // End of class
