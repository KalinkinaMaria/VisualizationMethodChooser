package edu.vstu.maria.ui.result;

import edu.vstu.maria.ui.result.model.RecomendationTableRow;
import edu.vstu.maria.ui.result.model.SimilarMethodTableRow;
import edu.vstu.maria.ui.result.model.ToolTableRow;
import edu.vstu.maria.ui.result.model.VisualizationMethodTableRow;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.util.ArrayList;

/**
 * Created by maria on 6/10/17.
 */
public class KResultController implements EventHandler {

    @FXML private TableView<VisualizationMethodTableRow> visualizationMethodsTableView;
    @FXML private TableView<RecomendationTableRow> recomendationsTableView;
    @FXML private TableView<ToolTableRow> toolsTableView;
    @FXML private TableView<SimilarMethodTableRow> similarMethodsTableView;

    private KResultControllerListener listener;

    public KResultController() {
        this.listener = null;
    }

    public void setListener(KResultControllerListener listener) {
        this.listener = listener;
    }

    public void setVisualizationMethods(ArrayList<VisualizationMethodTableRow> data) {
        this.visualizationMethodsTableView.setItems(FXCollections.observableArrayList(data));
    }

    public void setRecomendations(ArrayList<RecomendationTableRow> data) {
        this.recomendationsTableView.setItems(FXCollections.observableArrayList(data));
    }

    public void setTools(ArrayList<ToolTableRow> data) {
        this.toolsTableView.setItems(FXCollections.observableArrayList(data));
    }

    public void setSimilarMethods(ArrayList<SimilarMethodTableRow> data) {
        this.similarMethodsTableView.setItems(FXCollections.observableArrayList(data));
    }

    @Override
    public void handle(Event event) {
        if (this.listener == null) {
            return;
        }

        if (this.visualizationMethodsTableView.getSelectionModel().getSelectedItem() == null) {
            return;
        }

        String selectedRowName = this.visualizationMethodsTableView.getSelectionModel().getSelectedItem().getName();

        this.listener.onSelectVisualizationMethod(selectedRowName);
    }

}
