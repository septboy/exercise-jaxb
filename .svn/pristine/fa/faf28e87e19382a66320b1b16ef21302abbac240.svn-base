package kumc.jaxb.factory;
import java.util.Date; 
import java.util.List; 
  
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
import javax.xml.bind.annotation.XmlType; 
  
@XmlRootElement
@XmlType( 
    propOrder={"name", "address", "phoneNumbers"}, 
    factoryClass=CustomerFactory.class, 
    factoryMethod="createCustomer") 
public class Customer { 
  
    private String name; 
    private Address address; 
    private List<PhoneNumber> phoneNumbers; 
    private Date createTime; 
  
    public Customer(Date time) { 
        this.createTime = time; 
    } 
  
    public String getName() { 
        return name; 
    } 
  
    public void setName(String name) { 
        this.name = name; 
    } 
  
    public Address getAddress() { 
        return address; 
    } 
  
    public void setAddress(Address address) { 
        this.address = address; 
    } 
  
    @XmlElement(name="phone-number") 
    public List<PhoneNumber> getPhoneNumbers() { 
        return phoneNumbers; 
    } 
  
    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) { 
        this.phoneNumbers = phoneNumbers; 
    } 
  
}