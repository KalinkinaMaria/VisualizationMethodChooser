package edu.vstu.maria.ui.model;

import edu.vstu.maria.model.KDataType;
import javafx.collections.FXCollections;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.util.Callback;

/**
 * Created by maria on 6/12/17.
 */
public class ComboBoxDataTypeTableCellFactory<S, T> implements Callback<TableColumn<S, T>, TableCell<S, T>> {

    @Override
    public TableCell<S, T> call(TableColumn<S, T> stTableColumn) {
        return new ComboBoxTableCell(FXCollections.observableArrayList(KDataType.values()));
    }

}
