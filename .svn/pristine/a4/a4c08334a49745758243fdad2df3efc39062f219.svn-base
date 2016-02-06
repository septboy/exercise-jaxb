package kumc.jaxb.collection;

import java.util.*;
import javax.xml.bind.annotation.*;
/**
 * 
@XmlElement 
@XmlElementWrapper 
@XmlList 
@XmlList and @XmlAttribute 
@XmlList and @XmlValue 

 * @author user
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
	private List<String> emailAddresses;

	public Customer() {
		emailAddresses = new ArrayList<String>();
	}

	public List<String> getEmailAddresses() {
		return emailAddresses;
	}

	public void setEmailAddresses(List<String> emailAddresses) {
		this.emailAddresses = emailAddresses;
	}
}

/*
 * Default
 * 
 * By default each item in the collection will be marshalled to an XML element.
 * 
 * 
 * <customer>
 *  <emailAddresses>janed@example.com</emailAddresses>
 *  <emailAddresses>jdoe@example.org</emailAddresses>
 * </customer>
 * 
 * 
 * @XmlElement
 * 
 * We can control the name of the XML element a collection item is marshalled to
 * by using the @XmlElement annotation.
 * 
 * 
 * import java.util.*; 
 * import javax.xml.bind.annotation.*;
 * @XmlRootElement
 * @XmlAccessorType(XmlAccessType.FIELD) 
 * public class Customer {
 *   @XmlElement(name="email-address") 
 *   private List<String> emailAddresses; 
 * }
 * 
 * 
 * The following is the corresponding XML output:
 *  * 
 * <customer> 
 *   <email-address>janed@example.com</email-address>
 *   <email-address>jdoe@example.org</email-address> 
 * </customer>
 * 
 * 
 * @XmlElementWrapper
 * 
 * Sometimes we want to add a grouping element to organize our collection data.
 * This is done using the @XmlElementWrapper annotation.
 * 
 * 
 * import java.util.*; import javax.xml.bind.annotation.*;
 * @XmlRootElement@XmlAccessorType(XmlAccessType.FIELD) public class Customer {
 * @XmlElementWrapper(name="email-addresses") @XmlElement(name="email-address")
 * private List<String> emailAddresses; }
 * 
 * 
 * The following is the corresponding XML output:
 * 
 * 
 * 123456 <customer> <email-addresses>
 * <email-address>janed@example.com</email-address>
 * <email-address>jdoe@example.org</email-address> </email-addresses>
 * </customer>
 * 
 * 
 * @XmlList
 * 
 * We can also represent our collection data as space seperated text. This is
 * done using the @XmlList annotation.
 * 
 * 
 * 1234567891011 import java.util.*; import javax.xml.bind.annotation.*;
 * @XmlRootElement@XmlAccessorType(XmlAccessType.FIELD) public class Customer {
 * @XmlList private List<String> emailAddresses; }
 * 
 * 
 * The following is the corresponding XML output:
 * 
 * 
 * 1234 <customer> <emailAddresses>janed@example.com
 * jdoe@example.org</emailAddresses> </customer>
 * 
 * 
 * @XmlList and @XmlAttribute
 * 
 * Since @XmlList allows us to represent a collection in a single piece of text
 * it is also compatible with an XML attribute.
 * 
 * 
 * 123456789101112 import java.util.*; import javax.xml.bind.annotation.*;
 * @XmlRootElement@XmlAccessorType(XmlAccessType.FIELD) public class Customer {
 * @XmlList @XmlAttribute private List<String> emailAddresses; }
 * 
 * 
 * The following is the corresponding XML output:
 * 
 * 
 * 12 <customer emailAddresses="janed@example.com jdoe@example.org"/>
 * 
 * 
 * @XmlList and @XmlValue
 * 
 * Since @XmlList allows us to represent a collection in a single piece of text
 * it is also compatible with a single text node.
 * 
 * 
 * 123456789101112 import java.util.*; import javax.xml.bind.annotation.*;
 * @XmlRootElement@XmlAccessorType(XmlAccessType.FIELD) public class Customer {
 * @XmlList @XmlValue private List<String> emailAddresses; }
 * 
 * 
 * The following is the corresponding XML output:
 * 
 * 
 * 1 <customer>janed@example.com jdoe@example.org</customer>
 */