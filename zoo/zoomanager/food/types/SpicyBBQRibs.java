package zoomanager.food.types;

import zoomanager.food.IFood;

public class SpicyBBQRibs implements IFood {

  private final String type;

  public SpicyBBQRibs() {
    this.type = "Smokey!";
  }

  public String type() {
    return this.type;
  }

}
