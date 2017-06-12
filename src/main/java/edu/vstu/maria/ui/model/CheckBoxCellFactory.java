package edu.vstu.maria.ui.model;

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.util.Callback;

/**
 * Created by maria on 6/12/17.
 */
public class CheckBoxCellFactory<S, T> implements Callback<TableColumn<S, T>, TableCell<S, T>> {

    @Override
    public TableCell<S, T> call(TableColumn<S, T> stTableColumn) {
        return new CheckBoxTableCell<>();
    }
}
