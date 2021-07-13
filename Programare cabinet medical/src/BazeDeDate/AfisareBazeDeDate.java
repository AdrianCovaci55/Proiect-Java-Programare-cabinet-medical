package BazeDeDate;

import java.sql.*;
import Persoane.*;
import Service.*;

public class AfisareBazeDeDate {

    public static void afisareClienti(){

        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proiectjava", "root", "Admin01pa55");
            Statement myStatm = myConn.createStatement();
            ResultSet myRS = myStatm.executeQuery("SELECT * FROM clienti");

            while (myRS.next()){

                System.out.println(myRS.getString("nume") + ", " + myRS.getString("prenume") + ", " + myRS.getInt("varsta") + ", " + myRS.getString("gen") + ", " + myRS.getString("problema"));

            }

            System.out.println("Output complete");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void afisareMedici(){

        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proiectjava", "root", "Admin01pa55");
            Statement myStatm = myConn.createStatement();
            ResultSet myRS = myStatm.executeQuery("SELECT * FROM medici");

            while (myRS.next()){

                System.out.println(myRS.getString("nume") + ", " + myRS.getInt("varsta") + ", " + myRS.getString("specialitate"));

            }

            System.out.println("Output complete");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void afisareSpitale(){

        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proiectjava", "root", "Admin01pa55");
            Statement myStatm = myConn.createStatement();
            ResultSet myRS = myStatm.executeQuery("SELECT * FROM spitale");

            while (myRS.next()){

                System.out.println(myRS.getString("nume") + ", " + myRS.getString("locatie") + ", " + myRS.getInt("locurilibere"));

            }

            System.out.println("Output complete");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }



}
