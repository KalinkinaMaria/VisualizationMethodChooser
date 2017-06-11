package edu.vstu.maria.model;

import com.sun.istack.internal.NotNull;

/**
 * Created by maria on 6/10/17.
 */
public class Tool {

    public final String name;
    public final String url;
    public final Cost cost;

    public Tool(@NotNull final String name,
                @NotNull final String url,
                @NotNull final Cost cost) {
        this.name = name;
        this.url = url;
        this.cost = cost;
    }

}
