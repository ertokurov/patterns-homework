package prototype;

public class Circle extends Shape {
    public Circle(){
        type = "circle";
    }

    @Override
    public void draw() {
        System.out.println("Вызван метод Circle::draw()");
    }
}
