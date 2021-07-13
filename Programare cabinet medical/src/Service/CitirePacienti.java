package Service;

import Persoane.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CitirePacienti {

    private static CitirePacienti citire;
    public CitirePacienti(){}
    public static CitirePacienti getInstance()
    {
        if(citire==null)
            citire = new CitirePacienti();
        return citire;
    }

    public void citire(String path, Client[] pacient, int n) {
        try {
            Scanner in = new Scanner(new File(path));
            String linie;
            for (int i = 0;i<n;i++)
            {
                linie=in.nextLine();
                String[] splitter = linie.split(", ");
                pacient[i]= new Client(splitter[0], splitter[1], Integer.parseInt(splitter[2]), splitter[3], splitter[4]);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}