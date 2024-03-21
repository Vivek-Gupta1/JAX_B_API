package Marchler;

import java.io.File;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import Entity.Emp;

public class Marsler {
public static void main(String[] args) throws JAXBException {
	Emp e = new Emp();
	e.setId(101);
	e.setName("vivek");
	e.setSal(2000.00);
	
	JAXBContext context = JAXBContext.newInstance(Emp.class);
	Marshaller marshaller = context.createMarshaller();
	marshaller.marshal(e, new File("Employee.XML"));
}
}
