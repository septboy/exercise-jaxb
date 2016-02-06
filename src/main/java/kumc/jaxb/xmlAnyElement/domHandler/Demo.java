package kumc.jaxb.xmlAnyElement.domHandler;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Demo {
	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(Customer.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		Customer customer = (Customer) unmarshaller.unmarshal(new File(
				"src/main/java/kumc/jaxb/xmlAnyElement/input.xml"));
		System.out.println("Name:  " + customer.getName());
		System.out.println("Bio:   " + customer.getBio());
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(customer, System.out);
	}
}