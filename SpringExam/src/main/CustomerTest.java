package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Customer;
import service.CustomerService;

public class CustomerTest {

	public static void main(String[] args) {

		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		CustomerService service = (CustomerService)ctx.getBean("customerService");
		
		List<Customer> list = service.findAll();
		for(Customer cus : list){
			System.out.println(cus.toString());
		}
		
		
		Customer cusone = service.findOne("kimo");
		
		System.out.println(cusone);
		
		service.save(cusone);
		
		service.remove("kimo");
		
		
		
	}

}
