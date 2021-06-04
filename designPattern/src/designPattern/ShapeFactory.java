package designPattern;

//created a factory class which will create a concrete object of the SHape interface
public class ShapeFactory extends AbstractFactory{
public Shape getShape(String shapeType) {
	if(shapeType == null) {
		return null;
	}
	else if(shapeType.equalsIgnoreCase("CIRCLE")) {
		return new Circle();
	}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
		return new Rectangle();
	}else if(shapeType.equalsIgnoreCase("SQUARE")) {
		return new Square();
	}
	return null;
  }
}
