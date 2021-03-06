package kumc.jaxb.metadatasource.refresh;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.jaxb.JAXBHelper;
 
public class Demo {
	public static void main(String[] args) throws Exception {
		
		Map<String, Object> properties = new HashMap<String, Object>(1);
		ExtensionsMetadataSource extensions = new ExtensionsMetadataSource();
		properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY, extensions);
		JAXBContext jc = JAXBContext.newInstance(
				new Class[] { Customer.class }, properties);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Customer customer = new Customer();
		customer.setFirstName("Jane");
		customer.set("middleName", "Anne");
		customer.setLastName("Doe");
		
		Address billingAddress = new Address();
		billingAddress.setStreet("123 Billing Address");
		customer.setBillingAddress(billingAddress);
		Address shippingAddress = new Address();
		shippingAddress.setStreet("456 Shipping Address");
		customer.set("shippingAddress", shippingAddress);
		
		marshaller.marshal(customer, System.out);
		extensions.addXmlElement(Customer.class, "middleName", String.class);
		extensions.addXmlElement(Customer.class, "shippingAddress",Address.class);
		
		JAXBHelper.getJAXBContext(jc).refreshMetadata();
		marshaller.marshal(customer, System.out);
	}
}