package dazanonr;

import java.io.File;

public class CreateDirectory implements Runnable{
    public void run() {
        File file = new File("C:\\Users\\dazanonr\\Documents\\CityData");
        file.mkdirs();
    }
}