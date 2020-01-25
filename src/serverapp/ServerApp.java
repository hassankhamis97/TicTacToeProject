/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hassan
 */
public class ServerApp {

        /**
         * @param args the command line arguments
         */
        ServerSocket server;
        DataInputStream dis;
        PrintStream ps;
        Socket virtualSocket;
        List<GamePlayers> gpList = new ArrayList<GamePlayers>();
        GamePlayers gp;
        public ServerApp()
        {
                gp = new GamePlayers();
                serverEstablishConnection();
        }
        public static void main(String[] args) {        
                new ServerApp();
                
        }
        
        private void serverEstablishConnection() {
                try {
                        // TODO code application logic here
                        server = new ServerSocket(5000);
                } catch (IOException ex) {
                        Logger.getLogger(ServerApp.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true)
                {
                    
                        
                        
                                        try {
                                                virtualSocket = server.accept();
                                                //new Thread();
                                                if(gp.vrtualSocket1 == null)
                                                {
                                                    
                                                        gp.vrtualSocket1 = virtualSocket;
                                                }
                                                else if(gp.vrtualSocket2 == null)
                                                {
                                                        gp.vrtualSocket2 = virtualSocket;
                                                        gpList.add(gp);
                                                        /*Thread th = new Thread(new Runnable() {
                                                                @Override
                                                                public void run() {*/
                                                        System.out.println("will add room");
                                                                        ServerGameHandler s = new ServerGameHandler(gpList.get(gpList.size()-1).vrtualSocket1,gpList.get(gpList.size()-1).vrtualSocket2);
                                                                //}
                                                        //});
                                                        //th.start();
                                                        gp = new GamePlayers();
                                                }


                                        } catch (IOException ex) {
                                                Logger.getLogger(ServerApp.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                
                        
                        
                        /*try {
                                dis = new DataInputStream(virtualSocket.getInputStream());
                                ps = new PrintStream(virtualSocket.getOutputStream());
                        } catch (IOException ex) {
                                Logger.getLogger(ServerApp.class.getName()).log(Level.SEVERE, null, ex);
                        }*/
                        
                }
                
        }
}
class GamePlayers
{
        /*SocketChannel socketChanel1 = null;
        SocketChannel socketChanel2= null;*/
        Socket vrtualSocket1 = null;
        Socket vrtualSocket2= null;
}
