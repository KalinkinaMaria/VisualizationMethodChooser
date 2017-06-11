package edu.vstu.maria.ui.result.model;

import com.sun.istack.internal.NotNull;
import edu.vstu.maria.model.Tool;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by maria on 6/10/17.
 */
public class ToolTableRow {

    private final StringProperty name;
    private final StringProperty url;
    private final StringProperty price;

    public ToolTableRow(@NotNull final Tool tool) {
        this.name = new SimpleStringProperty(tool.name);
        this.url = new SimpleStringProperty(tool.url);
        this.price = new SimpleStringProperty(tool.cost.name());
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
