package Spital;

public class Spital {

    protected String numeSpital;
    protected String locatie;
    protected int locuriLibere;

    Spital(){

        this.numeSpital = " ";
        this.locatie = " ";
        this.locuriLibere = 0;

    }

    public Spital( String numeSpital, String locatie, int locuriLibere){

        this.numeSpital = numeSpital;
        this.locatie = locatie;
        this.locuriLibere = locuriLibere;

    }

    public String getNumeSpital(){

        return numeSpital;

    }

    public String getLocatie(){

        return locatie;

    }

    public int getLocuriLibere() {
        return locuriLibere;
    }
}
