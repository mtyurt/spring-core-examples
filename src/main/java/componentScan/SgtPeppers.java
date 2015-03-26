package componentScan;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;


/**
 * Created by mt on 25.03.2015.
 */
@Component("sergeant peppers")
public class SgtPeppers implements CompactDisc, BeanNameAware {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    private String name;

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public void setBeanName(String s) {
        name = s;
    }
}
