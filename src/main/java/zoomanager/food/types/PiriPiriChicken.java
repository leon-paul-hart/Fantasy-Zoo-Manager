package zoomanager.food.types;

import zoomanager.food.IFood;

public class PiriPiriChicken implements IFood {

    private final String type;

    public PiriPiriChicken() {
        this.type = "Spicy!";
    }

    public String type() {
        return this.type;
    }

}
