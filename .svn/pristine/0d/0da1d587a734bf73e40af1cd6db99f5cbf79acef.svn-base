package kumc.jaxb.adapter.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso( { MyEntity.class })
public class Root {
	
	@XmlJavaTypeAdapter(ListAdapter.class)
	private List< MyEntity>  list = new ArrayList<MyEntity>();

	public List<MyEntity> getList() {
		return list;
	}

	public void setList(List<MyEntity> list) {
		this.list = list;
	}

	
}