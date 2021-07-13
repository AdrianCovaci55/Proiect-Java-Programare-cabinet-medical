package Service;

import java.io.*;
import java.text.*;
import java.util.*;

public interface Audit {

    default void audit (String log) {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar calendar = Calendar.getInstance();

        try{

            FileWriter fileWriter = new FileWriter("src/Fisiere/Audit.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(log + ", "+dateFormat.format(calendar.getTime())+"\n");
            bufferedWriter.flush();
            bufferedWriter.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
