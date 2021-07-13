package BazeDeDate;

import java.sql.*;
import Persoane.*;
import Spital.*;

public class AdaugareBazeDeDate {

    public static void adaugareClienti(Client client){
        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proiectjava", "root", "Admin01pa55");
            Statement myStatm = myConn.createStatement();
            String sql = "INSERT INTO clienti(nume, prenume, varsta, gen, problema) VALUES ('" + client.getNume() + "', '" + client.getPrenume() + "', '" + client.getVarsta() + "', '" + client.getGenClient() + "', '" + client.getProblemaClient() + "' )";

            myStatm.executeUpdate(sql);

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void adaugareMedici(Medic medic){
        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proiectjava", "root", "Admin01pa55");
            Statement myStatm = myConn.createStatement();
            String sql = "INSERT INTO medici(nume, varsta, specialitate) VALUES ('" + medic.getNume() + "', '" + medic.getVarsta() + "', '" + medic.getSpecialitateMedic() + "')";

            myStatm.executeUpdate(sql);

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void adaugareSpitale(Spital spital){
        try {

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proiectjava", "root", "Admin01pa55");
            Statement myStatm = myConn.createStatement();
            String sql = "INSERT INTO spitale(nume, locatie, locurilibere) VALUES ('" + spital.getNumeSpital() + "', '" + spital.getLocatie() + "', '" + spital.getLocuriLibere() + "')";

            myStatm.executeUpdate(sql);

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

}
