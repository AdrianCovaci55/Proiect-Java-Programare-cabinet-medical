package Persoane;

import Spital.Spital;

public class MedicDeFamilie extends Medic{

    protected int familiiAtribuite;

    MedicDeFamilie(String nume, int varsta, String specialitateMedic, int familiiAtribuite, String spital){

        this.nume = nume;
        this.varsta = varsta;
        this.specialitateMedic = specialitateMedic;
        this.familiiAtribuite = familiiAtribuite;
        this.spitalApartinator = spital;

    }

    public int getFamiliiAtribuite(){
        return familiiAtribuite;
    }

}
