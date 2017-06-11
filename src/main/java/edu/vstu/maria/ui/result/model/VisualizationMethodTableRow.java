package edu.vstu.maria.ui.result.model;

import com.sun.istack.internal.NotNull;
import edu.vstu.maria.model.Recomendation;
import edu.vstu.maria.model.SimilarMethod;
import edu.vstu.maria.model.Tool;
import edu.vstu.maria.model.VisualizationMethod;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

/**
 * Created by maria on 6/10/17.
 */
public class VisualizationMethodTableRow {

    private final StringProperty name;
    private final StringProperty measureСloseness;
    private final ArrayList<RecomendationTableRow> recomendations;
    private final ArrayList<ToolTableRow> tools;
    private final ArrayList<SimilarMethodTableRow> similarMethods;

    public VisualizationMethodTableRow(@NotNull final VisualizationMethod visualizationMethod) {
        this.name = new SimpleStringProperty(visualizationMethod.name);
        this.measureСloseness = new SimpleStringProperty(visualizationMethod.measureСloseness.toString());
        this.recomendations = new ArrayList<>();
        for (Recomendation recomendation : visualizationMethod.recomendations) {
            this.recomendations.add(new RecomendationTableRow(recomendation));
        }
        this.tools = new ArrayList<>();
        for (Tool tool : visualizationMethod.tools) {
            this.tools.add(new ToolTableRow(tool));
        }
        this.similarMethods = new ArrayList<>();
        for (SimilarMethod similarMethod : visualizationMethod.similarMethods) {
            this.similarMethods.add(new SimilarMethodTableRow(similarMethod));
        }
    }

    public final String getName() {
        return this.name.get();
    }

    public final String getMeasureСloseness() {
        return this.measureСloseness.get();
    }

    public final ArrayList<RecomendationTableRow> getRecomendations() {
        return this.recomendations;
    }

    public final ArrayList<ToolTableRow> getTools() {
        return this.tools;
    }

    public final ArrayList<SimilarMethodTableRow> getSimilarMethods() {
        return this.similarMethods;
    }

}
