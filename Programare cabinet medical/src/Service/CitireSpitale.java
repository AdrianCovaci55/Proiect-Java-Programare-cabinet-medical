package Service;

import Spital.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CitireSpitale {

    private static CitireSpitale citire;
    public CitireSpitale(){}
    public static CitireSpitale getInstance()
    {
        if(citire==null)
            citire = new CitireSpitale();
        return citire;
    }

    public void citire(String path, Spital[] spital, int n) {
        try {
            Scanner in = new Scanner(new File(path));
            String linie;
            for (int i = 0;i<n;i++)
            {
                linie=in.nextLine();
                String[] splitter = linie.split(", ");
                spital[i]= new Spital(splitter[0], splitter[1], Integer.parseInt(splitter[2]));
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
