package ku.cs.lab02javafx;

import ku.cs.services.FXRouter;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "Hello World");
        configRoute();
        FXRouter.goTo("hello");
    }

    public static void configRoute()
    {
        String viewPath = "ku/cs/views/";
        FXRouter.when("hello", viewPath + "hello-view.fxml");
        FXRouter.when("student-profile", viewPath + "student.fxml");
        FXRouter.when("student-list", viewPath + "student-list.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}