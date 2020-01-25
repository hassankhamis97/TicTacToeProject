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
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hassan
 */
public class Main extends Application {
        Connection con;
        ResultSet rs;
        PreparedStatement stmt;
        static Stage myStage;
        @Override
        public void start(Stage stage) throws Exception {
                /*
                ///// Check for The DB Jar File Included
                ClassLoader cl = ClassLoader.getSystemClassLoader();
                URL[] urls = ((URLClassLoader) cl).getURLs();
                String urlStr = "";
                for (int i=0; i < urls.length; i++) {
                   urlStr += urls[i].getFile() + "\n";
                }
                System.out.println("Classpath:\n" + urlStr);
                //// end of Check for The DB Jar File Included
                Class.forName("com.mysql.jdbc.Driver"); // stablish the connection
                con = DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7320143", "sql7320143", "LS4CgdqGST");
                
                
                //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql7320143", "root", "root"); // local
                
                stmt = con.prepareStatement("SELECT ID,Name,Email,Password FROM Player");
                
                rs = stmt.executeQuery();
                Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                
                */
                //Login log = ;
                myStage = stage;
                //Scene scene = new Login().showPage();
                //showNewScene(scene);
                new Login();
        
        }
        public static void showNewScene(Scene scene) 
        {
                myStage.setScene(scene);
                myStage.show();
        }
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                launch(args);
        }
        
}
