import org.w3c.dom.css.Rect;
//class Main{
//    public static void main(String[] args) {
//        MutableShape circle = new Circle(2.0f, 3.5f, 10.1f);
//
//        circle.move(10.1f, 20.2f);
//        circle.scale(2.2f);
//        System.out.println(((Circle) circle).getRadius());
//        System.out.println("x: " +((Circle) circle).getCenterX() + " y: " + ((Circle) circle).getCenterY());
//
//        MutableShape rect = new Rectangle(2.0f, 3.5f, 10.1f, 1);
//        rect.move(1.1f, -1);
//        rect.scale(1f);
//        System.out.println("X: " +((Rectangle) rect).getX()+ " Y: " + ((Rectangle) rect).getY());
//        System.out.println("W: " + ((Rectangle) rect).getWidth() +" H: " +((Rectangle) rect).getHeight());
//    }
//}

interface Movable {void move(float dx, float dy);}
interface Scalable {void scale(float factor);}
interface MutableShape extends Movable, Scalable{}

final class Rectangle implements MutableShape{

    private float x;
    private float y;
    private float width;
    private float height;

    public Rectangle(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    @Override
    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }
    @Override
    public void scale(float factor) {
        this.width *= factor;
        this.height *= factor;
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float getWidth() {
        return width;
    }
    public float getHeight() {
        return height;
    }
}

final class Circle implements MutableShape{
    private float centerX;
    private float centerY;
    private float radius;

    public Circle(float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    @Override
    public void move(float dx, float dy){
        this.centerX += dx;
        this.centerY += dy;
    }
    @Override
    public void scale(float factor){this.radius *= factor;}

    public float getCenterX() {return centerX;}
    public float getCenterY() {
        return centerY;
    }
    public float getRadius() {
        return radius;
    }
}


