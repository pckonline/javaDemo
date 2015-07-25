package IO_Stream.ByteSteam.File;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by online on 15-1-24.
 */
public class FilterByHidden implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.isHidden();
    }
}
