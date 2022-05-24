package prototype;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Вызван метод Rectangle::draw()");
    }
}