package beanDefinitions;

import common.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static org.junit.Assert.assertNotNull;

/**
 * Created by mt on 27.03.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanDefinitionConfig.class)
public class BeanDefinitionsTest {
    @Autowired
    @Qualifier("mathBook")
    private Book mathBook;

    @Autowired
    @Qualifier("histBook")
    private Book histBook;

    @Autowired
    @Qualifier("philBook")
    private Book philBook;

    @Test
    public void beansShouldNotBeNull() {
        assertNotNull(mathBook);
        assertNotNull(histBook);
        assertNotNull(philBook);
    }

}
