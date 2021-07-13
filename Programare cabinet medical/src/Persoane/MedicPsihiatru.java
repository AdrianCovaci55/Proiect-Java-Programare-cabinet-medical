package Persoane;

public class MedicPsihiatru extends Medic{
    private String ceaMaiStudiataBoala;

    MedicPsihiatru(String nume, int varsta, String specialitateMedic, String spital, int aniExperienta, String ceaMaiStudiataBoala){

        this.nume = nume;
        this.varsta = varsta;
        this.specialitateMedic = specialitateMedic;
        this.spitalApartinator = spital;
        this.aniExperienta = aniExperienta;
        this.ceaMaiStudiataBoala = ceaMaiStudiataBoala;

    }

    public String getCeaMaiStudiataBoala(){

        return ceaMaiStudiataBoala;

    }

}
