package kumc.jaxb.xmlElements;

import javax.xml.bind.*;

public class DemoWithString {
	public static void main(String[] args) throws Exception {
		Customer customer = new Customer();
		customer.setName("Jane Doe");
		customer.setContactInfo("jane.doe@example.com");
		JAXBContext jc = JAXBContext.newInstance(Customer.class,
				PhoneNumber.class, Address.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(customer, System.out);
	}
}