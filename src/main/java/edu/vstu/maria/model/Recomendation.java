package edu.vstu.maria.model;

import com.sun.istack.internal.NotNull;

/**
 * Created by maria on 6/10/17.
 */
public class Recomendation {

    public final String variableName;
    public final VisualAttribute visualAttribute;

    public Recomendation(@NotNull final String variableName,
                         @NotNull final VisualAttribute visualAttribute) {
        this.variableName = variableName;
        this.visualAttribute = visualAttribute;
    }

}
