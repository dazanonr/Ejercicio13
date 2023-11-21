package dazanonr;
public class Main
{
    public static void main (String [] args) throws InterruptedException {

        CityData cityData = new CityData();

        for (int i = 0; i< 3; i++){
            Thread mainThread = new Thread(new GetInfo(cityData));
            Thread secondThread = new Thread(new CreateDirectory());
            Thread thirthThread = new Thread(new WriteDocument(cityData));

            mainThread.start();
            mainThread.join();

            secondThread.start();
            secondThread.join();

            thirthThread.start();
            thirthThread.join();
        }
    }
}