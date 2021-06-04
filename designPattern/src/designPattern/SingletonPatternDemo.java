package designPattern;

public class SingletonPatternDemo {
public static void main(String args[]) {
	SingleObjectClass obj = SingleObjectClass.getInstance();
	System.out.println(obj);
	SingleObjectClass obj2 = SingleObjectClass.getInstance();
	System.out.println(obj2);
	
}
}
