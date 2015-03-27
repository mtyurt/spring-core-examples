package lazyBean;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by mt on 27.03.2015.
 * If this test class is run with SpringJunit4ClassRunner, this test
 * will fail. Because
 */
public class LazyBeanTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    private AnnotationConfigApplicationContext ctx;

    @Before
    public void init() {
        ctx = new AnnotationConfigApplicationContext(LazyBeanConfig.class);
    }

    @Test
    public void shouldNotPrintGeometry() {
        assertEquals(HistoryMaterials.HISTORY_MATERIALS, log.getLog().trim());
    }

    @Test
    public void shouldPrintGeometry() {
        GeometryMaterials geoMaterial = ctx.getBean("geoMaterial", GeometryMaterials.class);
        assertEquals(HistoryMaterials.HISTORY_MATERIALS
                        + "\n"
                        + GeometryMaterials.GEOMETRY_MATERIALS,
                log.getLog().trim());
    }
}
