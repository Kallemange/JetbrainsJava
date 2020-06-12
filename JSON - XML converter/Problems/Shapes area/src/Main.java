class Shape {
    public double area() {
        return 0;
    }
}

class Triangle extends Shape {
    double height;
    double base;

    @Override
    public double area() {
        return height*base/2;
    }
}

class Circle extends Shape {
    double radius;

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }
}

class Square extends Shape {
    double side;

    // override the method here
    @Override
    public double area() {
        return side*side;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    // override the method here

    @Override
    public double area() {
        return width*height;
    }
}