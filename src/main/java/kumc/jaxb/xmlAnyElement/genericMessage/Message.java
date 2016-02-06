package kumc.jaxb.xmlAnyElement.genericMessage;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Message {
	@XmlAttribute
	private String to;
	@XmlAttribute
	private String from;
	@XmlAnyElement(lax = true)
	private Object body;
}