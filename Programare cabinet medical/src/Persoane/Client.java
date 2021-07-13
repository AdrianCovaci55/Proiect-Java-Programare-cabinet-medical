package Persoane;

public class Client extends Persoana{

    private String genClient;
    private String problemaClient;
    private int ales;

    public  Client (){

        this.nume = " ";
        this.prenume = " ";
        this.varsta = 0;
        this.genClient = " ";
        this.problemaClient = " ";
        this.ales = 0;

    }

    public Client ( String nume, String prenume, int varsta, String genClient, String problemaClient){

        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.genClient = genClient;
        this.problemaClient = problemaClient;
        this.ales = 0;

    }

    public String getNume(){

        return nume;

    }

    public String getProblemaClient(){

        return problemaClient;

    }

    public void Afisare(){

        System.out.println(this.nume + " " + this.prenume);

    }

    public int compare(Client o1, Client o2) {

        return o1.getNume().compareTo(o2.getNume());
    }

    public void setAles(int numar){

        this.ales = numar;

    }

    public int getAles(){

        return ales;

    }

    public String getGenClient(){

        return genClient;

    }

    public String getPrenume(){

        return prenume;

    }

    public int getVarsta(){

        return varsta;

    }

}
