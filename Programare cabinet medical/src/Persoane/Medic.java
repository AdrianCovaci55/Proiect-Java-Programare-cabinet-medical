package Persoane;

import Persoane.Client;

import java.util.ArrayList;
import java.util.List;

public class Medic extends Persoana {

    protected String specialitateMedic;
    protected int aniExperienta;
    protected String spitalApartinator;
    String statusMedic;
    List<Client> listaPacientiMedic = new ArrayList<>();

     Medic (){

        this.nume = " ";
        this.varsta = 0;
        this.specialitateMedic = " ";

    }

    public Medic ( String numeMedic, int varstaMedic, String specialitateMedic){

        this.nume = numeMedic;
        this.varsta = varstaMedic;
        this.specialitateMedic = specialitateMedic;

    }

    public String getNumeMedic(){

        return nume;

    }

    public List<Client> getListaPacientiMedic(){

        return listaPacientiMedic;

    }

    public void adaugaPacientiMedicului ( Client c ){

        listaPacientiMedic.add(c);

    }

    public int getNumarPacientiMedic(){

         return listaPacientiMedic.size();

    }

    public String getSpecialitateMedic(){

        return specialitateMedic;

    }

    public String toString(){

        return (nume + " " + specialitateMedic);

    }

    public int getVarsta(){

         return varsta;

    }

}
