package main;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)//단일테스트를 위해 
@ContextConfiguration(classes=Config.class)

public class MessageApp {
	
	@Autowired
	private MessageBean bean;
	
	@Test
	public void messageCheck(){
		bean.sayHello();
	}

	
}
