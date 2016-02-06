package kumc.jaxb.factory;

import java.util.Date;
import javax.xml.bind.annotation.XmlType;

@XmlType(factoryMethod = "createAddress")
public class Address {
	private String street;
	private Date createTime;

	public Address(Date time) {
		this.createTime = time;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public static Address createAddress() {
		return new Address(new Date());
	}
}