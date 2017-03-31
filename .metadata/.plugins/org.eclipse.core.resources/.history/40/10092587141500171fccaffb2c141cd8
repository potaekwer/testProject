package main;

import java.io.IOException;

public class MessageBeanKor implements MessageBean{

	private String name;
	private String greeting;
	
	private Outputter outputter;
	
	public MessageBeanKor(String name) {
		this.name = name;
	}
	
	public void setGreeting(String greeting){
		this.greeting = greeting;
	}
	
	public void setOutputter(Outputter outputter){
		this.outputter = outputter;
	}
	
	
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
