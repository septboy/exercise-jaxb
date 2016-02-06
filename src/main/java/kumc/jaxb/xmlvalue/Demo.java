package kumc.jaxb.xmlvalue;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Demo {
	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(PhoneNumber.class);
		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setType("work");
		phoneNumber.setNumber("555-1234");
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(phoneNumber, System.out);
	}
}