package io.robusta.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import io.robusta.annotations.Fast;
import io.robusta.annotations.Slow;

public class DespacitoApp {

	public static void main(String[] args) throws IOException {
	DespacitoApp app = new DespacitoApp();
	String content = app.readFromInternet("despacito.pw/bio.html");
	content = app.clean("http://despacito.pw/bio.html");
	app.writeInFile(content, "despacito.txt");

	}
	@Slow
	public String readFromInternet(String myUrl) throws IOException {
		URL url ;
		try {
			url = new URL(myUrl);
		} catch (MalformedURLException e) {
			try {
				url = new URL("http://"+myUrl);
			} catch (MalformedURLException e1) {
				System.out.println("sniff");
				url=null;
			}
		}
		URLConnection connection = url.openConnection();
		InputStream stream = connection.getInputStream();
		InputStreamReader reader = new InputStreamReader(stream);
		
		BufferedReader bufferedReader = new BufferedReader(reader);
		String result ="";
		String s;
		while((s=bufferedReader.readLine()) !=null){
			//System.out.println(s);
			result = result + s + "\r\n";
		}
		
		return result;
	}
	@Slow
	public String clean ( String url) throws IOException{
		Document doc = Jsoup.connect(url).get();
		String cleanContent="";
		Elements bio = doc.select("p");
		for(Element element: bio){
			cleanContent= cleanContent + element.text()+"\n";
		}
		return cleanContent;
	}
	
	@Fast
	public void writeInFile(String text, String fileName) throws IOException{
	    File file = new File(fileName);
	    if (!file.exists()){
	    	file.createNewFile();
	    }
	    FileWriter writer = new FileWriter(file, true);
	    writer.append(text);
	    writer.flush();
	    writer.close();
	}
}
