package kumc.jaxb.adapter.immutable;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(CustomerAdapter.class) 
public class Customer {
	private final String name;
	private final Address address;

	public Customer(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}
}