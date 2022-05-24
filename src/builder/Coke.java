package builder;

public class Coke extends ColdDrink{
    @Override
    public float price() {
        return 40.0f;
    }

    @Override
    public String name() {
        return "Кола";
    }
}
