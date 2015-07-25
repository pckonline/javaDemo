package IOApplication;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * Created by online on 15-1-25.
 */
public class SuffixFilter implements FilenameFilter {
    private String s=null;
    public SuffixFilter(String s) {
        this.s = s;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(s);
    }
}
