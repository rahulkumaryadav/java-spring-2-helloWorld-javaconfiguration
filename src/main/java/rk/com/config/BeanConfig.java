package rk.com.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import rk.com.beans.Employee;

@Configuration
public class BeanConfig {
    @Bean
    public Employee getEmployee(){
        Employee employee=new Employee();
        employee.setId(10);
        employee.setName("rahul");
        return employee;
    }
}
