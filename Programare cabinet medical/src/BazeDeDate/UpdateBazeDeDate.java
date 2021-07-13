package BazeDeDate;

import Persoane.Client;
import Spital.*;

import java.sql.*;

public class UpdateBazeDeDate {

    public static void updateClienti(String problema, int id){
        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proiectjava", "root", "Admin01pa55");
            Statement myStatm = myConn.createStatement();
            String sql = "UPDATE clienti SET problema=" + problema + " WHERE idClienti = " + id + "";

            myStatm.executeUpdate(sql);

            System.out.println("Update complete");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void updateMedici(String specialitate, int id){
        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proiectjava", "root", "Admin01pa55");
            Statement myStatm = myConn.createStatement();
            String sql = "UPDATE medici SET specialitate=" + specialitate + " WHERE idmedici = " + id + "";

            myStatm.executeUpdate(sql);

            System.out.println("Update complete");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void updateSpitale(int locurilibere, int id){
        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proiectjava", "root", "Admin01pa55");
            Statement myStatm = myConn.createStatement();
            String sql = "UPDATE spitale SET locurilibere=" + locurilibere + " WHERE idspitale = " + id + "";

            myStatm.executeUpdate(sql);

            System.out.println("Update complete");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

}
