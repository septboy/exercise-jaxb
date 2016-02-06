package kumc.jaxb.xmlElements;

import javax.xml.bind.*;

public class DemoWithPhoneNumber {
	public static void main(String[] args) throws Exception {
		Customer customer = new Customer();
		customer.setName("Jane Doe");
		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setType("work");
		phoneNumber.setNumber("555-1111");
		customer.setContactInfo(phoneNumber);
		JAXBContext jc = JAXBContext.newInstance(Customer.class,
				PhoneNumber.class, Address.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(customer, System.out);
	}
}