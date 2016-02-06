package kumc.jaxb.xpath;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Demo {
	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(Customer.class);
		Customer customer = new Customer();
		Address billingAddress = new Address();
		billingAddress.setStreet("1 Billing Street");
		customer.setBillingAddress(billingAddress);
		Address shippingAddress = new Address();
		shippingAddress.setStreet("2 Shipping Road");
		customer.setShippingAddress(shippingAddress);
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(customer, System.out);
	}
}