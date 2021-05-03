package zoomanager.food;

public class Food implements IFood {

    private final String FoodType;

    public Food(String foodType) {
        this.FoodType = foodType;
    }

    public String getFoodType() {
        return this.FoodType;
    }
}
