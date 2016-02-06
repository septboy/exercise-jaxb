package kumc.jaxb.adapter.generic;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * 
 * ValueType = XML 표현이 가능한 JavaClass
 * BoundType = XML 표현이 불가한 JavaClass
 * @param <ValueType>
 */
public class AAdapter<ValueType> extends XmlAdapter<ValueType, BoundType<ValueType>> {

    @Override
    public BoundType<ValueType> unmarshal(ValueType v) throws Exception {
        return new BoundType<ValueType>();
    }

    @Override
    public ValueType marshal(BoundType<ValueType> v) throws Exception {
        return v.t;
    }

}
