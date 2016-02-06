package kumc.jaxb.adapter.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.junit.Test;


public class RootTest {

	@Test
	public void listAdapterTest()  throws Exception {
		Root root = new Root();
		
		List<MyEntity> list = new ArrayList<MyEntity>();
		MyEntity entity = new MyEntity() ;
		entity.setKey("key");
		entity.setValue("value");
		list.add(entity);
		
		root.setList(list);
		
		JAXBContext jc = JAXBContext.newInstance(Root.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(root, System.out);
	}
}
