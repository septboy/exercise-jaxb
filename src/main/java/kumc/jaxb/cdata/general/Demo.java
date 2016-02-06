package kumc.jaxb.cdata.general;

import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Demo {
	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(Customer.class);
		Unmarshaller u = jc.createUnmarshaller();
		String xml = "<c><bio><![CDATA[<html>...</html>]]></bio></c>";
		Customer c = (Customer) u.unmarshal(new StringReader(xml));
		System.out.println("Unmarshal: " + c.getBio());
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		System.out.print("Marshal: ");
		m.marshal(c, System.out);
	}
}