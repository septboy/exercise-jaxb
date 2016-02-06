package kumc.jaxb.adapter.immutable;

import javax.xml.bind.annotation.XmlAttribute;


public class AdaptedCustomer {
	private String name;
	private Address address;

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}