import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;
import java.util.*;

public class MagicalCreatureTest {

  MagicalCreature magicalCreature;

  @Before
  public void before() {
    magicalCreature = new MagicalCreature( "Morchock" , "Dragon" , "Fire");
  }

  @Test
  public void getMagicalAffinityTest() {
    assertEquals( "Fire" , magicalCreature.getMagicalAffinity() );
  }

}
