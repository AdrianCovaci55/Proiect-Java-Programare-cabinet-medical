package BazeDeDate;

import java.sql.*;
import Persoane.*;
import Spital.*;

public class StergereBazeDeDate {

    public static void stergereClienti(int id){
        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proiectjava", "root", "Admin01pa55");
            Statement myStatm = myConn.createStatement();
            String sql = "DELETE FROM clienti where idClienti = " + id + "";

            myStatm.executeUpdate(sql);

            System.out.println("Delete complete");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void stergereMedici(int id){
        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proiectjava", "root", "Admin01pa55");
            Statement myStatm = myConn.createStatement();
            String sql = "DELETE FROM medici where idmedici = " + id + "";

            myStatm.executeUpdate(sql);

            System.out.println("Delete complete");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void stergereSpitale(int id){
        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proiectjava", "root", "Admin01pa55");
            Statement myStatm = myConn.createStatement();
            String sql = "DELETE FROM spitale where idspitale = " + id + "";

            myStatm.executeUpdate(sql);

            System.out.println("Delete complete");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

}
