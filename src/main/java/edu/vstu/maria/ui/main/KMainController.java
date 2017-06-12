package edu.vstu.maria.ui.main;

import edu.vstu.maria.ui.main.model.DataSchemaTableRow;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Created by maria on 6/12/17.
 */
public class KMainController implements EventHandler {

    @FXML private MenuItem newMenuItem;
    @FXML private MenuItem openMenuItem;
    @FXML private MenuItem exitMenuItem;
    @FXML private MenuItem caseMenuItem;
    @FXML private MenuItem visualizationMethodMenuItem;
    @FXML private MenuItem purposeMenuItem;
    @FXML private MenuItem aboutMenuItem;

    @FXML private TableView<DataSchemaTableRow> dataSchemaTableView;

    @FXML private Button addRowButton;
    @FXML private Button removeRowButton;

    @FXML private ComboBox rankComboBox;
    @FXML private ComboBox documentComboBox;

    @FXML private ComboBox goalComboBox;
    @FXML private Spinner elementsCountSpinner;
    @FXML private Button findMethodButton;

    private KMainControllerListener listener;

    public KMainController() {
        this.listener = null;
    }

    public void setListener(KMainControllerListener listener) {
        this.listener = listener;
    }

    @Override
    public void handle(Event event) {
        if (this.listener == null) {
            return;
        }

        String eventMenuItemId = "";

        if (event.getSource().getClass() == MenuItem.class) {
            eventMenuItemId = ((MenuItem) event.getSource()).getId();
        } else if (event.getSource().getClass() == Button.class) {
            eventMenuItemId = ((Button) event.getSource()).getId();
        } else {
            return;
        }

        if (this.newMenuItem.getId().compareTo(eventMenuItemId) == 0) {
            this.listener.onClickNewButton();
        } else if (this.openMenuItem.getId().compareTo(eventMenuItemId) == 0) {
            this.listener.onClickOpenButton();
        } else if (this.exitMenuItem.getId().compareTo(eventMenuItemId) == 0) {
            this.listener.onClickExitButton();
        } else if (this.caseMenuItem.getId().compareTo(eventMenuItemId) == 0) {
            this.listener.onClickCaseButton();
        } else if (this.visualizationMethodMenuItem.getId().compareTo(eventMenuItemId) == 0) {
            this.listener.onClickVisualizationMethodButton();
        } else if (this.purposeMenuItem.getId().compareTo(eventMenuItemId) == 0) {
            this.listener.onClickPurposeButton();
        } else if (this.aboutMenuItem.getId().compareTo(eventMenuItemId) == 0) {
            this.listener.onClickAboutButton();
        } else if (this.addRowButton.getId().compareTo(eventMenuItemId) == 0) {
            this.dataSchemaTableView.getItems().add(new DataSchemaTableRow());
        } else if (this.removeRowButton.getId().compareTo(eventMenuItemId) == 0) {
            if (this.dataSchemaTableView.getSelectionModel().getSelectedItem() != null) return;

            this.dataSchemaTableView.getItems().remove(this.dataSchemaTableView.getSelectionModel().getSelectedItem());
        } else if (this.findMethodButton.getId().compareTo(eventMenuItemId) == 0) {
            this.listener.onClickFindMethodButton();
        }
    }

}
