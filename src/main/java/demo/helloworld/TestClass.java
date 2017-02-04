package demo.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import demo.customBeans.CustomBean;

public class TestClass {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext con = new FileSystemXmlApplicationContext("beans.xml");
		
		/*HelloWorld ob = con.getBean(HelloWorld.class);
		ob.sayHello();*/

		//Initialize when you need it
		CustomBean cb = con.getBean(CustomBean.class);
		//con.close();
		
		/*PizzaShop pizzaShop = (PizzaShop) con.getBean("pizzaShop");
		Pizza firstPizza = pizzaShop.makePizza();
		System.out.println("First Pizza: " + firstPizza);
		Pizza secondPizza = pizzaShop.makePizza();
		System.out.println("Second Pizza: " + secondPizza);
		Pizza veggiePizza = pizzaShop.makeVeggiePizza();
		System.out.println("Veggie Pizza: " + veggiePizza);*/
		
	}

}
