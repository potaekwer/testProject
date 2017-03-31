package main;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Component
public class MessageBeanKor implements MessageBean{

	@Value("����")
	private String name;
	@Value("�ȳ�")
	private String greeting;
	
	@Autowired
	private Outputter outputter;
	
	public MessageBeanKor() {}	
	
	@Override
	public void sayHello() {
		
		String message = greeting +" " +name;
		System.out.println(message);
		
		try {
			outputter.outputter(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
