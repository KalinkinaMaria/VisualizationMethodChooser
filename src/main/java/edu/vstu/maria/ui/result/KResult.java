package edu.vstu.maria.ui.result;

import com.sun.istack.internal.NotNull;
import edu.vstu.maria.model.VisualizationMethod;
import edu.vstu.maria.ui.KWindow;
import edu.vstu.maria.ui.result.model.VisualizationMethodTableRow;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by maria on 6/10/17.
 */
public class KResult extends KWindow {

    private final ArrayList<VisualizationMethod> visualizationMethods;
    private final KResultController controller;

    public KResult() throws IOException {
        this.visualizationMethods = new ArrayList<>();

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("KResultView.fxml"));
        this.currentWindow.setScene(new Scene(loader.load()));
        this.controller = loader.getController();
    }

    public final ArrayList<VisualizationMethod> getVisualizationMethods() {
        return this.visualizationMethods;
    }

    public void setVisualizationMethods(@NotNull final ArrayList<VisualizationMethod> value) {
        this.visualizationMethods.clear();
        this.visualizationMethods.addAll(value);
        ArrayList<VisualizationMethodTableRow> data = new ArrayList<>();
        for (VisualizationMethod item : value) {
            data.add(new VisualizationMethodTableRow(item));
        }
        this.controller.updateData(data);
    }

}
