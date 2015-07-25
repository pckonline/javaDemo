package IO_Stream.ByteSteam.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by online on 15-1-24.
 */
public class FiterByJava implements FilenameFilter {
    private String suffx;

    public FiterByJava(String suffx) {
        this.suffx = suffx;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(suffx);
    }
}
