package kumc.jaxb.multitenant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import org.eclipse.persistence.jaxb.JAXBContextFactory;

public class DemoTenant1 {
	public static void main(String[] args) throws Exception {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY,
				"kumc/jaxb/multitenant/binding-tenant1.xml");
		JAXBContext jc = JAXBContext.newInstance(new Class[] { Customer.class,
				Address.class }, properties);
		
		Customer customer = new Customer();
		customer.setFirstName("Jane");
		customer.put("middleName", "Anne");
		customer.setLastName("Doe");
		
		Address billingAddress = new Address();
		billingAddress.setStreet("1 Billing Street");
		customer.setBillingAddress(billingAddress);
		
		Address shippingAddress = new Address();
		shippingAddress.setStreet("2 Shipping Road");
		customer.put("shipping", shippingAddress);
		
		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		customer.put("phoneNumbers", phoneNumbers);
		PhoneNumber workPhoneNumber = new PhoneNumber();
		workPhoneNumber.setNumber("555-WORK");
		workPhoneNumber.put("type", "WORK");
		phoneNumbers.add(workPhoneNumber);
		PhoneNumber homePhoneNumber = new PhoneNumber();
		homePhoneNumber.setNumber("555-HOME");
		homePhoneNumber.put("type", "HOME");
		phoneNumbers.add(homePhoneNumber);
		
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(customer, System.out);
	}
}