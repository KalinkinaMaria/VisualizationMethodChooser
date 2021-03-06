package edu.vstu.maria.ui;

import com.sun.istack.internal.NotNull;
import javafx.stage.Stage;

/**
 * Created by maria on 6/11/17.
 */
public abstract class KWindow {

    protected final Stage currentWindow;

    public KWindow() {
        this.currentWindow = new Stage();
    }

    public KWindow(@NotNull final Stage stage) {
        this.currentWindow = stage;
    }

    public final String getTitle() {
        return this.currentWindow.getTitle();
    }

    public void setTitle(@NotNull final String value) {
        this.setTitle(value);
    }

}
