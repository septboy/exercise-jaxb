package kumc.jaxb.adapter.mapInList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlType;

class Adapters {
	private Adapters() {
	}

	public static Class<?>[] getXmlClasses() {
		return new Class<?>[] { XMap.class, XEntry.class, XCollection.class };
	}

	public static Object xmlizeNestedStructure(Object input) {
		if (input instanceof Map<?, ?>) {
			return xmlizeNestedMap((Map<?, ?>) input);
		}
		if (input instanceof Collection<?>) {
			return xmlizeNestedCollection((Collection<?>) input);
		}
		return input; // non-special object, return as is
	}

	public static Object dexmlizeNestedStructure(Object input) {
		if (input instanceof XMap<?, ?>) {
			return dexmlizeNestedMap((XMap<?, ?>) input);
		}
		if (input instanceof XCollection<?>) {
			return dexmlizeNestedCollection((XCollection<?>) input);
		}
		return input; // non-special object, return as is
	}

	private static Object dexmlizeNestedCollection(XCollection<?> input) {
		Class<? extends Collection> clazz = input.getClazz();
		Collection collection = null;
		try {
			collection = clazz.newInstance();
			List dataList = input.getList();
			for (Object object : dataList) {
				collection.add(dexmlizeNestedStructure(object));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return collection;
	}

	private static Object dexmlizeNestedMap(XMap<?, ?> input) {
		Class<? extends Map> clazz = input.getClazz();
		Map map = null;
		try {
			map = clazz.newInstance();
			List<? extends XEntry> entryList = input.getList();
			for (XEntry xEntry : entryList) {
				Object key = dexmlizeNestedStructure(xEntry.getKey());
				Object value = dexmlizeNestedStructure(xEntry.getValue());
				map.put(key, value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	public static XMap<?, ?> xmlizeNestedMap(Map<?, ?> input) {
		XMap<Object, Object> ret = new XMap<Object, Object>(input.getClass());
		for (Map.Entry<?, ?> e : input.entrySet()) {
			ret.add(xmlizeNestedStructure(e.getKey()),
					xmlizeNestedStructure(e.getValue()));
		}
		return ret;
	}

	public static XCollection<?> xmlizeNestedCollection(Collection<?> input) {
		XCollection<Object> ret = new XCollection<Object>(input.getClass());
		for (Object entry : input) {
			ret.add(xmlizeNestedStructure(entry));
		}
		return ret;
	}

	@XmlType
	@XmlRootElement
	public final static class XMap<K, V> {
		private List<XEntry<K, V>> list = new ArrayList<XEntry<K, V>>();
		private Class<? extends Map> clazz = null;

		public XMap(Class mapClazz) {
			this.clazz = (Class<? extends Map>) mapClazz;
		}

		public XMap() {
		}

		public void add(K key, V value) {
			list.add(new XEntry<K, V>(key, value));
		}

		@XmlElementWrapper(name = "map")
		@XmlElement(name = "entry")
		public List<XEntry<K, V>> getList() {
			return list;
		}

		public void setList(List<XEntry<K, V>> list) {
			this.list = list;
		}

		@XmlElement(name = "clazz")
		public Class<? extends Map> getClazz() {
			return clazz;
		}

		public void setClazz(Class<? extends Map> clazz) {
			this.clazz = clazz;
		}
	}

	@XmlType
	@XmlRootElement
	public final static class XEntry<K, V> {
		private K key;
		private V value;

		private XEntry() {
		}

		public XEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@XmlElement
		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		@XmlElement
		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}
	}

	@XmlType
	@XmlRootElement
	public final static class XCollection<V> {
		private List<V> list = new ArrayList<V>();
		private Class<? extends Collection> clazz = null;

		public XCollection(Class collectionClazz) {
			this.clazz = collectionClazz;
		}

		public XCollection() {
		}

		public void add(V obj) {
			list.add(obj);
		}

		@XmlElementWrapper(name = "collection")
		@XmlElement(name = "entry")
		public List<V> getList() {
			return list;
		}

		public void setList(List<V> list) {
			this.list = list;
		}

		@XmlElement(name = "clazz")
		public Class<? extends Collection> getClazz() {
			return clazz;
		}

		public void setClazz(Class<? extends Collection> clazz) {
			this.clazz = clazz;
		}
	}
}
