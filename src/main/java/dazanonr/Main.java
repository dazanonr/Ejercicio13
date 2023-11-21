package dazanonr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main (String [] args)
    {
        Thread mainThread = new Thread(new GetInfo());
        mainThread.start();
    }


    static class GetInfo implements Runnable
    {
        private String city;
        private double population,surface;

        Scanner scanner = new Scanner(System.in);

        public void run()
        {
            System.out.println("Introduce ciudad");
            this.city = scanner.nextLine();
            System.out.println("Introduce habitantes");
            this.population = scanner.nextDouble();
            System.out.println("Introduce superficie");
            this.surface = scanner.nextDouble();
            CityData cityData = new CityData(this.city,this.population,this.surface);
            Thread directoryThread = new Thread(new Main.CreateDirectory());
            directoryThread.start();
            Thread writeDocumentThread = new Thread(new WriteDocument(cityData));
            try {
                writeDocumentThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class CreateDirectory implements Runnable{
        public void run() {
            File file = new File("C:\\Users\\dazanonr\\Documents\\CityData");
            file.mkdirs();
        }
    }

    public static class WriteDocument implements Runnable{

        CityData cityData;

        public WriteDocument(CityData cityData) {this.cityData = cityData;}

        public void run() {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(
                        new FileWriter(
                                new File("C:\\Users\\dazanonr\\Documents\\CityData\\city_data.txt"),
                                true));
                bufferedWriter.newLine();
                bufferedWriter.write(this.cityData.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}