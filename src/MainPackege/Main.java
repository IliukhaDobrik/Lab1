package MainPackege;

import java.lang.annotation.Documented;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter amount of food: ");
        int size = in.nextInt();

        Food[] breakfast = new Food[size];

        boolean sort_needed = false;
        boolean calories_needed = false;

        //Checking arguments
        for (String arg: args){
            if (arg.equals("-calories"))
                calories_needed = true;
            else if (arg.equals("-sort"))
                sort_needed = true;
        }

        int count_breakfast = 0;
        for (String arg: args){
            String[] parts = arg.split("/");
            if (parts[0].equals("Chesse"))
                breakfast[count_breakfast] = new Cheese();
            else if (parts[0].equals("Apple"))
                breakfast[count_breakfast] = new Apple();
            else if (parts[0].equals("Sendwitch"))
                breakfast[count_breakfast] = new Sandwitch(parts[1], parts[2]);

        }


    }
}
