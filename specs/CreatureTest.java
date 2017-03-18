import org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class CreatureTest {

  Creature creature;

  @Before
  public void before() {
    creature = new Creature( "Morchock" , "Dragon" , "Fire" , true , true );
  }

}
