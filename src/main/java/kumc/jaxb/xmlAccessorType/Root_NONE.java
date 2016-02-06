package kumc.jaxb.xmlAccessorType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * annotated fields 
   annotated properties 

 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Root_NONE {
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