package kumc.jaxb.adapter.map.moxy;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Demo {

    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Root.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Root root = (Root) unmarshaller.unmarshal(
        	new File("/Users/kimseunghwan/Develop/java/workspace/MarshalJaxB/src/main/java/kumc/jaxb/adapter/map/moxy/oxm.xml")
        );

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(root, System.out);
        
    }
}