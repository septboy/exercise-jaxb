package kumc.jaxb.xmlAnyElement.genericMessage;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Demo {
	public static void main(String[] args) throws Exception {
		/*
		 * We could create the JAXBContext on an array of classes, 
		 * but our goal is to be able to easily add additional payloads over time.  
		 * Here we will create the JAXBContext using a context path:
		 * JAXBContext.newInstance("message:customer:product"); 패키지 명 
		 */
		JAXBContext jc = JAXBContext.newInstance("kumc.jaxb.xmlAnyElement.genericMessage");
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		File file = new File("src/main/java/kumc/jaxb/xmlAnyElement/genericMessage/input.xml");
		Message message = (Message) unmarshaller.unmarshal(file);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(message, System.out);
	}
}