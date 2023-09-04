package SOLID;

// A class should be open for extension, but closed for modifications

import java.util.concurrent.TransferQueue;

interface Shape {
    void draw();
}

class Circle implements Shape{
    public void draw() {
        System.out.println("drawing circle");
    }
}

class Square implements Shape{
    public void draw() {
        System.out.println("drawing square");
    }
}

class Triangle implements Shape{
    public void draw() {
        System.out.println("drawing triangle");
    }
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("drawing Rectangle");
    }
}

class ShapeDrawer {
    void drawShape(Shape shape) {
        shape.draw();
    }
}


public class OpenClosed {
    public static void main(String[] args) {
        var drawer = new ShapeDrawer();
        var triangle = new Triangle(){};

        drawer.drawShape(triangle);
    }
}
