package kumc.jaxb.multitenant;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer extends ExtensibleBase {
	private String firstName;
	private String lastName;
	private Address billingAddress;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
}