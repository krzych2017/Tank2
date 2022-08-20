package main;

import java.util.Scanner;

public class CheckValue {

    public static int getIntValue(){

        boolean a=false;
        int number;

        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a value: ");
            String data = scan.nextLine();

            try{
                number=Integer.parseInt(data);
            }

            catch (NumberFormatException e){
                number = 0;
                System.out.println("Bad value!!! ");
            }

            if(number != 0){
                a=true;
            }
        }
        while (!a);
        return number;
    }

    public static double getDoubleValue(){

        boolean a=false;
        double number;

        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a value:");
            String data = scan.nextLine();

            try{
                number = Double.parseDouble(data);
            }

            catch (NumberFormatException e){
                number = 0;
                System.out.println("Bad value!!!");
            }
            if (number!= 0)
                a=true;
        }
        while (!a);
        return number;
    }
}
