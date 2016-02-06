package kumc.jaxb.xmlAccessorType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * PUBLIC_MEMBER is the default access type in JAXB
 * It means that a JAXB implementation will generate bindings for:
	public fields 
	annotated fields 
	properties 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Root_PUBLIC_MEMBER {
	private String fieldA;
	@XmlAttribute
	private String fieldB;
	public String fieldC;

	@XmlAttribute
	public String getPropertyA() {
		return fieldA;
	}

	public void setPropertyA(String a) {
		this.fieldA = a;
	}

	public String getPropertyB() {
		return fieldB;
	}

	public void setPropertyB(String b) {
		this.fieldB = b;
	}
}