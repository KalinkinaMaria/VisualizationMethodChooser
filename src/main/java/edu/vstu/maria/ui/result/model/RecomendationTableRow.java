package edu.vstu.maria.ui.result.model;

import com.sun.istack.internal.NotNull;
import edu.vstu.maria.model.Recomendation;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by nikita on 6/10/17.
 */
public class RecomendationTableRow {

    private final StringProperty variableName;
    private final StringProperty visualAttribute;

    public RecomendationTableRow(@NotNull final Recomendation recomendation) {
        this.variableName = new SimpleStringProperty(recomendation.variableName);
        this.visualAttribute = new SimpleStringProperty(recomendation.visualAttribute.name());
    }

    public final String getVariableName() {
        return this.variableName.get();
    }

    public final String getVisualAttribute() {
        return this.visualAttribute.get();
    }

}
