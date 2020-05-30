package tests;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class MagicalCreatureTest {

  HashMap< String , String > preferences;

  @Before
  public void before() {
    preferences = new HashMap< String , String >();
    preferences.put( "Spicy! FOOSH! Thats hot!" , "Hot , nice and cosy!" );
    preferences.put( "Marshmallow! MMMM fluffy!" , "Spacious! Plenty of space to fly or run!" );
    preferences.put( "Refreshing! SPLASH!" , "Deep waters, nice to contemplate in!" );
    preferences.put( "Gritty! CRUNCH!!" , "Lots of stone and gravel to grind to dust!" );
  }

  @Test
  public void getPreferencesTest() {
    assertEquals( 4 , preferences.size() );
  }

}
