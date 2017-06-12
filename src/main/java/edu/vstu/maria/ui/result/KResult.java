package edu.vstu.maria.ui.result;

import com.sun.istack.internal.NotNull;
import edu.vstu.maria.model.Recomendation;
import edu.vstu.maria.model.SimilarMethod;
import edu.vstu.maria.model.Tool;
import edu.vstu.maria.model.VisualizationMethod;
import edu.vstu.maria.ui.KWindow;
import edu.vstu.maria.ui.result.model.RecomendationTableRow;
import edu.vstu.maria.ui.result.model.SimilarMethodTableRow;
import edu.vstu.maria.ui.result.model.ToolTableRow;
import edu.vstu.maria.ui.result.model.VisualizationMethodTableRow;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by maria on 6/10/17.
 */
public class KResult extends KWindow implements KResultControllerListener {

    private final KResultController controller;

    private final ArrayList<VisualizationMethod> visualizationMethods;

    public KResult() throws IOException {
        URL view = KResult.class.getClassLoader().getResource("KResultView.fxml");
        FXMLLoader loader = new FXMLLoader(view);
        this.currentWindow.setScene(new Scene(loader.load()));
        this.controller = loader.getController();
        this.controller.setListener(this);

        this.visualizationMethods = new ArrayList<>();
    }

    public void setVisualizationMethods(@NotNull final ArrayList<VisualizationMethod> visualizationMethods) {
        this.visualizationMethods.clear();
        this.visualizationMethods.addAll(visualizationMethods);
        ArrayList<VisualizationMethodTableRow> visualizationMethodTableRows = new ArrayList<>();
        for (VisualizationMethod visualizationMethod : visualizationMethods) {
            visualizationMethodTableRows.add(new VisualizationMethodTableRow(visualizationMethod));
        }
        this.controller.setVisualizationMethods(visualizationMethodTableRows);
    }

    public void show(@NotNull final Stage ownerWindow) {
        this.currentWindow.initOwner(ownerWindow);
        this.currentWindow.showAndWait();
    }

    @Override
    public void onSelectVisualizationMethod(String visualizationMethodName) {
        for (VisualizationMethod visualizationMethod : this.visualizationMethods) {
            if (visualizationMethod.name.compareTo(visualizationMethodName) == 0) {
                ArrayList<RecomendationTableRow> recomendationTableRows = new ArrayList<>();
                for (Recomendation recomendation : visualizationMethod.recomendations) {
                    recomendationTableRows.add(new RecomendationTableRow(recomendation));
                }
                this.controller.setRecomendations(recomendationTableRows);

                ArrayList<ToolTableRow> toolTableRows = new ArrayList<>();
                for (Tool tool : visualizationMethod.tools) {
                    toolTableRows.add(new ToolTableRow(tool));
                }
                this.controller.setTools(toolTableRows);

                ArrayList<SimilarMethodTableRow> similarMethodTableRows = new ArrayList<>();
                for (SimilarMethod similarMethod : visualizationMethod.similarMethods) {
                    similarMethodTableRows.add(new SimilarMethodTableRow(similarMethod));
                }
                this.controller.setSimilarMethods(similarMethodTableRows);

                break;
            }
        }
    }

}
