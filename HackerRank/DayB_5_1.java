import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
abstract class Food{
    double proteins;
    double fats;
    double carbs;
    double tastyScore;
    public abstract void getMacroNutrients();
}

class Egg extends Food{
    Egg(double proteins, double fats, double carbs){
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }
    int tastyScore = 7;
    String type = "non-vegetarian";

    public void getMacroNutrients(){
        System.out.println("An egg has " +proteins+ " gms of protein, " +fats+ " gms of fats and " +carbs+ " gms of carbohydrates.");
    }
}

class Bread extends Food{
    Bread(double proteins, double fats, double carbs){
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }
    int tastyScore = 8;
    String type = "vegetarian";

    public void getMacroNutrients(){
        System.out.println("A slice of bread has " +proteins+ " gms of protein, " +fats+ " gms of fats and " +carbs+ " gms of carbohydrates.");
    }
}

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cnt; i++) {
            String name = sc.nextLine();

            if(name.equals("Bread")) {
                Bread breadObj = new Bread(4, 1.1, 13.8);
                for(int j = 0; j < 3; j++) {
                    String command = sc.nextLine();
                    if(command.equals("getMacros")) {
                        breadObj.getMacroNutrients();
                    } else if(command.equals("getTaste")) {
                        System.out.println("Taste: " + breadObj.tastyScore);
                    } else if(command.equals("getType")) {
                        System.out.println("Bread is " + breadObj.type);
                    }
                }
            } else if (name.equals("Egg")) {
                Egg eggObj = new Egg(6.3, 5.3, 0.6);
                for(int j = 0; j < 3; j++) {
                    String command = sc.nextLine();
                    if(command.equals("getMacros")) {
                        eggObj.getMacroNutrients();
                    } else if(command.equals("getTaste")) {
                        System.out.println("Taste: " + eggObj.tastyScore);
                    } else if(command.equals("getType")) {
                        System.out.println("Egg is " + eggObj.type);
                    }
                }
            }
        }
    }
}
