package io.robusta.files;

import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteApp {

	public static void main(String[] args) throws IOException {
	     WriteApp writeapp = new WriteApp();
	     writeapp.append();
	     writeapp.appendlist();

	    }

	    public void write() throws IOException{
	    String filename="astropox.csv";
	    File file = new File(filename);
	    if (!file.exists()){
	    	file.createNewFile();
	    }
	    FileWriter writer = new FileWriter(file);
	    writer.write("Hello World");
	    writer.flush();
	    writer.close();
	}
	
	    public void append() throws IOException{
		    String filename="astropox.csv";
		    File file = new File(filename);
		    if (!file.exists()){
		    	file.createNewFile();
		    }
		    FileWriter writer = new FileWriter(file, true);
		    writer.append("Hello World");
		    writer.flush();
		    writer.close();
		}

	    public void appendlist() throws IOException{
		    String filename="astropox.csv";
		    File file = new File(filename);
		    if (!file.exists()){
		    	file.createNewFile();
		    }
		    java.util.List<Integer> list = Arrays.asList(1,2,3);
		    FileWriter writer = new FileWriter(file, true);
		    for(Integer number : list){
		    	writer.write(number + ";");
		    }
		    writer.flush();
		    writer.close();
		}
}
