package kumc.jaxb.factory;

import javax.xml.bind.annotation.XmlValue;

public class PhoneNumber {
	private String value;

	@XmlValue
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}