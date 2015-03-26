package conditional;

import common.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by mt on 26.03.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BookShoppingConfig.class)
/**
 *
 * We will decide the books we need to buy by
 * looking up the registered courses.
 */
public class ConditionalTest {

    @Autowired(required = false)
    Book[] shoppingList;

    @Test
    public void shouldBeEmpty(){
        assertNull(shoppingList);
    }

}
