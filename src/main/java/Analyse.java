import java.io.File;
import java.util.*;

public class Analyse {

        private File file;
        private Map<String, Set<Country>> map; // Continent, set of countries


        public Analyse(String fileName){
            this.map = new TreeMap(); // nøgler sorteres
            this.file = new File(fileName);
        }


        public Map<String, Set<Country>> getMap() {
            return map;

        }


        public void readFile() {

            try {
                Scanner sc = new Scanner(file);
                sc.nextLine();
                while (sc.hasNextLine()) {
                    String linje = sc.nextLine();
                    String[] attributes = linje.split(";");
                    Country country = new Country(
                            attributes[0],
                            Integer.parseInt(attributes[1]),
                            attributes[2],
                            Integer.parseInt(attributes[3]),
                            Integer.parseInt(attributes[4])

                    );

                    System.out.println("Printer alle indlæste countries");
                    System.out.println(country.toString());

                    if (!map.containsKey(country.getContinent())) {
                        map.put(country.getContinent(), new TreeSet<Country>(List.of(country)));
                    } else {
                        map.get(country.getContinent()).add(country);

                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }





        public Map<String, Integer> totalCasesPrContinent() {

            // TODO
            // Metoden skal returnere et map, der indeholder “continent” som nøgle
            // og det samlede antal tilfælde for hvert kontinent som værdi


            Iterator<String> iterate = map.keySet().iterator();


            Map<String, Integer> totalCasesPrContinent = new HashMap<>();

            return totalCasesPrContinent;
        }


}
