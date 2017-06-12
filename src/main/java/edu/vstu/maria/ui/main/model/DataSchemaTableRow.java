package edu.vstu.maria.ui.main.model;

import edu.vstu.maria.model.KDataType;
import edu.vstu.maria.model.KRole;
import edu.vstu.maria.model.KScale;
import javafx.beans.property.*;

/**
 * Created by maria on 6/12/17.
 */
public class DataSchemaTableRow {

    private BooleanProperty visualization;
    private StringProperty name;
    private ObjectProperty<KDataType> dataType;
    private ObjectProperty<KScale> scale;
    private ObjectProperty<KRole> role;
    private DoubleProperty capacity;

    public DataSchemaTableRow() {
        this.visualization = new SimpleBooleanProperty(false);
        this.name = new SimpleStringProperty("");
        this.dataType = new SimpleObjectProperty<>(KDataType.BOOLEAN);
        this.scale = new SimpleObjectProperty<>(KScale.ABSOLUTE);
        this.role = new SimpleObjectProperty<>(KRole.AMOUNT);
        this.capacity = new SimpleDoubleProperty(0.0);
    }

    public DataSchemaTableRow(Boolean visualization, String name, KDataType dataType,
                              KScale scale, KRole role, Double capacity) {
        this.visualization = new SimpleBooleanProperty(visualization);
        this.name = new SimpleStringProperty(name);
        this.dataType = new SimpleObjectProperty<>(dataType);
        this.scale = new SimpleObjectProperty<>(scale);
        this.role = new SimpleObjectProperty<>(role);
        this.capacity = new SimpleDoubleProperty(capacity);
    }

    public Boolean getVisualization() {
        return this.visualization.get();
    }

    public void setVisualization(Boolean visualization) {
        this.visualization.set(visualization);
    }

    public String getName() {
        return this.name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public KDataType getDataType() {
        return this.dataType.get();
    }

    public void setDataType(KDataType dataType) {
        this.dataType.set(dataType);
    }

    public KScale getScale() {
        return this.scale.get();
    }

    public void setScale(KScale scale) {
        this.scale.set(scale);
    }

    public KRole getRole() {
        return this.role.get();
    }

    public void setRole(KRole role) {
        this.role.set(role);
    }

    public Double getCapacity() {
        return this.capacity.get();
    }

    public void setCapacity(Double capacity) {
        this.capacity.set(capacity);
    }

}
