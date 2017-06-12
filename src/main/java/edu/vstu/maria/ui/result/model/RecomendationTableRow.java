package edu.vstu.maria.ui.result.model;

import com.sun.istack.internal.NotNull;
import edu.vstu.maria.model.KRecomendation;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by nikita on 6/10/17.
 */
public class RecomendationTableRow {

    private final StringProperty variableName;
    private final StringProperty visualAttribute;

    public RecomendationTableRow(@NotNull final KRecomendation KRecomendation) {
        this.variableName = new SimpleStringProperty(KRecomendation.variableName);
        this.visualAttribute = new SimpleStringProperty(KRecomendation.KVisualAttribute.name());
    }

    public final String getVariableName() {
        return this.variableName.get();
    }

    public final String getVisualAttribute() {
        return this.visualAttribute.get();
    }

}
