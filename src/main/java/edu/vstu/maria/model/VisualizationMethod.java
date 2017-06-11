package edu.vstu.maria.model;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;

/**
 * Created by maria on 6/10/17.
 */
public class VisualizationMethod {

    public final String name;
    public final Double measureСloseness;
    public final ArrayList<Recomendation> recomendations;
    public final ArrayList<Tool> tools;
    public final ArrayList<SimilarMethod> similarMethods;

    public VisualizationMethod(@NotNull final String name,
                               @NotNull final Double measureСloseness,
                               @NotNull final ArrayList<Recomendation> recomendations,
                               @NotNull final ArrayList<Tool> tools,
                               @NotNull final ArrayList<SimilarMethod> similarMethods) {
        this.name = name;
        this.measureСloseness = measureСloseness;
        this.recomendations = recomendations;
        this.tools = tools;
        this.similarMethods = similarMethods;
    }

}
