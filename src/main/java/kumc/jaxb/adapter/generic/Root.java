package kumc.jaxb.adapter.generic;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
public class Root {

	// 
    @XmlJavaTypeAdapter(AAdapter.class)
    public BoundType<B> a;  // 값이 들어있는 타입이면서 Xml로 표현이 불가한 타입 

}
