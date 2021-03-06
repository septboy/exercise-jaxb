package kumc.jaxb.interfaces;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Demo {
	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(CustomerImpl.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		
		File xml = new File("src/main/java/kumc/jaxb/interfaces/input.xml");
		
		Customer customer = (Customer) unmarshaller.unmarshal(xml);
		Address address = customer.getAddress();
		
		System.out.println(address.getStreet());
		
		for (PhoneNumber phoneNumber : customer.getPhoneNumbers()) {
			System.out.println(phoneNumber.getValue());
		}
		
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(customer, System.out);
	}
}