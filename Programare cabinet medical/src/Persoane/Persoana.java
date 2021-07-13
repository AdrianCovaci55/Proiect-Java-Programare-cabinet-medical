package Persoane;

public class Persoana {

    protected String nume;
    protected String prenume;
    protected int varsta;

    Persoana(){

        this.nume = " ";
        this.prenume = " ";
        this.varsta = 0;

    }

    Persoana ( String nume, String prenume, int varsta){

        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;

    }

    public String getNume(){

        return nume + ' '+ prenume;

    }


}
