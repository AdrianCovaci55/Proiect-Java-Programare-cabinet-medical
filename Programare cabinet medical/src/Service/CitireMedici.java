package Service;

import Persoane.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CitireMedici {

    private static CitireMedici citire;
    public CitireMedici(){}
    public static CitireMedici getInstance()
    {
        if(citire==null)
            citire = new CitireMedici();
        return citire;
    }

    public void citire(String path, Medic[] medici, int n) {
        try {
            Scanner in = new Scanner(new File(path));
            String linie;
            for (int i = 0;i<n;i++)
            {
                linie=in.nextLine();
                String[] splitter = linie.split(", ");
                medici[i]= new Medic(splitter[0], Integer.parseInt(splitter[1]), splitter[2]);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
