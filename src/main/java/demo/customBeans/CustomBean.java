package demo.customBeans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CustomBean implements InitializingBean ,DisposableBean{

	
	public void init(){
		System.out.println("Init");
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("AfterPropertiesSet");
		
	}

	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}
	public void cleanUp(){
		System.out.println("cleanUp");
	}
}
