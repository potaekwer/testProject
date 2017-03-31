package main;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter{
	
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
