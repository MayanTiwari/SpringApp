package demo.customBeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BBPostProcessor implements BeanPostProcessor,Ordered {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BBPostProcessor " + beanName + " Created " + bean.toString() );
		return bean;
	}

	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
