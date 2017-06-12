package edu.vstu.maria.ui.result.model;

import com.sun.istack.internal.NotNull;
import edu.vstu.maria.model.VisualizationMethod;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by maria on 6/10/17.
 */
public class VisualizationMethodTableRow {

    private final StringProperty name;
    private final StringProperty measureСloseness;

    public VisualizationMethodTableRow(@NotNull final VisualizationMethod visualizationMethod) {
        this.name = new SimpleStringProperty(visualizationMethod.name);
        this.measureСloseness = new SimpleStringProperty(visualizationMethod.measureСloseness.toString());
    }

    public final String getName() {
        return this.name.get();
    }

    public final String getMeasureСloseness() {
        return this.measureСloseness.get();
    }

}
