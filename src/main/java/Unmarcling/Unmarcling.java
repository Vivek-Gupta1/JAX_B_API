package Unmarcling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import Entity.Emp;

public class Unmarcling {
	public static void main(String[] args) throws JAXBException {
		
	
	File f= new File("Employee.Xml");
	
	JAXBContext context = JAXBContext.newInstance(Emp.class);
	Unmarshaller unmarshaller = context.createUnmarshaller();
	Object unmarshal = unmarshaller.unmarshal(f);
	 Emp e=(Emp)unmarshal;
	 System.out.println(e);


}


}