package designPattern;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String s) {
		// TODO Auto-generated method stub
		if(s == null) {
			return null;
		}else if(s.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}else if(s.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
		}
		return null;
	}
	

}
