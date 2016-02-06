package rest.marshal;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class JAXBDemo {

 public static void main(String[] args) {
  try {
   TestModelObejct sv = createTestModelObejct(); 
   writeXML(sv, System.out);
     
  } catch (JAXBException e) {
   e.printStackTrace();
  } 
 }

 
 private static TestModelObejct createTestModelObejct() {
  TestModelObejct sv = new TestModelObejct();
  sv.setUserId("testtesttest");
  sv.setUserName("gfafeafe");
  sv.setUserId("");

  return sv;
 }

  private static void writeXML(TestModelObejct ts, OutputStream xmlOutput)
   throws JAXBException {
  JAXBContext jaxbContext = JAXBContext.newInstance(TestModelObejct.class);
  Marshaller marshaller = jaxbContext.createMarshaller();
  marshaller.marshal(ts, xmlOutput);
 }
}




