package edu.vstu.maria.ui.result.model;

import com.sun.istack.internal.NotNull;
import edu.vstu.maria.model.KSimilarMethod;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by maria on 6/10/17.
 */
public class SimilarMethodTableRow {

    private final StringProperty name;

    public SimilarMethodTableRow(@NotNull final KSimilarMethod KSimilarMethod) {
        this.name = new SimpleStringProperty(KSimilarMethod.name);
    }

    public final String getName() {
        return this.name.get();
    }

}
