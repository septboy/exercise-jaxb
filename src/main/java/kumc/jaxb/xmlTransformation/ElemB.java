package kumc.jaxb.xmlTransformation;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.oxm.annotations.XmlReadTransformer;
import org.eclipse.persistence.oxm.annotations.XmlTransformation;
import org.eclipse.persistence.oxm.annotations.XmlWriteTransformer;
import org.eclipse.persistence.oxm.annotations.XmlWriteTransformers;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ELEM_B")
public class ElemB {
	@XmlReadTransformer(transformerClass = DateAttributeTransformer.class)
	@XmlWriteTransformers({
			@XmlWriteTransformer(xmlPath = "B_DATE/text()", transformerClass = DateFieldTransformer.class),
			@XmlWriteTransformer(xmlPath = "B_TIME/text()", transformerClass = TimeFieldTransformer.class), })
	private Date bDate;
	@XmlElement(name = "NUM")
	private int num;
	@XmlReadTransformer(transformerClass = DateAttributeTransformer.class)
	@XmlWriteTransformers({
			@XmlWriteTransformer(xmlPath = "C_DATE/text()", transformerClass = DateFieldTransformer.class),
			@XmlWriteTransformer(xmlPath = "C_TIME/text()", transformerClass = TimeFieldTransformer.class), })
	private Date cDate;
}