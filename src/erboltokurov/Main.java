package erboltokurov;

import builder.*;
import prototype.*;

public class Main {

    public static void main(String[] args) {
        // ----- Одиночка -----
        SingleObject object = SingleObject.getInstance();

        object.showMessage();

        // ----- Строитель -----
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Веганское блюдо");
        vegMeal.showItems();
        System.out.println("Итого: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nНе Веганское блюдо");
        nonVegMeal.showItems();
        System.out.println("Итого: " +nonVegMeal.getCost());

        // ----- Прототип -----
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
