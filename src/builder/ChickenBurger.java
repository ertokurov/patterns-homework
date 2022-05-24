package builder;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 169.0f;
    }

    @Override
    public String name() {
        return "Чикен бургер";
    }
}
