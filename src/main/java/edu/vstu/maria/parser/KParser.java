package edu.vstu.maria.parser;


import com.sun.istack.internal.NotNull;
import edu.vstu.maria.parser.table.KTable;

import java.io.IOException;

/**
 * Created by maria on 6/7/17.
 */
public abstract class KParser {

    protected final String fileName;

    public KParser(@NotNull String fileName) {
        this.fileName = new String(fileName);
    }

    public abstract KTable parse() throws IOException;

}
