/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

import IO.IO;
import ThongBao.ThongBao;
import View.MainViews;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class MainApp {

    public static void main(String args[])  {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame MainViews = new MainViews();
                MainViews.setLocationRelativeTo(null);
                MainViews.setVisible(true);
//                IO io = new IO();
//                ArrayList<ThongBao> dsThongBao = io.docThongBao();
                               
            }
        });
    }

}
