package kumc.jaxb.adapter.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * List 타입은 자동으로 marshal해준다. 다만 <T>값처리가 문제임. 
 * 현재로서는 @XmlSeeAlso( { MyEntity.class })을 사용하여 문제를 처리하고 있음.
 * @author user
 *
 * @param <T>
 */
public class ListAdapter<T> extends XmlAdapter<Object[], List<T>> {
	
	@Override
	 public List<T> unmarshal(Object[] objects) throws Exception {
	     return (List<T>)Collections.unmodifiableList(Arrays.asList(objects));
	 }
	
	 @Override
	 public T[] marshal(List<T> objects) throws Exception {
	     return (T[])objects.toArray();
	 }

}
