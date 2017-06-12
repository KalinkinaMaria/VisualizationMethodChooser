package edu.vstu.maria.ui.model;

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;
import javafx.util.StringConverter;

/**
 * Created by nikita on 6/12/17.
 */
public class TextFieldStringTableCellFactory<T, S> implements Callback<TableColumn<T, S>, TableCell<T, S>> {

    @Override
    public TableCell<T, S> call(TableColumn<T, S> tsTableColumn) {
        return new TextFieldTableCell<>(new StringConverter<S>() {
            @Override
            public String toString(S s) {
                return (String) s;
            }

            @Override
            public S fromString(String s) {
                return (S) s;
            }
        });
    }

}
