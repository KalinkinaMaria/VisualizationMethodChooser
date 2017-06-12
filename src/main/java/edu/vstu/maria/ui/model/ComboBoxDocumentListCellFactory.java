package edu.vstu.maria.ui.model;

import edu.vstu.maria.model.KDocument;
import javafx.collections.FXCollections;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.util.Callback;
import javafx.util.StringConverter;

import java.util.ArrayList;

/**
 * Created by nikita on 6/13/17.
 */
public class ComboBoxDocumentListCellFactory<T> implements Callback<ListView<T>,ListCell<T>> {

    @Override
    public ListCell<T> call(ListView<T> tListView) {
        return new ComboBoxListCell(FXCollections.observableArrayList(KDocument.values()));
    }

}
