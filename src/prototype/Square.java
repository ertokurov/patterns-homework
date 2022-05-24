package prototype;

public class Square extends Shape {
    public Square(){
        type = "square";
    }

    @Override
    public void draw() {
        System.out.println("Вызван метод Square::draw()");
    }
}
