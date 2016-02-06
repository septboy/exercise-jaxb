package kumc.jaxb.adapter.map.moxy;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
public class Root {

    private Map<String, String> mapProperty;

    public Root() {
        mapProperty = new HashMap<String, String>();
    }

    @XmlJavaTypeAdapter(MapAdapter.class)
    public Map<String, String> getMapProperty() {
        return mapProperty;
    }

    public void setMapProperty(Map<String, String> map) {
        this.mapProperty = map;
    }

}