package kumc.jaxb.xmlAnyElement.domHandler;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.annotation.DomHandler;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class BioHandler implements DomHandler<String, StreamResult> {
	private static final String BIO_START_TAG = "<bio>";
	private static final String BIO_END_TAG = "</bio>";
	private StringWriter xmlWriter = new StringWriter();

	public StreamResult createUnmarshaller(ValidationEventHandler errorHandler) {
		return new StreamResult(xmlWriter);
	}

	/* Dom구조에서 특정 TAG안에 있는 내용을 가져온다. */
	public String getElement(StreamResult rt) {
		String xml = rt.getWriter().toString();
		int beginIndex = xml.indexOf(BIO_START_TAG) + BIO_START_TAG.length();
		int endIndex = xml.indexOf(BIO_END_TAG);
		return xml.substring(beginIndex, endIndex);
	}

	/* java Object를 XML 문서로 marshal 처리 한다. */
	public Source marshal(String n, ValidationEventHandler errorHandler) {
		try {
			String xml = BIO_START_TAG + n.trim() + BIO_END_TAG;
			StringReader xmlReader = new StringReader(xml);
			return new StreamSource(xmlReader);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}