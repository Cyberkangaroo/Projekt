package controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import utils.DB_Connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class UserController implements Initializable
{
   
   static DB_Connection obj_DB_Connection = new DB_Connection();
   static Connection connection = obj_DB_Connection.get_connection();

   public Label namelab;

   public Label vornamelab;

   public Label emaillab;

   public Label matrikelnummerlab;

   public TextField nametxt;

   public TextField vornametxt;

   public TextField emailtxt;

   public TextField matrikelnummertxt;

   public Button speichernbtn;
   
   public Button abbrechenbtn;
   
   public String benutzerid = "1";
   
   PreparedStatement ps = null;

   public String getname()
   {
      try
      {
         String querry = String.format("SELECT name FROM user WHERE iduser = %s", benutzerid);
         ps = connection.prepareStatement(querry);
         ResultSet rs = ps.executeQuery();
         
         while (rs.next()) {
            return rs.getString("name");
          }
      }catch(Exception e) {
         e.printStackTrace();
      } 
        
      return "abc";
      }

   public String getvorname()
   {
      try
      {
         String querry = String.format("SELECT vorname FROM user WHERE iduser = %s", benutzerid);
         ps = connection.prepareStatement(querry);
         ResultSet rs = ps.executeQuery();
         
         while (rs.next()) {
            return rs.getString("vorname");
          }
      }catch(Exception e) {
         e.printStackTrace();
      } 
      return "def";
   }
   
   public String getemail()
   {
      try
      {
         String querry = String.format("SELECT email FROM user WHERE iduser = %s", benutzerid);
         ps = connection.prepareStatement(querry);
         ResultSet rs = ps.executeQuery();
         
         while (rs.next()) {
            return rs.getString("email");
          }
      }catch(Exception e) {
         e.printStackTrace();
      } 
      return "ghi";
   }
   
   public String getmatrikelnummer()
   {
      try
      {
         String querry = String.format("SELECT matrikelnummer FROM user WHERE iduser = %s", benutzerid);
         ps = connection.prepareStatement(querry);
         ResultSet rs = ps.executeQuery();
         
         while (rs.next()) {
            return rs.getString("matrikelnummer");
          }
      }catch(Exception e) {
         e.printStackTrace();
      } 
      return "jkl";
   }

   public void Speichern()
   {
      String update = String.format("UPDATE user SET name = '%s', vorname = '%s', email = '%s', matrikelnummer = '%s' WHERE iduser = %s", 
            nametxt.getText(), vornametxt.getText(), emailtxt.getText(), matrikelnummertxt.getText(), benutzerid);
      PreparedStatement ps_update = null;
      try {
         ps_update = connection.prepareStatement(update);
         ps_update.executeUpdate(update);
      }catch(Exception e) {
         e.printStackTrace();
      }
      Stage stage = (Stage) speichernbtn.getScene().getWindow();
      stage.close();
   }
   
   public void Abbrechen()
   {
      Stage stage = (Stage) abbrechenbtn.getScene().getWindow();
      stage.close();
   }
   
   @Override
   public void initialize(URL location, ResourceBundle resources)
   {
      
      
      
      nametxt.setText(getname());
      vornametxt.setText(getvorname());
      emailtxt.setText(getemail());
      matrikelnummertxt.setText(getmatrikelnummer());
   }

}
