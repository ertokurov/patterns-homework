package builder;

public class VegBurger extends Burger {
    @Override
    public float price() {
        return 135.0f;
    }

    @Override
    public String name() {
        return "Вегетерианский бургер";
    }
}
