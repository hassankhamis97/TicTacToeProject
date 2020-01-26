/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 *
 * @author hassa
 */
public class BeforeConnectTheGame {
        Socket client;
        Button b = new Button("connect");
        Scene BeforeConnectScene;
        public BeforeConnectTheGame()
        {       
               // Thread th = new Thread(new Runnable() {
                       // @Override
                     //   public void run() {
                                try {

                                        //client = new Socket("192.168.1.7",5000);
                                        client = new Socket("127.0.0.1",5000);

                                //SocketChannel socketChannel = client.getChannel();
                                } catch (IOException ex) {
                                        Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        //}
                //});
               // th.start();

                BeforeConnectScene = new Scene(b);
                
                b.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent t) {
                                new GameStart(client);
                        }
                });
                Main.showNewScene(BeforeConnectScene);
        }
        /*public static void main(String[] args) {
                new BeforeConnectTheGame();
        }*/
}
