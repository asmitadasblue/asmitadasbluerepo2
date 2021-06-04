package designPattern;

public class AbstractFactoryDemo {
	public static void main(String args[]) {
		FactoryProducer producer = new FactoryProducer();
		AbstractFactory factory = producer.getFactory(true);
		Shape s1 = factory.getShape("SQUARE");
		s1.draw();
		Shape s2 = factory.getShape("RECTANGLE");
		s2.draw();
		factory = producer.getFactory(false);
		Shape s3 = factory.getShape("SQUARE");
		s3.draw();
		Shape s4 = factory.getShape("RECTANGLE");
		s4.draw();
		Shape s5 = factory.getShape("CIRCLE");
		s5.draw();
		
	}

}
