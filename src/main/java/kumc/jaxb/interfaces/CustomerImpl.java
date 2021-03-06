package kumc.jaxb.interfaces;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "customer")
public class CustomerImpl implements Customer {
	private Address address;
	private List<PhoneNumber> phoneNumbers;

	@XmlElement(type = AddressImpl.class)
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@XmlElement(type = PhoneNumberImpl.class, name = "phone-number")
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
}