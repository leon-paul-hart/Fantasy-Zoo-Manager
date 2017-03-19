import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class ZooTest {

  Zoo zoo;

  @Before
  public void before() {
    zoo = new Zoo( "Zizis Zodiac Ziggarut!" );
  }

  @Test
  public void getNameTest() {
    assertEquals( "Zizis Zodiac Ziggarut!" , zoo.getName() );
  }

}
