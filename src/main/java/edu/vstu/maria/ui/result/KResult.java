package edu.vstu.maria.ui.result;

import com.sun.istack.internal.NotNull;
import edu.vstu.maria.model.KRecomendation;
import edu.vstu.maria.model.KSimilarMethod;
import edu.vstu.maria.model.KTool;
import edu.vstu.maria.model.KVisualizationMethod;
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

    private final ArrayList<KVisualizationMethod> KVisualizationMethods;

    public KResult() throws IOException {
        URL view = KResult.class.getClassLoader().getResource("KResultView.fxml");
        FXMLLoader loader = new FXMLLoader(view);
        this.currentWindow.setScene(new Scene(loader.load()));
        this.controller = loader.getController();
        this.controller.setListener(this);

        this.KVisualizationMethods = new ArrayList<>();
    }

    public void setKVisualizationMethods(@NotNull final ArrayList<KVisualizationMethod> KVisualizationMethods) {
        this.KVisualizationMethods.clear();
        this.KVisualizationMethods.addAll(KVisualizationMethods);
        ArrayList<VisualizationMethodTableRow> visualizationMethodTableRows = new ArrayList<>();
        for (KVisualizationMethod KVisualizationMethod : KVisualizationMethods) {
            visualizationMethodTableRows.add(new VisualizationMethodTableRow(KVisualizationMethod));
        }
        this.controller.setVisualizationMethods(visualizationMethodTableRows);
    }

    public void show(@NotNull final Stage ownerWindow) {
        this.currentWindow.initOwner(ownerWindow);
        this.currentWindow.showAndWait();
    }

    @Override
    public void onSelectVisualizationMethod(String visualizationMethodName) {
        for (KVisualizationMethod KVisualizationMethod : this.KVisualizationMethods) {
            if (KVisualizationMethod.name.compareTo(visualizationMethodName) == 0) {
                ArrayList<RecomendationTableRow> recomendationTableRows = new ArrayList<>();
                for (KRecomendation KRecomendation : KVisualizationMethod.KRecomendations) {
                    recomendationTableRows.add(new RecomendationTableRow(KRecomendation));
                }
                this.controller.setRecomendations(recomendationTableRows);

                ArrayList<ToolTableRow> toolTableRows = new ArrayList<>();
                for (KTool KTool : KVisualizationMethod.KTools) {
                    toolTableRows.add(new ToolTableRow(KTool));
                }
                this.controller.setTools(toolTableRows);

                ArrayList<SimilarMethodTableRow> similarMethodTableRows = new ArrayList<>();
                for (KSimilarMethod KSimilarMethod : KVisualizationMethod.KSimilarMethods) {
                    similarMethodTableRows.add(new SimilarMethodTableRow(KSimilarMethod));
                }
                this.controller.setSimilarMethods(similarMethodTableRows);

                break;
            }
        }
    }

}
