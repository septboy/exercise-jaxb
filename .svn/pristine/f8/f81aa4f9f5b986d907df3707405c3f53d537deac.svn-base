package kumc.jaxb.xmlAccessorType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Demo {
	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(Root_NONE.class);
		Root_NONE root = new Root_NONE();
		root.setPropertyA("a");
		root.setPropertyB("b");
		root.fieldC = "c";
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(root, System.out);
	}
}