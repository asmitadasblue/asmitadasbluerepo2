package designPattern;

public class SingleObjectClass {
	
	public static SingleObjectClass obj = new SingleObjectClass();
	private SingleObjectClass() {
		
	}
	
	public static SingleObjectClass getInstance() {
		return obj;
	}

}
