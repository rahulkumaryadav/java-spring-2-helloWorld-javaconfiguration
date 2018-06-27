package rk.com.clientDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rk.com.beans.Employee;
import rk.com.config.BeanConfig;

public class EmployeeDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfig.class);
        Employee employee=applicationContext.getBean(Employee.class);
        System.out.println(employee);

    }
}
