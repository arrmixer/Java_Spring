package DependencyInjection.clients;

import DependencyInjection.vehicles.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Angel on 6/12/17.
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Vehicle aCar = (Vehicle) context.getBean("mrBeansCar");
        aCar.crankIgnition();
    }
}
