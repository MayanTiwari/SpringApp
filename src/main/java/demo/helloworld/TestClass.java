package demo.helloworld;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import demo.customBeans.CustomBean;

public class TestClass {

	public static void main(String[] args) throws IOException {
		FileSystemXmlApplicationContext con = new FileSystemXmlApplicationContext("beans.xml");
		
		/*HelloWorld ob = con.getBean(HelloWorld.class);
		ob.sayHello();*/

		//Initialize when you need it
		//CustomBean cb = con.getBean(CustomBean.class);
		//con.close();
		DataSource datas = con.getBean(DataSource.class);
		System.out.println(datas);
		/*PizzaShop pizzaShop = (PizzaShop) con.getBean("pizzaShop");
		Pizza firstPizza = pizzaShop.makePizza();
		System.out.println("First Pizza: " + firstPizza);
		Pizza secondPizza = pizzaShop.makePizza();
		System.out.println("Second Pizza: " + secondPizza);
		Pizza veggiePizza = pizzaShop.makeVeggiePizza();
		System.out.println("Veggie Pizza: " + veggiePizza);*/
		//Properties prop = new Properties();
		//FileInputStream in = new FileInputStream("src/main/resources/Config.properties");
		//prop.load(in);
		
	}

}
