package edu.vstu.maria;

import edu.vstu.maria.ui.main.KMain;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by maria on 6/12/17.
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        KMain mainWindow = new KMain(stage);
        mainWindow.show();
    }

}
