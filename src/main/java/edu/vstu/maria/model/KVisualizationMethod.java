package edu.vstu.maria.model;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;

/**
 * Created by maria on 6/10/17.
 */
public class KVisualizationMethod {

    public final String name;
    public final Double measureСloseness;
    public final ArrayList<KRecomendation> KRecomendations;
    public final ArrayList<KTool> KTools;
    public final ArrayList<KSimilarMethod> KSimilarMethods;

    public KVisualizationMethod(@NotNull final String name,
                                @NotNull final Double measureСloseness,
                                @NotNull final ArrayList<KRecomendation> KRecomendations,
                                @NotNull final ArrayList<KTool> KTools,
                                @NotNull final ArrayList<KSimilarMethod> KSimilarMethods) {
        this.name = name;
        this.measureСloseness = measureСloseness;
        this.KRecomendations = KRecomendations;
        this.KTools = KTools;
        this.KSimilarMethods = KSimilarMethods;
    }

}
