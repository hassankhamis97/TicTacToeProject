/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

//import com.mysql.fabric.xmlrpc.Client;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

/**
 *
 * @author hassan
 */
public class GameStart
{
        Scene gameStartScene;
        PrintStream ps;
        DataInputStream dis;
        //Socket client;
        
        
        public GameStart()
        {
                
        }
        public GameStart(Socket player2SocketID)
        {
                //gameStartScene = new Scene(new BorderPane());
                GameBase gb = new GameBase();
                gameStartScene = gb.getScene();
                try {
                        dis = new DataInputStream(player2SocketID.getInputStream());
                        ps = new PrintStream(player2SocketID.getOutputStream());
                } catch (IOException ex) {
                        Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                }
                /*gb.button.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent t) {
                                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
                });*/
                Thread th = new Thread(new Runnable() {
                        @Override
                        public void run() {
                                while(true)
                                {
                                        //String s = "";
                                        try {
                                                String data = dis.readLine();
                                                String[] msg = data.split("-");
                                                switch(msg[0])
                                                {
                                                        case "1":
                                                                gb.button.setText(msg[1]);
                                                                gb.button.setDisable(true);
                                                                break;
                                                        case "2":
                                                                gb.button0.setText(msg[1]);
                                                                gb.button0.setDisable(true);
                                                                break;
                                                        case "3":
                                                                gb.button1.setText(msg[1]);
                                                                gb.button1.setDisable(true);
                                                                break;
                                                        case "4":
                                                                gb.button2.setText(msg[1]);
                                                                gb.button2.setDisable(true);
                                                                break;
                                                        case "5":
                                                                gb.button3.setText(msg[1]);
                                                                gb.button3.setDisable(true);
                                                                break;
                                                        case "6":
                                                                gb.button4.setText(msg[1]);
                                                                gb.button4.setDisable(true);
                                                                break;
                                                        case "7":
                                                                gb.button5.setText(msg[1]);
                                                                gb.button5.setDisable(true);
                                                                break;
                                                        case "8":
                                                                gb.button6.setText(msg[1]);
                                                                gb.button6.setDisable(true);
                                                                break;
                                                        case "9":
                                                                gb.button7.setText(msg[1]);
                                                                gb.button7.setDisable(true);
                                                                break;
                                                }

                                        } catch (IOException ex) {
                                                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                }
                        }
                        /*public void stop() 
                        {
                                
                        }*/
                        
                });
                th.start();
                gb.button.setOnAction(t-> {
                       ps.println("1-"+SharedData.playerID);
                       //gb.button.setText("X");
                });
                gb.button0.setOnAction(t-> {
                        ps.println("2-"+SharedData.playerID);
                       //gb.button0.setText("1");
                });
                gb.button1.setOnAction(t-> {
                        ps.println("3-"+SharedData.playerID);
                });
                gb.button2.setOnAction(t-> {
                        ps.println("4-"+SharedData.playerID);
                });
                gb.button3.setOnAction(t-> {
                        ps.println("5-"+SharedData.playerID);
                });
                gb.button4.setOnAction(t-> {
                        ps.println("6-"+SharedData.playerID);
                });
                gb.button5.setOnAction(t-> {
                        ps.println("7-"+SharedData.playerID);
                });
                gb.button6.setOnAction(t-> {
                        ps.println("8-"+SharedData.playerID);
                });
                gb.button7.setOnAction(t-> {
                        ps.println("9-"+SharedData.playerID);
                });
                //gameStartScene = new Scene();
                Main.showNewScene(gameStartScene);
        }
      
}
