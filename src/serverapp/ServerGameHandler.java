/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hassan
 */
public class ServerGameHandler {

        DataInputStream dis1;
        DataInputStream dis2;
        DataOutputStream dos1;
        DataOutputStream dos2;

        //ObjectInputStream ois1;
        //DataOutputStream dos1;
        //PrintStream ps1;
        //ObjectOutputStream oos1;
        //DataInputStream dis2;
        //ObjectInputStream ois2;
        //DataOutputStream dos2;
        //PrintStream ps2;
        //ObjectOutputStream oos2;
        Connection con;
        ResultSet rs;
        PreparedStatement ps;
        boolean isPlayer1Wait = false;
        List<Moves> mvlst = new ArrayList<Moves>();
        Moves mv;
        Thread th1;
        Thread th2;
        public ServerGameHandler(Socket virtualSocketPlayer1, Socket virtualSocketPlayer2) {
                try {
                        dis1 = new DataInputStream(virtualSocketPlayer1.getInputStream());
                        dis2 = new DataInputStream(virtualSocketPlayer2.getInputStream());
                        dos1 = new DataOutputStream(virtualSocketPlayer1.getOutputStream());
                        dos2 = new DataOutputStream(virtualSocketPlayer2.getOutputStream());
                        /*dis1 = new DataInputStream(virtualSocketPlayer1.getInputStream());
                        dis2 = new DataInputStream(virtualSocketPlayer2.getInputStream());
                        ps1 = new PrintStream(virtualSocketPlayer1.getOutputStream());
                        ps2 = new PrintStream(virtualSocketPlayer2.getOutputStream());*/
                        mv = new Moves("0", LocalTime.now(), "-", "0");
                        mvlst.add(mv);
                        try {
                                Class.forName("com.mysql.jdbc.Driver");
                        } catch (ClassNotFoundException ex) {
                                Logger.getLogger(ServerGameHandler.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {

                                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaproject", "root", "root");
                        } catch (SQLException ex) {
                                Logger.getLogger(ServerGameHandler.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        Thread th1 = new Thread(new Runnable() {
                                @Override
                                public void run() {
                                        while (true) {
                                                if (true) {//!isPlayer1Wait
                                                        String msgP1;
                                                        String[] msgList = {};
                                                        try {
                                                                msgP1 = dis1.readUTF();
                                                                msgList = msgP1.split("-");
                                                        } catch (IOException ex) {
                                                                Logger.getLogger(ServerGameHandler.class.getName()).log(Level.SEVERE, null, ex);
                                                        }
                                                        //mv = new Moves(msgList[1],LocalTime.now(),"X",msgList[0]);
                                                        //calculateDelayTime();
                                                        try {
                                                                dos2.writeUTF(msgList[0] + "-X");
                                                                dos1.writeUTF(msgList[0] + "-X");
                                                                dos1.writeUTF("0-wait");
                                                                dos2.writeUTF("0-start");
                                                                /*dos2.writeUTF("X");
                                                dos1.writeUTF("X");*/
                                                        } catch (IOException ex) {
                                                                Logger.getLogger(ServerGameHandler.class.getName()).log(Level.SEVERE, null, ex);
                                                        }
                                                        /*ServerGameHandler.this.ps2.println(msgList[0] + "-X");
                                        ServerGameHandler.this.ps1.println(msgList[0] + "-X");*/
                                                        //isPlayer1Wait = true;
                                                        
                                                        
                                                                        //ServerGameHandler.this.ps1.println("wait");
                                                                        //dos1.writeUTF("wait");
                                                                        
                                                              
                                                } else {
                                                        
                                                                
                                                        
                                                        
                                  

                                                }
                                        }
                                }
                        });
                        Thread th2 = new Thread(new Runnable() {

                                @Override
                                public void run() {
                                        while (true) {
                                                if(true)//isPlayer1Wait
                                                {

                                                String msgP2;
                                                String[] msgList = {};
                                                try {
                                                        msgP2 = dis2.readUTF();
                                                        msgList = msgP2.split("-");
                                                } catch (IOException ex) {
                                                        Logger.getLogger(ServerGameHandler.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                                //mv = new Moves(msgList[1],LocalTime.now(),"O",msgList[0]);
                                                //calculateDelayTime();
                                                try {
                                                        //dos2.writeUTF("O");
                                                        //dos1.writeUTF("O");
                                                        dos1.writeUTF(msgList[0] + "-O");
                                                        dos2.writeUTF(msgList[0] + "-O");
                                                        dos2.writeUTF("0-wait");
                                                                dos1.writeUTF("0-start");
                                                } catch (IOException ex) {
                                                        Logger.getLogger(ServerGameHandler.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                                /*ServerGameHandler.this.ps2.println(msgList[0] + "-X");
                                        ServerGameHandler.this.ps1.println(msgList[0] + "-X");*/
                                                isPlayer1Wait = false;
                                                }
                                                else {
                                                        try {
                                                                //ServerGameHandler.this.ps1.println("wait");
                                                                dos2.writeUTF("wait-nothing");
                                                        } catch (IOException ex) {
                                                                Logger.getLogger(ServerGameHandler.class.getName()).log(Level.SEVERE, null, ex);
                                                        }
                                                        
                                  

                                                }
                                        }
                                }
                        });
                        th1.start();
                        th2.start();
                        dos1.writeUTF("0-start");
                        dos2.writeUTF("0-wait");
                } catch (IOException ex) {
                        Logger.getLogger(ServerGameHandler.class.getName()).log(Level.SEVERE, null, ex);
                }

        }

        public void calculateDelayTime() {
                LocalTime t1 = mvlst.get(mvlst.size() - 1).getCurrentTime();
                LocalTime t2 = mvlst.get(mvlst.size() - 2).getCurrentTime();
                SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
                try {

                        Date d1 = f.parse(t1.toString());
                        Date d2 = f.parse(t2.toString());
                        long dif = d2.getTime() - d1.getTime();
                        mvlst.get(mvlst.size() - 1).setDelay(dif);
                        //System.out.println(dif);
                } catch (ParseException ex) {
                        Logger.getLogger(ServerApp.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
        /*@Override
        public void run() {
                while(true)
                {
                        try {   
                                
                                String msgP1 = dis1.readLine();
                                System.out.println(msgP1);
                                String msgP2 = dis2.readLine();
                                System.out.println(msgP2);

                        } catch (IOException ex) {
                                Logger.getLogger(ServerGameHandler.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
        }*/

}
