//allikas https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "2016kvvosa.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] kontovv = line.split(cvsSplitBy);

                System.out.println("Kirje [kuup= " + kontovv[2] + " , nimi=" + kontovv[4] + " , D/C=" + kontovv[7] + " , summa=" + kontovv[8] +  " , selgitus=" + kontovv[11] +"]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}