import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Analyse analyse = new Analyse("covid19liste.csv");
        analyse.readFile();

        System.out.println(analyse.totalCasesPrContinent());

        System.out.println("Print alle ud efter key/continent");

        for (String key : analyse.getMap().keySet()) {
            System.out.println(key);
            TreeSet<Country> continents = key;

            for (Country c : analyse.getMap().get(key)) {
                System.out.println(c);
            }
            //System.out.println(analyse.getMap().get(key));
        }

    }

}
