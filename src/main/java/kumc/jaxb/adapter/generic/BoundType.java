package kumc.jaxb.adapter.generic;

import java.util.ArrayList;
import java.util.List;

public class BoundType<T> {

    public T t;
    
    public List<T> list = new ArrayList<T>();

}
