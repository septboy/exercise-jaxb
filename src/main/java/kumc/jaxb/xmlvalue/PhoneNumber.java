package kumc.jaxb.xmlvalue;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "phone-number")
public class PhoneNumber {
	private String type;
	private String number;

	@XmlAttribute
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@XmlValue
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}

/**
 * @XmlValue가 있을 때 
 * <?xml version="1.0" encoding="UTF-8"?> 
 * <schema xmlns="http://www.w3.org/2001/XMLSchema">
 *  <element name="phone-number">
 *    <complexType> 
 *    	<simpleContent> 
 *    		<extension base="string"> 
 *    			<attribute name="type" type="string"/> 
 *  		</extension> 
 *  	</simpleContent> 
 *    </complexType>
 *  </element> 
 * </schema>
 * 
 * 
 * <?xml version="1.0" encoding="UTF-8"?>
 *  <phone-number type="work">555-1234</phone-number>
 *  
 *  @XmlValue가 없을 때
 *  
 *   <?xml version="1.0" encoding="UTF-8"?>
 *    <schema xmlns="http://www.w3.org/2001/XMLSchema">
 *       <element name="phone-number">
 *         <complexType>
 *           <sequence>
 *             <element name="number" type="string"/>
 *           </sequence>
 *           <attribute name="type" type="string"/>
 *        </complexType>
 *       </element>
 *    </schema>
 *   
 *   
 *   <?xml version="1.0" encoding="UTF-8"?> 
 *     <phone-number type="work">
 *         <number>555-1234</number> 
 *     </phone-number>
 */
