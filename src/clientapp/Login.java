/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author hassan
 */
public class Login {
        Connection con;
        ResultSet rs;
        PreparedStatement stmt;
        FlowPane flow;
        Button login_btn;
        TextField email_txt;
        TextField pass_txt;
        Scene loginScene;
        public Login() {
                flow = new FlowPane();
                flow.setOrientation(Orientation.VERTICAL);
                login_btn = new Button("Login");
                email_txt = new TextField();
                pass_txt = new PasswordField();
                flow.getChildren().addAll(email_txt,pass_txt,login_btn);
                loginScene = new Scene(flow);
                login_btn.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent t) {
                                boolean emailValid = true;
                                boolean passValid = true;
                                if(!email_txt.getText().isEmpty() && !pass_txt.getText().isEmpty())
                                {
                                        if(!Pattern.matches("^[a-z0-9]+(_{1}|.{1})+[a-z0-9]{1,}@{1}[a-z]{2,}[.][a-z]{2,5}$", email_txt.getText()))
                                        {
                                                emailValid = false;
                                                System.out.println("Please Enter valid email ex: java@java.com");
                                        }
                                        if(!Pattern.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*_-])[a-zA-Z0-9!@#$%^&*_-]{6,12}$", pass_txt.getText()))
                                        {
                                                passValid = false;
                                                if(pass_txt.getText().length() < 6 && pass_txt.getText().length() > 20)
                                                {
                                                        System.out.println("password length must be between 6-20 char");
                                                }
                                                else
                                                {
                                                        System.out.println("password must contains at least one capital and small letters and special characters");
                                                }
                                        }
                                        if(emailValid && passValid)
                                        {
                                                ///// Check for The DB Jar File Included
                                                ClassLoader cl = ClassLoader.getSystemClassLoader();
                                                URL[] urls = ((URLClassLoader) cl).getURLs();
                                                String urlStr = "";
                                                for (int i=0; i < urls.length; i++) {
                                                   urlStr += urls[i].getFile() + "\n";
                                                }
                                                System.out.println("Classpath:\n" + urlStr);
                                                //// end of Check for The DB Jar File Included

                                                try {

                                                        Class.forName("com.mysql.jdbc.Driver"); // stablish the connection
                                                } catch (ClassNotFoundException ex) {
                                                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                                try {
                                                        con = DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7320143", "sql7320143", "LS4CgdqGST");
                                                } catch (SQLException ex) {
                                                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                                try {
                                                        //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql7320143", "root", "root"); // local
                                                        stmt = con.prepareStatement("SELECT ID FROM Player where Email = ? and Password = ?");
                                                        stmt.setString(1, email_txt.getText());
                                                        stmt.setString(2, pass_txt.getText());
                                                } catch (SQLException ex) {
                                                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                                                }

                                                try {
                                                        rs = stmt.executeQuery();
                                                } catch (SQLException ex) {
                                                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                                try {
                                                        if(rs.first() == true)
                                                        {
                                                                SharedData.playerID = rs.getInt("ID");
                                                                
                                                                new BeforeConnectTheGame();
                                                        }
                                                        else
                                                        {
                                                                System.out.println("email or password donot match any thing in database");
                                                        }
                                                } catch (SQLException ex) {
                                                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                                                }  
                                        }
                                }
                                else{
                                        if(email_txt.getText().isEmpty())
                                        {
                                                System.out.println("email is required");
                                        }
                                        if(pass_txt.getText().isEmpty())
                                        {
                                                System.out.println("password is required");
                                        }
                                }
                        }
                });
                Main.showNewScene(loginScene);
                //showPage();
                /*stage.setScene(scene);
                stage.show();*/
        }

        /**
         * @param args the command line arguments
         */
        /*public static void main(String[] args) {
                launch(args);
        }*/

        /*public Scene showPage() {
                return loginScene;
        }*/

        
        
}
