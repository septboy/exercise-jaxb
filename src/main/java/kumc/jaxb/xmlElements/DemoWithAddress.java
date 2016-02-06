package kumc.jaxb.xmlElements;

import javax.xml.bind.*;

public class DemoWithAddress {
	public static void main(String[] args) throws Exception {
		Customer customer = new Customer();
		customer.setName("Jane Doe");
		Address address = new Address();
		address.setStreet("1 A Street");
		address.setCity("Any Town");
		customer.setContactInfo(address);
		JAXBContext jc = JAXBContext.newInstance(Customer.class,
				PhoneNumber.class, Address.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(customer, System.out);
	}
}