import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class EnclosureTest {

  Enclosure enclosure;

  @Before
  public void before() {
    enclosure = new Enclosure( "Volcanic Cave" , "Fire" , 3 , "Morchock" );
  }

  @Test
  public void getEnclosureNameTest() {
    assertEquals( "Volcanic Cave" , enclosure.getEnclosureName() );
  }

}
