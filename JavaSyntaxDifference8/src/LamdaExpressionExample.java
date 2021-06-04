
public class LamdaExpressionExample {

	//a lambda expression is charecterised by :
	//parameters -> expression body
	
	// Optional type declaration − No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.

	// Optional parenthesis around parameter − No need to declare a single parameter in parenthesis. For multiple parameters, parentheses are required.

	// Optional curly braces − No need to use curly braces in expression body if the body contains a single statement.

	// Optional return keyword − The compiler automatically returns the value if the body has a single expression to return the value. 
	//Curly braces are required to indicate that expression returns a value.
	
	public static void main(String args[]) {
		//with type declareation
		
		System.out.println("sum of two numbers == "+ (int a,int b) -> a+b);
	}
}
