package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainViewController {
    public Button btnStudent;
    public ButtonBar toolbar;
    public Button btnCourse;
    public Button btnDashboard;
    public Button btnEdit;
    public Button btnLogout;
    public Button btnExit;

    public static AnchorPane temporaryPane;



    public void initialize(){


    }
    public void goToStudentPage(ActionEvent event)  {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/Course.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void goToCoursePage(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/Course.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void goToDashboard(ActionEvent actionEvent) {
    }

    public void goToEditPage(ActionEvent actionEvent) {
<<<<<<< HEAD

=======
       try {
          FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/User.fxml"));
          Parent root1 = fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new Scene(root1));
          stage.show();
       } catch(Exception e) {
          e.printStackTrace();
       }
>>>>>>> a449937... BEnutzerverwaltung eingefügt

    }

    public void goToLogout(ActionEvent actionEvent) {
    }

    public void exit(ActionEvent actionEvent) {
    }


    public void switchPane (){



    }
}
