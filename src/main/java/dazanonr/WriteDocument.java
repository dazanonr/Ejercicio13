package dazanonr;

import dazanonr.CityData;

import java.io.*;

public class WriteDocument implements Runnable{

    CityData cityData;

    public WriteDocument(CityData cityData) {this.cityData = cityData;}

    public void run() {
        try {
            File file = new File("C:\\Users\\dazanonr\\Documents\\Citydata\\city_data.txt");
            BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter(file, true));
            System.out.println(cityData.toString());
            bufferedWriter.write(cityData.toString());
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //BufferedWriter depende del FileWriter

    }
}