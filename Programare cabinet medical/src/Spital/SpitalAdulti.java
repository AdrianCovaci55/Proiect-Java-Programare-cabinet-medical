package Spital;

public class SpitalAdulti extends Spital{

    protected boolean personalCuRabdare;

    public SpitalAdulti(String numeSpital, String locatie, int locuriLibere){

        this.numeSpital = numeSpital;
        this.locatie = locatie;
        this.locuriLibere = locuriLibere;
        this.personalCuRabdare = false;

    }

    @Override
    public int getLocuriLibere() {
        return super.getLocuriLibere();
    }

    @Override
    public String getNumeSpital() {
        return super.getNumeSpital();
    }

    @Override
    public String getLocatie() {
        return super.getLocatie();
    }

    public boolean isPersonalCuRabdare() {
        return personalCuRabdare;
    }
}
