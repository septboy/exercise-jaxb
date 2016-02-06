package kumc.jaxb.adapter.list;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyEntity {
	private String key ;
	private String value ;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
