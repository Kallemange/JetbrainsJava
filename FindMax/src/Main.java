import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("src\\dataset_91069.txt");

        try(Scanner s = new Scanner(file)){
            int year = 0;
            long currPopulation;
            long previousPopulation = Long.MAX_VALUE;
            long populationIncrease;
            long maxIncrease = 0;
            String[] line = new String[2];
            String x =s.nextLine();
            while (s.hasNext()){
                line = s.nextLine().split("\\s+");
                currPopulation = Long.parseLong(line[1].replaceAll(",",""));
                populationIncrease = currPopulation - previousPopulation;
                if (populationIncrease > maxIncrease) {
                    maxIncrease = populationIncrease;
                    year = Integer.parseInt(line[0]);
                }
                previousPopulation = currPopulation;

            }
            System.out.println(maxIncrease + " " + year);
        }
        catch (FileNotFoundException e){
            System.out.println("no file found");
        }
        catch (Exception e){
            System.out.println("other issue");
        }
    }
}
