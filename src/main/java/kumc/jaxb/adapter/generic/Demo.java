package kumc.jaxb.adapter.generic;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Demo {

    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Root.class, B.class);

        Root root = new Root();
        BoundType<B> a = new BoundType<B>();
        a.t = new B();
        root.a = a;

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(root, System.out);
    }

}
