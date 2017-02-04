package demo.helloworld;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//Old way of using application context/
public class CommandManager implements ApplicationContextAware {
	
	private ApplicationContext applicationContext;

    public Object process(Map commandState) {
        // grab a new instance of the appropriate Command
    	//Command command = createCompany();
        // set the state on the (hopefully brand new) Command instance
        //command.setState(commandState);
       // return command.execute();
    	
    	return null;
    }

    protected Company createCompany() {
        // notice the Spring API dependency!
        return this.applicationContext.getBean("command", Company.class);
    }

    public void setApplicationContext(
            ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
