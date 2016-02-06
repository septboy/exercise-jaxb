package kumc.jaxb.xmlTransformation;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Demo {
	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(ElemB.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		File xml = new File("src/main/java/kumc/jaxb/xmlTransformation/input.xml");
		ElemB elemB = (ElemB) unmarshaller.unmarshal(xml);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(elemB, System.out);
	}
}