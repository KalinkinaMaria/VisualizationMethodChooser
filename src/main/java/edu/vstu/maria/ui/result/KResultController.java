package edu.vstu.maria.ui.result;

import edu.vstu.maria.ui.result.model.RecomendationTableRow;
import edu.vstu.maria.ui.result.model.SimilarMethodTableRow;
import edu.vstu.maria.ui.result.model.ToolTableRow;
import edu.vstu.maria.ui.result.model.VisualizationMethodTableRow;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.util.ArrayList;

/**
 * Created by maria on 6/10/17.
 */
public class KResultController implements ChangeListener {

    @FXML private TableView<VisualizationMethodTableRow> visualizationMethodsTable;
    @FXML private TableView<RecomendationTableRow> recomendationsTable;
    @FXML private TableView<ToolTableRow> toolsTable;
    @FXML private TableView<SimilarMethodTableRow> similarMethodsTable;

    public KResultController() {
        this.visualizationMethodsTable = new TableView<>();
        this.visualizationMethodsTable.getSelectionModel().selectedIndexProperty().addListener(this);
        this.recomendationsTable = new TableView<>();
        this.toolsTable = new TableView<>();
        this.similarMethodsTable = new TableView<>();
    }

    public void updateData(ArrayList<VisualizationMethodTableRow> data) {
        this.visualizationMethodsTable.setItems(FXCollections.observableArrayList(data));
    }

    @Override
    public void changed(ObservableValue observableValue, Object o, Object t1) {
        VisualizationMethodTableRow selectedRow = this.visualizationMethodsTable.getSelectionModel().getSelectedItem();
        this.recomendationsTable.setItems(FXCollections.observableArrayList(selectedRow.getRecomendations()));
        this.toolsTable.setItems(FXCollections.observableArrayList(selectedRow.getTools()));
        this.similarMethodsTable.setItems(FXCollections.observableArrayList(selectedRow.getSimilarMethods()));
    }
}
