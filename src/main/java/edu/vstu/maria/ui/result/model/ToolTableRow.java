package edu.vstu.maria.ui.result.model;

import com.sun.istack.internal.NotNull;
import edu.vstu.maria.model.KTool;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by maria on 6/10/17.
 */
public class ToolTableRow {

    private final StringProperty name;
    private final StringProperty url;
    private final StringProperty price;

    public ToolTableRow(@NotNull final KTool KTool) {
        this.name = new SimpleStringProperty(KTool.name);
        this.url = new SimpleStringProperty(KTool.url);
        this.price = new SimpleStringProperty(KTool.KCost.name());
    }

    public final String getName() {
        return this.name.get();
    }

    public final String getUrl() {
        return this.name.get();
    }

    public final String getPrice() {
        return this.price.get();
    }

}
