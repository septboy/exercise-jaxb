package kumc.jaxb.virtual;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.eclipse.persistence.jaxb.JAXBContextFactory;

public class Demo {
	public static void main(String[] args) throws Exception {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY,
				"kumc/jaxb/virtual/binding.xml");
		JAXBContext jc = JAXBContext.newInstance(new Class[] { Customer.class,
				Address.class }, properties);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		File xml = new File("src/main/java/kumc/jaxb/virtual/input.xml");
		Customer customer = (Customer) unmarshaller.unmarshal(xml);
		customer.setLastName("Doe");
		customer.put("middleName", "Anne");
		PhoneNumber cellPhoneNumber = new PhoneNumber();
		cellPhoneNumber.setNumber("555-CELL");
		cellPhoneNumber.put("type", "CELL");
		customer.<List<PhoneNumber>> get("phoneNumbers").add(cellPhoneNumber);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(customer, System.out);
	}
}