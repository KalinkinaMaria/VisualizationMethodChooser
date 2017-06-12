package edu.vstu.maria.model;

import com.sun.istack.internal.NotNull;

/**
 * Created by maria on 6/10/17.
 */
public class KRecomendation {

    public final String variableName;
    public final KVisualAttribute KVisualAttribute;

    public KRecomendation(@NotNull final String variableName,
                          @NotNull final KVisualAttribute KVisualAttribute) {
        this.variableName = variableName;
        this.KVisualAttribute = KVisualAttribute;
    }

}
