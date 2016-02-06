package kumc.jaxb.multitenant;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlVirtualAccessMethods;

@XmlTransient
@XmlVirtualAccessMethods(setMethod = "put")
public class ExtensibleBase {
	private Map<String, Object> extensions = new HashMap<String, Object>();

	public <T> T get(String property) {
		return (T) extensions.get(property);
	}

	public void put(String property, Object value) {
		extensions.put(property, value);
	}
}