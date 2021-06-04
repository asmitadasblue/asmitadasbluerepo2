package com.telusko.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	@RequestMapping("home") //whenever we get a request for the home, i want to execute tthis method
	//@ResponseBody //this basically prints what we send in return statement. as we are sending hello.jsp string it just prints that
/*	public String home() {
		System.out.println("hi we are executing home");
		// return "home.jsp"; //we usually dont wangt to return hardcoded .jsp file. cos later we 
		//might move to some other type of page. what then we need to come and modify this file.
		return "home";
	}*/
	
	
/*	@RequestMapping("home")
	public String home(HttpServletRequest req) {
		String name = (String) req.getParameter("name");
		System.out.println("hi we are executing home with name == "+name);
		//w can use the request dispatcher to send the value of name in req object
		//or we can use HttpSession object to do so.
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		return "home";
	}*/
	
	// npw istad of haviong req and response in the home method we will try spring way
	
/*	@RequestMapping("home")
	public String home(@RequestParam("name") String myName,HttpSession session) {
		//this one only works if in the url u give the parmeter name is 'name' . if u give anythin else
		// the above String name in home wont be able to grab the parameter from url
		//String name = (String) req.getParameter("name");
		System.out.println("hi we are executing home with name == "+myName);
		//w can use the request dispatcher to send the value of name in req object
		//or we can use HttpSession object to do so.
		// HttpSession session = req.getSession();
		session.setAttribute("name", myName);
		return "home";
	}*/
	
	// now we will see how we can add the view name and the data that is the model in a 
	//ModelAndView class that is provided and injected by spring MVC
	//@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName) {
		//this one only works if in the url u give the parmeter name is 'name' . if u give anythin else
		// the above String name in home wont be able to grab the parameter from url
		//String name = (String) req.getParameter("name");
		System.out.println("hi we are executing home with name == "+myName);
		ModelAndView mv = new ModelAndView();
		//now in this mv objcet we can add the key value attribute by callig add object method on it
		mv.addObject("name", myName); // this adds the model or the data that i want to send to view
		mv.setViewName("home");// this sets the view buy name
		return mv;
	}
	
	//now we are going to pass all three attributres of Alien object in as a request param
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		//this one only works if in the url u give the parmeter name is 'name' . if u give anythin else
		// the above String name in home wont be able to grab the parameter from url
		//String name = (String) req.getParameter("name");
		System.out.println("hi we are executing home with name == "+alien);
		ModelAndView mv = new ModelAndView();
		//now in this mv objcet we can add the key value attribute by callig add object method on it
		mv.addObject("Obj", alien); // this adds the model or the data that i want to send to view
		mv.setViewName("home");// this sets the view buy name
		return mv;
	}
	

}
