package kumc.jaxb.xmlInverseReference;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

@Entity
public class Address implements Serializable {
	@Id
	private long id;
	@OneToOne
	@JoinColumn(name = "ID")
	@MapsId
	@XmlInverseReference(mappedBy="address") 
	private Customer customer;
}