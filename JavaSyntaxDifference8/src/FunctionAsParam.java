
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;



public class FunctionAsParam {
public static void main(String args[]) {
	List<String> names1 = new ArrayList<String>();
    names1.add("Mahesh ");
    names1.add("Suresh ");
    names1.add("Ramesh ");
    names1.add("Naresh ");
    names1.add("Kalpesh ");
		
    List<String> names2 = new ArrayList<String>();
    names2.add("Mahesh ");
    names2.add("Suresh ");
    names2.add("Ramesh ");
    names2.add("Naresh ");
    names2.add("Kalpesh ");
    
    FunctionAsParam obj = new FunctionAsParam();
    //sort using java 7
    obj.sortUsingJava7(names1);
    System.out.println(names1+" --- sorted using java 7");
    
    //sort using java 8
    obj.sortUsingJava8(names2);
    


	

	
    	
 }

private void sortUsingJava7(List<String> names) {
	Collections.sort(names, new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.compareToIgnoreCase(o2);
		}
	});
}

private void sortUsingJava8(List<String> names) {
	Collections.sort(names , (o1,o2) -> o1.compareToIgnoreCase(o2));
}
	
}
