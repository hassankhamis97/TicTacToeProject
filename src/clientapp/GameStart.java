/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

//import com.mysql.fabric.xmlrpc.Client;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import javafx.application.Platform;
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
public class GameStart {

        Scene gameStartScene;
        PrintStream ps;
        DataInputStream dis;
        //ObjectInputStream ois;
        DataOutputStream dos;
        //Socket client;
        String status;
        public GameStart() {

        }

        public GameStart(Socket player2SocketID) {
                //gameStartScene = new Scene(new BorderPane());
                GameBase gb = new GameBase();
                gameStartScene = gb.getScene();
                try {
                        dis = new DataInputStream(player2SocketID.getInputStream());
                        //ps = new PrintStream(player2SocketID.getOutputStream());
                        dos = new DataOutputStream(player2SocketID.getOutputStream());
                } catch (IOException ex) {
                        Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                }
                /*try {
                ois = new ObjectInputStream(player2SocketID.getInputStream());
                oos = new ObjectOutputStream(player2SocketID.getOutputStream());
            } catch (IOException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }*/
 /*gb.button.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent t) {
                                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
                });*/
                Thread th = new Thread(new Runnable() {
                        @Override
                        public void run() {
                                while (true) {
                                        //String s = "";
                                        try {
                                                String data = dis.readUTF();
//                                            String data = "";
//                                            try {
//                                                data = (String) ois.readObject();
//                                            } catch (ClassNotFoundException ex) {
//                                                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
//                                            }
                                                String[] msg = data.split("-");
                                                /*Platform.runLater(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                                gb.button.setText(data);
                                                        }
                                                });*/

                                                switch (msg[0]) {
                                                        case "0":
                                                            status = msg[1];
                                                            break;
                                                        case "1":
                                                                //gb.button.setText(data);
                                                                Platform.runLater(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                                gb.button.setText(msg[1]);
                                                                                gb.button.setDisable(true);
                                                                        }
                                                                });

                                                                break;
                                                        case "2":
                                                                Platform.runLater(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                                gb.button0.setText(msg[1]);
                                                                                gb.button0.setDisable(true);
                                                                        }
                                                                });
                                                                break;
                                                        case "3":
                                                                Platform.runLater(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                                gb.button1.setText(msg[1]);
                                                                                gb.button1.setDisable(true);
                                                                        }
                                                                });
                                                                break;
                                                        case "4":
                                                                Platform.runLater(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                                gb.button2.setText(msg[1]);
                                                                                gb.button2.setDisable(true);
                                                                        }
                                                                });
                                                                break;
                                                        case "5":
                                                                Platform.runLater(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                                gb.button3.setText(msg[1]);
                                                                                gb.button3.setDisable(true);
                                                                        }
                                                                });
                                                                break;
                                                        case "6":
                                                                Platform.runLater(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                                gb.button4.setText(msg[1]);
                                                                                gb.button4.setDisable(true);
                                                                        }
                                                                });
                                                                break;
                                                        case "7":
                                                                Platform.runLater(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                                gb.button5.setText(msg[1]);
                                                                                gb.button5.setDisable(true);
                                                                        }
                                                                });
                                                                break;
                                                        case "8":
                                                                Platform.runLater(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                                gb.button6.setText(msg[1]);
                                                                                gb.button6.setDisable(true);
                                                                        }
                                                                });
                                                                break;
                                                        case "9":
                                                                Platform.runLater(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                                gb.button7.setText(msg[1]);
                                                                                gb.button7.setDisable(true);
                                                                        }
                                                                });
                                                                break;
                                                        //case "wait":
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
                gb.button.setOnAction(t -> {
                        try {
                                if(status.equals("start"))
                                        dos.writeUTF("1-" + SharedData.playerID);
                                //ps.println("1-"+SharedData.playerID);
                                //oos.writeObject("1-"+SharedData.playerID);
                                //dos.writeUTF("1-"+SharedData.playerID);
                                //dos.writeUTF("1");
                                
                                //gb.button.setText("X");
                        } catch (IOException ex) {
                                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                        }
                });
                gb.button0.setOnAction(t -> {
                        try {
                                if(status.equals("start"))
                                dos.writeUTF("2-" + SharedData.playerID);
                        } catch (IOException ex) {
                                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                        }
                });
                gb.button1.setOnAction(t -> {
                        try {
                                if(status.equals("start"))
                                dos.writeUTF("3-" + SharedData.playerID);
                        } catch (IOException ex) {
                                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                        }
                });
                gb.button2.setOnAction(t -> {
                        try {
                                if(status.equals("start"))
                                dos.writeUTF("4-" + SharedData.playerID);
                        } catch (IOException ex) {
                                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                        }
                });
                gb.button3.setOnAction(t -> {
                        try {
                                if(status.equals("start"))
                                dos.writeUTF("5-" + SharedData.playerID);
                        } catch (IOException ex) {
                                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                        }
                });
                gb.button4.setOnAction(t -> {
                        try {
                                if(status.equals("start"))
                                dos.writeUTF("6-" + SharedData.playerID);
                        } catch (IOException ex) {
                                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                        }
                });
                gb.button5.setOnAction(t -> {
                        try {
                                if(status.equals("start"))
                                dos.writeUTF("7-" + SharedData.playerID);
                        } catch (IOException ex) {
                                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                        }
                });
                gb.button6.setOnAction(t -> {
                        try {
                                if(status.equals("start"))
                                dos.writeUTF("8-" + SharedData.playerID);
                        } catch (IOException ex) {
                                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                        }
                });
                gb.button7.setOnAction(t -> {
                        try {
                                if(status.equals("start"))
                                dos.writeUTF("9-" + SharedData.playerID);
                        } catch (IOException ex) {
                                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                        }
                });
                //gameStartScene = new Scene();
                Main.showNewScene(gameStartScene);
        }

}
