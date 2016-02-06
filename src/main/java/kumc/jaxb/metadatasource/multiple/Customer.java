package kumc.jaxb.metadatasource.multiple;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlVirtualAccessMethods;

@XmlRootElement
@XmlType(propOrder = { "firstName", "lastName", "address" })
@XmlVirtualAccessMethods
public class Customer {
	private String firstName;
	private String lastName;
	private Address billingAddress;
	private Map<String, Object> extensions = new HashMap<String, Object>();

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

	public Object get(String key) {
		return extensions.get(key);
	}

	public void set(String key, Object value) {
		extensions.put(key, value);
	}
}