package model;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class TestSTB {

	public String loadFileXML() throws IOException {
		StringBuilder message = new StringBuilder();
		Resource resource = new DefaultResourceLoader().getResource("classpath:smallSTB.xml");
		InputStream stream = resource.getInputStream();
		
		int data;
		while ((data = stream.read()) != -1) {
			message.append((char) data);
		}
		return message.toString();
	}
}
