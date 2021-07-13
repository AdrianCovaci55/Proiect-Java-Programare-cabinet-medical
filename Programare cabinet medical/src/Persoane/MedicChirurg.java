package Persoane;

import Spital.Spital;

public class MedicChirurg extends Medic{

    private int rataDeSuccesOperatii;

    MedicChirurg(String nume, int varsta, String specialitateMedic, int rataDeSuccesOperatii, String spital, int aniExperienta){

        this.nume = nume;
        this.varsta = varsta;
        this.specialitateMedic = specialitateMedic;
        this.rataDeSuccesOperatii = rataDeSuccesOperatii;
        this.spitalApartinator = spital;
        this.aniExperienta = aniExperienta;

    }

    public int getRataDeSuccesOperatii(){
        return rataDeSuccesOperatii;
    }



}
