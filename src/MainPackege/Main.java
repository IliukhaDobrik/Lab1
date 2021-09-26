package MainPackege;

import java.lang.annotation.Documented;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Food[] breakfast = new Food[20];

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
            if (parts[0].equals("Cheese"))
                breakfast[count_breakfast] = new Cheese();
            else if (parts[0].equals("Apple"))
                breakfast[count_breakfast] = new Apple();
            else if (parts[0].equals("Sandwich"))
                breakfast[count_breakfast] = new Sandwich(parts[1], parts[2]);
            else throw new ClassNotFoundException("We don't have this food :(");
            count_breakfast++;
        }

        //Consume all food
        for (Food food:breakfast) {
            if (food != null)
                food.consume();
            else break;
        }

        if (calories_needed)
            CalculateCalories(breakfast);

        if (sort_needed)
            Sort(breakfast);

        System.out.println("Good day!");
    }

    public static void Sort(Food[] breakfast) {
        Arrays.sort(breakfast, new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                if (o1.get_name().length() > o2.get_name().length())
                    return 1;
                else return -1;
            }
        });
    }

    public static void CalculateCalories(Food[] breakfast){
        int calories = 0;

        for (int i = 0;i < breakfast.length;i++){
            calories+=breakfast[i].calculateCalories();
        }

        System.out.println("Calorie content: " + calories);
    }
}
