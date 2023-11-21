package dazanonr;

public class CityData implements Operations{

    private String city;
    private double population, surface, projection, occupiedSurface;

    public CityData() {}

    public CityData(String ciudad, double cantidadHabitantes, double superficie) {
        this.city = ciudad;
        this.population = cantidadHabitantes;
        this.surface = superficie;
        this.calculateProjection();
        this.calculateOccupiedSurface();
    }

    @Override
    public void calculateProjection() {this.setProjection(this.getPopulation()*0.9);}

    @Override
    public void calculateOccupiedSurface() {this.setOccupiedSurface(this.getSurface()+10000);}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double getProjection() {
        return projection;
    }

    public void setProjection(double projection) {
        this.projection = projection;
    }

    public double getOccupiedSurface() {
        return occupiedSurface;
    }

    public void setOccupiedSurface(double occupiedSurface) {
        this.occupiedSurface = occupiedSurface;
    }

    @Override
    public String toString() {
        return "CityData{" +
                "city='" + city + '\'' +
                ", population=" + population +
                ", surface=" + surface +
                ", projection=" + projection +
                ", occupiedSurface=" + occupiedSurface +
                '}';
    }
}