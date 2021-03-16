package com.ayub.mvntest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*Previous example of using Car class and Bike class having the same method*/
    	//Car obj = new Car();
        //Bike obj = new Bike();
    	
    	/*Using an interface we can make sure that both Car and Bike classes will have a drive method
    	shown in the Vehicle class.
    	Vehicle obj = new Car();
    	Vehicle obj = new Bike();*/
    	
    	/*BeanFactory and ApplicationContext both use SpringFramework and have the getBean method.
    	BeanFactory for smaller scale applications and ApplicationContext for enterprise apps.
    	ApplicationContext is also a superset of WinFactory.
    	ApplicationContext is an interface so we have to use ClassPathXmlApplicationContext*/
    	
    	
    
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	//We have to typecast as getBean gives us an Object.
    	Vehicle obj = (Vehicle) context.getBean("vehicle");
    	
        obj.drive();
    }
}
