package co.edureka;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
// object construction
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("ASmita");
		emp.setEaddress("phoenix");
		
		System.out.println("employee "+emp.toString());
		
		// now we gonna do spring way by using IOC
		// we shall see how to write the spring API and how to utilise them
		// first is we need to add jar files
		//Resource resource = new ClassPathResource("employeebean.xml");
		//BeanFactory factory = new XmlBeanFactory(resource); //this is the spring core factory container which will parse the 
		//xml file and construct the necassary object for u
		
		// there are several spring containers . XML Bean factory is one
		//another is ApplicatuonCOntext. it is an implementation of the BeanFactory
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml"); // this will
		// creat ethe object even if u don request for it. but bean factory doesnt.
		
		//ApplicationContext 
		//how to get the bean
		//Employee e1 = (Employee)factory.getBean("emp1");
		//Employee e2 = factory.getBean("emp2",Employee.class);
		
		Employee e3= (Employee)context.getBean("emp1");
		Employee e4 = context.getBean("emp2",Employee.class);
		
		System.out.println(e3+ "  "+e4);
		
		
	}
			
}
