package kumc.jaxb.metadatasource.refresh;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.persistence.jaxb.metadata.MetadataSourceAdapter;
import org.eclipse.persistence.jaxb.xmlmodel.JavaType;
import org.eclipse.persistence.jaxb.xmlmodel.JavaType.JavaAttributes;
import org.eclipse.persistence.jaxb.xmlmodel.ObjectFactory;
import org.eclipse.persistence.jaxb.xmlmodel.XmlBindings;
import org.eclipse.persistence.jaxb.xmlmodel.XmlBindings.JavaTypes;
import org.eclipse.persistence.jaxb.xmlmodel.XmlElement;

public class ExtensionsMetadataSource extends MetadataSourceAdapter {
	private ObjectFactory objectFactory;
	private Map<Class<?>, JavaType> javaTypes;
	private XmlBindings xmlBindings;

	public ExtensionsMetadataSource() {
		objectFactory = new ObjectFactory();
		javaTypes = new HashMap<Class<?>, JavaType>();
		xmlBindings = new XmlBindings();
		xmlBindings.setPackageName("kumc.jaxb.metadatasource.refresh");
		xmlBindings.setJavaTypes(new JavaTypes());
	}

	@Override
	public XmlBindings getXmlBindings(Map<String, ?> properties,
			ClassLoader classLoader) {
		return xmlBindings;
	}

	public JavaType getJavaType(Class<?> clazz) {
		JavaType javaType = javaTypes.get(clazz);
		if (null == javaType) {
			javaType = new JavaType();
			javaType.setName(clazz.getSimpleName());
			javaType.setJavaAttributes(new JavaAttributes());
			xmlBindings.getJavaTypes().getJavaType().add(javaType);
			javaTypes.put(clazz, javaType);
		}
		return javaType;
	}

	public void addXmlElement(Class<?> domainClass, String propertyName,
			Class<?> type) {
		XmlElement xmlElement = new XmlElement();
		xmlElement.setJavaAttribute(propertyName);
		xmlElement.setType(type.getName());
		JavaType javaType = getJavaType(domainClass);
		javaType.getJavaAttributes().getJavaAttribute()
				.add(objectFactory.createXmlElement(xmlElement));
	}
}