package edu.vstu.maria.ui.main;

import com.sun.istack.internal.NotNull;
import edu.vstu.maria.ui.KWindow;
import edu.vstu.maria.ui.case_editor.KCaseEditor;
import edu.vstu.maria.ui.purpose_editor.KPurposeEditor;
import edu.vstu.maria.ui.result.KResult;
import edu.vstu.maria.ui.visualization_method_editor.KVisualizationMethodEditor;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by maria on 6/12/17.
 */
public class KMain extends KWindow implements KMainControllerListener{

    private final KMainController controller;

    public KMain(@NotNull final Stage stage) throws IOException {
        super(stage);

        FXMLLoader loader = new FXMLLoader(KMain.class.getClassLoader().getResource("KMainView.fxml"));
        this.currentWindow.setScene(new Scene(loader.load()));
        this.controller = loader.getController();
        this.controller.setListener(this);
    }

    public void show() {
        this.currentWindow.show();

    }

    @Override
    public void onClickNewButton() {

    }

    @Override
    public void onClickOpenButton() {

    }

    @Override
    public void onClickExitButton() {

    }

    @Override
    public void onClickCaseButton() {
        try {
            KCaseEditor caseEditorWindow = new KCaseEditor();
            caseEditorWindow.show(this.currentWindow);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClickVisualizationMethodButton() {
        try {
            KVisualizationMethodEditor methodEditorWindow = new KVisualizationMethodEditor();
            methodEditorWindow.show(this.currentWindow);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClickPurposeButton() {
        try {
            KPurposeEditor purposeEditorWindow = new KPurposeEditor();
            purposeEditorWindow.show(this.currentWindow);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClickAboutButton() {

    }

    @Override
    public void onClickFindMethodButton() {
        try {
            KResult resultWindow = new KResult();
            resultWindow.show(this.currentWindow);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
