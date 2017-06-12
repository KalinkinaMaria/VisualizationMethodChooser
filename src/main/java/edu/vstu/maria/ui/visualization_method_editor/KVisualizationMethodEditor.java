package edu.vstu.maria.ui.visualization_method_editor;

import edu.vstu.maria.ui.KWindow;
import edu.vstu.maria.ui.result.KResult;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * Created by nikita on 6/12/17.
 */
public class KVisualizationMethodEditor extends KWindow implements KVisualizationMethodEditorControllerListener {

    private KVisualizationMethodEditorController controller;

    public KVisualizationMethodEditor() throws IOException {
        super();
        URL view = KResult.class.getClassLoader().getResource("KVisualizationMethodEditorView.fxml");
        FXMLLoader loader = new FXMLLoader(view);
        this.currentWindow.setScene(new Scene(loader.load()));
        this.controller = loader.getController();
        this.controller.setListener(this);
    }

    public void show(Stage ownerWindow) {
        this.currentWindow.initOwner(ownerWindow);
        this.currentWindow.showAndWait();
    }

}
