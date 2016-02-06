package kumc.jaxb.cdata.xmlCDATA;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

public class Demo {
	public static void main(String[] args) throws JAXBException {
		Map oxm = new HashMap(1);
		oxm.put("kumc.jaxb.cdata", new StreamSource("C:/workspace_kumc/project/marshal/src/main/java/kumc/jaxb/cdata/oxm.xml"));
		
		Map props = new HashMap(1);
		props.put("eclipselink-oxm-xml", oxm);
		
		Class[] classes = { Customer.class };
		JAXBContext jc = JAXBContext.newInstance(classes, props);
		Unmarshaller u = jc.createUnmarshaller();
		String xml = "<c><bio><![CDATA[<html>...</html>]]></bio></c>";
		Customer c = (Customer) u.unmarshal(new StringReader(xml));
		
		System.out.println("Unmarshal: " + c.getBio());
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FRAGMENT, true);
		
		System.out.print("Marshal: ");
		m.marshal(c, System.out);
		
	}
}