package Service;

import Persoane.*;
import Programare.*;
import Spital.*;
import Service.Service;
import com.mysql.cj.x.protobuf.MysqlxPrepare;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args){

        /*
        ///Instantiere pacienti
        Client[] pacient = new Client[11];
        pacient[0] = new Client("Radoi", "Mirel", 33, "barbat", "chirurg");
        pacient[1] = new Client("Covaci", "Adrian", 20, "barbat", "familie");
        pacient[2] = new Client("Iancu", "Daria", 19, "femeie", "psihiatru");
        pacient[3] = new Client("Iancu", "Tudor", 18, "barbat", "ortoped");
        pacient[4] = new Client("Lacatus", "Ionut", 50, "barbat", "ortoped");
        pacient[5] = new Client("Popescu", "Mircea", 20, "barbat", "familie");
        pacient[6] = new Client("Stelian", "Florin", 60, "barbat", "familie");
        pacient[7] = new Client("Oprescu", "Teodor", 21, "barbat", "chirurg");
        pacient[8] = new Client("Gurau", "Claudia", 21, "femeie", "familie");
        pacient[9] = new Client("Marcela", "Andreea", 33, "femeie", "psihiatru");
        pacient[10] = new Client("Coman", "Florinel", 33, "barbat", "ortoped");
        ///Instantiere medici
        Medic[] medic = new Medic[11];
        medic[0] = new Medic ("Marcel", 50, "chirurg");
        medic[1] = new Medic ("Cosminoiu", 40, "familie");
        medic[2] = new Medic ("Mester", 30, "ortoped");
        medic[3] = new Medic ("Bordeiu", 55, "psihiatru");
        medic[4] = new Medic ("Argint", 46, "chirurg");
        medic[5] = new Medic ("Lautaru", 62, "familie");
        medic[6] = new Medic ("Brutaru", 48, "ortoped");
        medic[7] = new Medic ("Macelaru", 44, "psihiatru");
        medic[8] = new Medic ("Urzica", 46, "ortoped");
        medic[9] = new Medic ("Patrunjel", 54, "familie");
        medic[10] = new Medic ("Crocodil", 57, "chirurg");
        ///Instantiere spitale
        Spital[] spital = new Spital[5];
        spital[0] = new Spital("Elias", "Bucuresti", 0);
        spital[1] = new Spital("Universitar", "Bucuresti", 13);
        spital[2] = new Spital("Coltea", "Bucuresti", 13);
        spital[3] = new Spital("Angelescu", "Bucuresti", 13);
        spital[4] = new Spital("Militar", "Oradea", 19);
        ///  Downcasting de la spital la spital pentru adulti sau pentru copii + afisare
        Spital spitalPentruAdulti = new SpitalAdulti("Filantropia", "Timisoara", 0 );
        Spital spitalPentruCopii = new SpitalCopii("Budimexr", "Bucuresti", 4);
         */

        CitirePacienti citire1 = CitirePacienti.getInstance();
        Client[] pacient = new Client[11];
        citire1.citire("src/Fisiere/Pacienti.csv", pacient, 11);

        CitireMedici citire2 = CitireMedici.getInstance();
        Medic[] medic = new Medic[11];
        citire2.citire("src/Fisiere/Medic.csv", medic, 11);

        CitireSpitale citire3 = CitireSpitale.getInstance();
        Spital[] spital = new Spital[5];
        citire3.citire("src/Fisiere/Spitale.csv", spital, 5);

        Meniu meniu = new Meniu();

        meniu.meniu(pacient, medic, spital);

    }

}