//Abstraction (Using Abstract Class)
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//In Java, abstraction is achieved using abstract classes and interfaces.
//An abstract class is a class that is declared using the abstract keyword. It can have abstract methods (methods without a body) as well as concrete methods (methods with a body).

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 20);
        Shape circle = new Circle(5);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
