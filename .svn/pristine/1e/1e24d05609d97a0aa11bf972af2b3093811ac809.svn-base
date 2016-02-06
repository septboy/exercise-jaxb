package kumc.jaxb.xmlElements;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
	private String name;
	@XmlElements(value = { @XmlElement(name = "address", type = Address.class),
			@XmlElement(name = "phone-number", type = PhoneNumber.class),
			@XmlElement(name = "note", type = String.class) })
	private Object contactInfo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(Object contactInfo) {
		this.contactInfo = contactInfo;
	}
	
}