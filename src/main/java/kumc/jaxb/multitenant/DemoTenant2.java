package kumc.jaxb.multitenant;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import org.eclipse.persistence.jaxb.JAXBContextFactory;

public class DemoTenant2 {
	public static void main(String[] args) throws Exception {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY,
				"kumc/jaxb/multitenant/binding-tenant2.xml");
		JAXBContext jc = JAXBContext.newInstance(new Class[] { Customer.class,
				Address.class }, properties);
		Customer customer = new Customer();
		customer.setFirstName("Jane");
		customer.setLastName("Doe");
		Address billingAddress = new Address();
		billingAddress.setStreet("1 Billing Street");
		customer.setBillingAddress(billingAddress);
		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setNumber("555-WORK");
		customer.put("phoneNumber", phoneNumber);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(customer, System.out);
	}
}