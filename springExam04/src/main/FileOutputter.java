package main;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
public class FileOutputter implements Outputter{
	
	@Value("out.txt")
	private String filePath;

	@Override
	public void outputter(String message) throws IOException {
		
		FileWriter out  = new FileWriter(filePath);
		
		out.write(message);
		out.close();
		
	}
	public void setFilePath(String filePath){
		this.filePath = filePath;
	}

}
