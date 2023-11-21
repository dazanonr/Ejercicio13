package dazanonr;

import dazanonr.CityData;

import java.io.*;

public class WriteDocument implements Runnable{

    CityData cityData;

    public WriteDocument(CityData cityData) {this.cityData = cityData;}

    public void run() {
        try {
            File file = new File("C:\\Users\\dazanonr\\Documents\\CityData\\city_data.txt");
            Writer writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.newLine();
            System.out.println(cityData.toString());
            bufferedWriter.write(cityData.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}