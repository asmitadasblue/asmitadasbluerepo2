package designPattern;

//create a class which will get you the object according to the properties
// that is the name of the shape class we need

public class ShapeFactoryDemo {
public static void main(String args[]) {
ShapeFactory shapeFactory = new ShapeFactory();
Shape shape1 = (Circle)shapeFactory.getShape("CIRCLE");
Shape shape2 = (Rectangle)shapeFactory.getShape("RECTANGLE");
Shape shape3 = (Square)shapeFactory.getShape("SQUARE");

shape1.draw();
shape2.draw();
shape3.draw();
}


}
