package componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mt on 26.03.2015.
 */
@Component
public class CdPlayer implements MediaPlayer{

    @Autowired
    private CompactDisc cd;

    @Override
    public void play() {
        cd.play();
    }
}
