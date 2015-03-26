package mt.profiling;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNull;

/**
 * Created by mt on 26.03.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BookConfig.class)
/*
    Should run with spring.profiles.active VM option.
    Set something other than "hist" or "phil" for test purposes.
 */
public class VMOptionTest {
    @Autowired(required = false)
    public Book book;

    @Test
    public void testNullBook() {
        assertNull(book);
    }
}
