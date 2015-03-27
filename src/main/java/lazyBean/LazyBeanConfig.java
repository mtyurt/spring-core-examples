package lazyBean;

import common.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * Created by mt on 27.03.2015.
 */
@Configuration
public class LazyBeanConfig {
    @Bean(name="geoMaterial")
    @Lazy
    public GeometryMaterials geometryMaterials() {
        return new GeometryMaterials();
    }

    @Bean
    public HistoryMaterials historyMaterials() {
        return new HistoryMaterials();
    }

}
