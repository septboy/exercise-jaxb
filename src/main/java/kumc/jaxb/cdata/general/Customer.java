package kumc.jaxb.cdata.general;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "c")
public class Customer {
	private String bio;

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getBio() {
		return bio;
	}
}