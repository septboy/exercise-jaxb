package kumc.jaxb.metadatasource.multiple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import org.eclipse.persistence.jaxb.JAXBContextFactory;

public class Demo {
	public static void main(String[] args) throws Exception {
		Map<String, Object> properties = new HashMap<String, Object>(1);
		List<String> bindings = new ArrayList<String>(3);
		bindings.add("kumc/jaxb/metadatasource/multiple/static-binding.xml");
		bindings.add("kumc/jaxb/metadatasource/multiple/virtual-binding-v1.xml");
		bindings.add("kumc/jaxb/metadatasource/multiple/virtual-binding-v2.xml");
		properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY, bindings);
		
		JAXBContext jc = JAXBContext.newInstance(
				new Class[] { Customer.class }, properties);
		
		Customer customer = new Customer();
		customer.set("id", 100);
		customer.setFirstName("Jane");
		customer.set("middleName", "Anne");
		customer.setLastName("Doe");
		Address billingAddress = new Address();
		billingAddress.setStreet("123 A Street");
		customer.setBillingAddress(billingAddress);
		Address shippingAddress = new Address();
		shippingAddress.setStreet("456 B Road");
		customer.set("shippingAddress", shippingAddress);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(customer, System.out);
	}
}