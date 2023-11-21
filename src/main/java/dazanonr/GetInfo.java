package dazanonr;

import java.util.Scanner;

public class GetInfo implements Runnable
{
    private String city;
    private double population,surface;
    CityData cityData;

    Scanner scanner = new Scanner(System.in);

    public GetInfo(CityData cityData) {this.cityData = cityData;}

    public void run()
    {
        System.out.println("Introduce ciudad");
        this.city = scanner.nextLine();
        System.out.println("Introduce habitantes");
        this.population = scanner.nextDouble();
        System.out.println("Introduce superficie");
        this.surface = scanner.nextDouble();
        this.cityData.setCity(this.city);
        this.cityData.setPopulation(this.population);
        this.cityData.setSurface(this.surface);
        this.cityData.calculateProjection();
        this.cityData.calculateOccupiedSurface();
        System.out.println(this.cityData.toString());
    }
}