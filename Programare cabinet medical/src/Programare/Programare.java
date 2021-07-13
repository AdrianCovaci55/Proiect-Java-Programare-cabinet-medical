package Programare;

import Persoane.Client;
import Spital.Spital;


public class Programare {

    private int index;
    private int zi_programare;
    private String luna_programare;
    private int ora_programare;
    private String spital;
    private String medic;
    private String problemaClient;
    public String nume;

    Programare(){

        this.nume = " ";
        this.spital = " ";
        this.medic = " ";
        this.problemaClient = " ";
        this.index = 0;
        this.zi_programare = 0;
        this.luna_programare = " ";
        this.ora_programare = 0;

    }

    Programare(String nume, String spital, String medic, String problemaClient, int index, int zi_programare, String luna_programare, int ora_programare){

        this.nume = nume;
        this.spital = spital;
        this.medic = medic;
        this.problemaClient = problemaClient;
        this.index = index;
        this.zi_programare = zi_programare;
        this.luna_programare = luna_programare;
        this.ora_programare = ora_programare;

    }

    public int getIndex() {
        return index;
    }

    public int getOra_programare() {
        return ora_programare;
    }

    public int getZi_programare() {
        return zi_programare;
    }

    public String getNumet(){
        return nume;
    }

    public String getProblemaClient(){
        return problemaClient;
    }

    public String getLuna_programare(){
        return luna_programare;
    }

    public String getSpital(){
        return spital;
    }

    public String getMedic(){
        return medic;
    }
}
