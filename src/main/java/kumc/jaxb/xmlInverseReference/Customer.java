package kumc.jaxb.xmlInverseReference;

import javax.persistence.*;

@Entity
public class Customer {
	@Id
	private long id;
	@OneToOne(mappedBy = "customer", cascade = { CascadeType.ALL })
	private Address address;
	private String lastName ;
}