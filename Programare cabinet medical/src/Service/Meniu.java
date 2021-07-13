package Service;

import Persoane.*;
import Spital.*;
import Service.*;
import BazeDeDate.*;
import sun.security.provider.ConfigFile;

import java.util.Scanner;

public class Meniu implements Audit {

    public void meniu(Client[] pacient, Medic[] medic, Spital[] spital) {
        System.out.println("------Selectati o optiune :------");
        System.out.println();
        System.out.println("1.Afisare numar pacienti");
        System.out.println("2. Afisare nume pacienti");
        System.out.println("3. Afisare spitale cu locuri libere");
        System.out.println("4. Afisare medici in functie de specializarea lor");
        System.out.println("5. Adaugare pacienti fiecarui medic ( fiecare pacient viziteaza toti medicii din sectia cu probleme )");
        System.out.println("6. Numarul de pacienti pentru fiecare medic");
        System.out.println("7. Afisare toti barbatii care sunt asignati pentru fiecare medic");
        System.out.println("8. Cate femei sunt atribuite fiecarui medic pentru control");

        System.out.println("9. Adaugare pacient prin baza de date");
        System.out.println("10. Adaugare medic prin baza de date");
        System.out.println("11. Adaugare spital prin baza de date");
        System.out.println("12. Afisare pacienti prin baza de date");
        System.out.println("13. Afisare medici prin baza de date");
        System.out.println("14. Afisare spitale prin baza de date");
        System.out.println("15. Modificare problema pacient prin baza de date");
        System.out.println("16. Modificare specialitate medic prin baza de date");
        System.out.println("17. Modificare numar locuri libere din spitale prin baza de date");
        System.out.println("18. Stergere pacient din baza de date");
        System.out.println("19. Stergere medic din baza de date");
        System.out.println("20. Stergere spital din baza de date");
        System.out.println("21.Iesire");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Introduceti numarul corespunzator comenzii pe care doriti sa o executati :");
        Scanner scanner = new Scanner(System.in);
        int comanda = scanner.nextInt();
        Service service = new Service();
        while (comanda >= 22) {
            System.out.println("Alegeti o optiune valida.");
            comanda = scanner.nextInt();
        }


        do {

            switch (comanda) {
                case 1: {
                    audit("Afisare numar pacienti");

                    System.out.println();
                    System.out.println("In total sunt " + pacient.length + " pacienti.");


                }

                break;

                case 2: {
                    audit("Afisare nume pacienti");


                    System.out.println();
                    for(int i=0; i< pacient.length; i++){

                        pacient[i].Afisare();

                    }
                }

                break;

                case 3: {
                    audit("Afisare spitale cu locuri libere");


                    for(int i=0; i< spital.length; i++){

                        if(spital[i]!=null)
                        if(spital[i].getLocuriLibere()!=0){
                            System.out.println(spital[i].getNumeSpital());
                        }

                    }
                }

                break;

                case 4: {
                    audit("Afisare medici in functie de specializarea lor");


                    for(int i=0; i< medic.length; i++){

                        if(medic[i].getSpecialitateMedic().equals("chirurg")) {
                            System.out.println( "Medicul " + medic[i].getNumeMedic() + " este " + medic[i].getSpecialitateMedic());
                        }

                    }

                    System.out.println();

                    for(int i=0; i< medic.length; i++){

                        if(medic[i].getSpecialitateMedic().equals("familie")) {
                            System.out.println( "Medicul " + medic[i].getNumeMedic() + " este de " + medic[i].getSpecialitateMedic());
                        }

                    }

                    System.out.println();

                    for(int i=0; i< medic.length; i++){


                        if(medic[i].getSpecialitateMedic().equals("ortoped")) {
                            System.out.println( "Medicul " + medic[i].getNumeMedic() + " este " + medic[i].getSpecialitateMedic());
                        }

                    }

                    System.out.println();

                    for(int i=0; i< medic.length; i++){

                        if(medic[i].getSpecialitateMedic().equals("psihiatru")) {

                            System.out.println( "Medicul " + medic[i].getNumeMedic() + " este " + medic[i].getSpecialitateMedic());
                        }

                    }

                    System.out.println();
                }

                break;
                case 5: {
                    audit("Adaugare pacienti fiecarui medic ( fiecare pacient viziteaza toti medicii din sectia cu probleme )");


                    for (int i = 0; i < medic.length; i++) {

                        for (int j = 0; j < pacient.length; j++) {

                            if(pacient[j]!=null)
                                if (pacient[j].getProblemaClient().equals(medic[i].getSpecialitateMedic()) && pacient[j].getAles() == 0 )

                                    medic[i].adaugaPacientiMedicului(pacient[j]);
                                    ///pacient[j].setAles(1);

                        }

                    }
                }

                break;


                case 6: {
                    audit("Numarul de pacienti pentru fiecare medic");


                    for (int i = 0; i < medic.length; i++) {

                        if(medic[i]!=null)
                        System.out.println("Medicul " + medic[i].getNumeMedic() + " are " + medic[i].getNumarPacientiMedic() + " pacienti.");

                    }
                }

                break;

                case 7: {
                    audit("Afisare toti barbatii care sunt asignati pentru fiecare medic");

                    Service.afisareBarbati(pacient, medic);

                }

                break;

                case 8: {
                    audit("Cate femei sunt atribuite fiecarui medic pentru control");

                    Service.numarFemei(pacient, medic);
                }

                break;

                case 9: {
                    audit("adaugare client prin baza de date");

                    String nume;
                    String prenume;
                    int varsta;
                    String gen;
                    String problema;
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Introduceti numele pacientului: ");
                    nume = sc.nextLine();
                    System.out.println("Introduceti prenumele pacientului: ");
                    prenume = sc.nextLine();
                    System.out.println("Introduceti varsta pacientului: ");
                    varsta = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduceti genul pacientului: ");
                    gen = sc.nextLine();
                    System.out.println("Introduceti problema pacientului: ");
                    problema = sc.nextLine();
                    Client c = new Client(nume, prenume, varsta, gen, problema);
                    AdaugareBazeDeDate.adaugareClienti(c);

                }

                break;

                case 10: {

                    audit("adaugare medic prin baza de date");

                    String nume;
                    int varsta;
                    String specialitate;
                    Scanner sc1 = new Scanner(System.in);

                    System.out.println("Introduceti numele medicului: ");
                    nume = sc1.nextLine();
                    System.out.println("Introduceti varsta medicului: ");
                    varsta = Integer.parseInt(sc1.nextLine());
                    System.out.println("Introduceti specialitate medicului: ");
                    specialitate = sc1.nextLine();
                    Medic m = new Medic(nume, varsta, specialitate);
                    AdaugareBazeDeDate.adaugareMedici(m);

                }

                break;

                case 11: {

                    audit("adaugare spital prin baza de date");

                    String nume;
                    String locatie;
                    int locuriLibere;
                    Scanner sc2 = new Scanner(System.in);

                    System.out.println("Introduceti numele spitalului: ");
                    nume = sc2.nextLine();
                    System.out.println("Introduceti numarul de locuri libere din spital: ");
                    locuriLibere = Integer.parseInt(sc2.nextLine());
                    System.out.println("Introduceti locatia spitalului: ");
                    locatie = sc2.nextLine();
                    Spital s = new Spital(nume, locatie, locuriLibere);
                    AdaugareBazeDeDate.adaugareSpitale(s);

                }

                break;

                case 12: {

                    audit("afisare clienti prin baza de date");

                    AfisareBazeDeDate.afisareClienti();

                }

                break;

                case 13: {

                    audit("afisare medici prin baza de date");

                    AfisareBazeDeDate.afisareMedici();

                }

                break;

                case 14: {

                    audit("afisare spitale prin baza de date");

                    AfisareBazeDeDate.afisareSpitale();

                }

                break;

                case 15: {

                    int idupdate;
                    String problema;
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Introduceti id-ul pacientului pentru care doriti sa modificati problema: ");
                    idupdate = Integer.parseInt(sc3.nextLine());
                    System.out.println("Introduceti problema modificata: ");
                    problema = sc3.nextLine();
                    UpdateBazeDeDate.updateClienti(problema, idupdate);
                    audit("S-a actualizat problema pacientului din baza de date.");

                }

                break;

                case 16: {

                    int idupdate;
                    String specialitate;
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Introduceti id-ul medicului pentru care doriti sa modificati specialitatea: ");
                    idupdate = Integer.parseInt(sc4.nextLine());
                    System.out.println("Introduceti specialitatea modificata: ");
                    specialitate = sc4.nextLine();
                    UpdateBazeDeDate.updateMedici(specialitate, idupdate);
                    audit("S-a actualizat specialitatea medicului din baza de date.");

                }

                break;

                case 17: {

                    int idupdate;
                    int locuriLibere;
                    Scanner sc5 = new Scanner(System.in);
                    System.out.println("Introduceti id-ul spitalului caruia doriti sa ii modificati numarul de locuri libere");
                    idupdate = Integer.parseInt(sc5.nextLine());
                    System.out.println("Introduceti numarul de locuri libere modificat: ");
                    locuriLibere = Integer.parseInt(sc5.nextLine());
                    UpdateBazeDeDate.updateSpitale(locuriLibere, idupdate);
                    audit("S-a actualizat numarul de locuri libere din spital folosind baza de date.");
                }
                break;

                case 18: {

                    int id;
                    Scanner sc6 = new Scanner(System.in);
                    System.out.println("Introduceti idul pacientului pe care doiriti sa il stergeti: ");
                    id = Integer.parseInt(sc6.nextLine());
                    StergereBazeDeDate.stergereClienti(id);
                    audit("S-a sters un client din baza de date.");

                }

                break;

                case 19: {

                    int id;
                    Scanner sc7 = new Scanner(System.in);
                    System.out.println("Introduceti idul medicului pe care doiriti sa il stergeti: ");
                    id = Integer.parseInt(sc7.nextLine());
                    StergereBazeDeDate.stergereMedici(id);
                    audit("S-a sters un medic din baza de date.");

                }

                break;

                case 20: {

                    int id;
                    Scanner sc8 = new Scanner(System.in);
                    System.out.println("Introduceti idul pacientului pe care doiriti sa il stergeti: ");
                    id = Integer.parseInt(sc8.nextLine());
                    StergereBazeDeDate.stergereSpitale(id);
                    audit("S-a sters un spital din baza de date.");

                }

                break;

                case 21: {
                    audit("Iesire din aplicatie");
                    System.exit(0);
                }

                break;
            }
            System.out.println("Mai doriti sa executati alta comanda?");
            System.out.println("1.Da        2.Nu (Iesire) ");
            int reset = scanner.nextInt();
            if (reset == 1)
            {
                System.out.println("------Selectati o optiune :------");
                System.out.println();
                System.out.println("1.Afisare numar pacienti");
                System.out.println("2. Afisare nume pacienti");
                System.out.println("3. Afisare spitale cu locuri libere");
                System.out.println("4. Afisare medici in functie de specializarea lor");
                System.out.println("5. Adaugare pacienti fiecarui medic ( fiecare pacient viziteaza toti medicii din sectia cu probleme )");
                System.out.println("6. Numarul de pacienti pentru fiecare medic");
                System.out.println("7. Afisare toti barbatii care sunt asignati pentru fiecare medic");
                System.out.println("8. Cate femei sunt atribuite fiecarui medic pentru control");
                System.out.println("9. Adaugare pacient prin baza de date");
                System.out.println("10. Adaugare medic prin baza de date");
                System.out.println("11. Adaugare spital prin baza de date");
                System.out.println("12. Afisare pacienti prin baza de date");
                System.out.println("13. Afisare medici prin baza de date");
                System.out.println("14. Afisare spitale prin baza de date");
                System.out.println("15. Modificare problema pacient prin baza de date");
                System.out.println("16. Modificare specialitate medic prin baza de date");
                System.out.println("17. Modificare numar locuri libere din spitale prin baza de date");
                System.out.println("18. Stergere pacient din baza de date");
                System.out.println("19. Stergere medic din baza de date");
                System.out.println("20. Stergere spital din baza de date");
                System.out.println("21. Iesire");
                System.out.println("---------------------------------");
                System.out.println();
                System.out.println("Introduceti numarul corespunzator comenzii pe care doriti sa o executati :");
                comanda = scanner.nextInt();
            }
            else {
                System.exit(1);
            }
        }while (comanda < 22);

    }
}