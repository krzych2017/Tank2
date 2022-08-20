package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {

    private final List <Tank> tanks = new ArrayList<>();
    private final Map<Integer,Tank> numbersTank = new HashMap<>();



    public void addTank(){
        System.out.println("Enter a size of tank (liters) : " );
        double howManyVolume = CheckValue.getDoubleValue();
        System.out.println("Enter the amount of liquid of the tank (liters) : ");
        double howManyLiquid = CheckValue.getDoubleValue();
            if(howManyVolume>=howManyLiquid){

                int numberTank = tanks.size()+1;
                Tank tank = new Tank(howManyVolume, howManyLiquid, numberTank);
                tanks.add(tank);
                numbersTank.put(numberTank,tank);
            }

            else
                System.out.println("Too small tank !!!");
    }

    public void displayTank(){
        for(Tank tank : tanks){
            tank.displayTankInfo();
            System.out.println();
        }
    }

    public void addFluidTank(){

        double diferenceLiquid;
        double addFluid;

        System.out.println("Select the tank number: ");
        int number = CheckValue.getIntValue();
        Tank tank = numbersTank.get(number);

            if (tank==null)
                System.out.println("Bad select");
            else {
                diferenceLiquid= tank.getHowManyVolume()-tank.getHowManyLiquid();
                System.out.println("You can add " + diferenceLiquid + " in the tank nr " + number);
                System.out.println("How much liquid do you want to add to the tank??");
                addFluid = CheckValue.getDoubleValue();
                if (addFluid <= diferenceLiquid)
                    tank.setHowManyLiquid(tank.getHowManyLiquid()+addFluid);
                else
                    System.out.println("too much !!!");


            }
    }

}
