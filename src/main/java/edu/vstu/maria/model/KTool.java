package edu.vstu.maria.model;

import com.sun.istack.internal.NotNull;

/**
 * Created by maria on 6/10/17.
 */
public class KTool {

    public final String name;
    public final String url;
    public final KCost KCost;

    public KTool(@NotNull final String name,
                 @NotNull final String url,
                 @NotNull final KCost KCost) {
        this.name = name;
        this.url = url;
        this.KCost = KCost;
    }

}
