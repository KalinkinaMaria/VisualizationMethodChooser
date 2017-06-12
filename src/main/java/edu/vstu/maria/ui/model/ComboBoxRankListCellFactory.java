package edu.vstu.maria.ui.model;

import edu.vstu.maria.model.KRank;
import javafx.collections.FXCollections;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.util.Callback;

/**
 * Created by nikita on 6/13/17.
 */
public class ComboBoxRankListCellFactory<T> implements Callback<ListView<T>,ListCell<T>> {

    @Override
    public ListCell<T> call(ListView<T> tListView) {
        return new ComboBoxListCell(FXCollections.observableArrayList(KRank.values()));
    }

}
