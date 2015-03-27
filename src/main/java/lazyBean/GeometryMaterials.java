package lazyBean;

import javax.annotation.PostConstruct;

/**
 * Created by mt on 27.03.2015.
 */
public class GeometryMaterials {

    public static final String GEOMETRY_MATERIALS = "Geometry materials";

    @PostConstruct
    public void postConstruct(){
        System.out.println(GEOMETRY_MATERIALS);
    }
}
