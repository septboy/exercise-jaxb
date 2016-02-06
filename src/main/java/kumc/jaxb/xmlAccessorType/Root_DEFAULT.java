package kumc.jaxb.xmlAccessorType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
/*
 * public 접근자들만 TAG가 생성
 * @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)와 동일함
 */
@XmlRootElement
public class Root_DEFAULT {
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