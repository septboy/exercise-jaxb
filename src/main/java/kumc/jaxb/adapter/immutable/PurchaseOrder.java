package kumc.jaxb.adapter.immutable;
import javax.xml.bind.annotation.XmlRootElement;   @XmlRootElement(name="purchase-order") public class PurchaseOrder {       private Customer customer;       public Customer getCustomer() {         return customer;     }       public void setCustomer(Customer customer) {         this.customer = customer;     }   }