package kumc.jaxb.xmlAccessorType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/*
 *  생성되는 항목
 * 	annotated fields 
	properties 
	사용목적 : public fields를 보호하기 위함.

 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Root_PROPERTY {
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