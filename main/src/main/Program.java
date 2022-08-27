package main;

import java.util.*;

public class Program {

    private List<Tank> tanks = new ArrayList<>();
    private Map<Integer, Tank> numbersTank = new HashMap<>();


    public void addTank() {
        System.out.println("Enter a size of tank (liters) : ");
        double howManyVolume = CheckValue.getDoubleValue();
        System.out.println("Enter the amount of liquid of the tank (liters) : ");
        double howManyLiquid = CheckValue.getDoubleValue();
        if (howManyVolume >= howManyLiquid) {

            int numberTank = tanks.size() + 1;
            float percent = (float) ((howManyLiquid / howManyVolume) * 100);
            Tank tank = new Tank(howManyVolume, howManyLiquid, numberTank, percent);
            tanks.add(tank);
            numbersTank.put(numberTank, tank);
        } else
            System.out.println("Too small tank !!!");
    }

    public void addFluidTank() {

        double differenceLiquid;
        double addFluid;

        System.out.println("Select the tank number: ");
        int number = CheckValue.getIntValue();
        Tank tank = numbersTank.get(number);

        if (tank == null)
            System.out.println("Bad select");
        else {
            differenceLiquid = tank.getHowManyVolume() - tank.getHowManyLiquid();
            System.out.println("You can add " + differenceLiquid + " in the tank nr " + number);
            System.out.println("How much liquid do you want to add to the tank??");
            addFluid = CheckValue.getDoubleValue();
            if (addFluid <= differenceLiquid)
                tank.setHowManyLiquid(tank.getHowManyLiquid() + addFluid);
            else
                System.out.println("too much !!!");


        }
    }

    public void pourOut() {

        double pourOutLiquid;
        System.out.println("Select the tank number: ");
        int number = CheckValue.getIntValue();
        Tank tank = numbersTank.get(number);

        if (tank == null)
            System.out.println("Bad select");
        else {
            System.out.println("You can pour out maximal " + tank.getHowManyLiquid() + " Liters with the tank nr " + number);
            System.out.println("How much do you want pour out ? ");
            pourOutLiquid = CheckValue.getDoubleValue();
            if (pourOutLiquid >= tank.getHowManyLiquid())
                System.out.println("Too much pour out !!");
            else
                tank.setHowManyLiquid(tank.getHowManyLiquid() - pourOutLiquid);
        }
    }

    public void transfer() {
        System.out.println("Enter the number of the tank do you want to pour the liquid out of :");
        int numberTankPourOut = CheckValue.getIntValue();
        Tank tank = numbersTank.get(numberTankPourOut);
        System.out.println("Enter the number of the tank do you want to pour the liquid into");
        int numberTankPourIn = CheckValue.getIntValue();
        Tank tank2 = numbersTank.get(numberTankPourIn);

        if (tank == null && tank2 == null)
            System.out.println("Bad tank number! ");

        else {
            double differencePourOutMax = tank.getHowManyLiquid();
            double differencePourInMax = tank2.getHowManyVolume() - tank2.getHowManyLiquid();
            double transferFluid;
            double howMuchTransfer;

            if (differencePourInMax >= differencePourOutMax)
                transferFluid = differencePourOutMax;
            else
                transferFluid = differencePourInMax;

            System.out.println("You can max pour out " + differencePourOutMax + " Liters of the tank " + numberTankPourOut);
            System.out.println("You can max pour in " + differencePourInMax + "Liters of the tank " + numberTankPourIn);
            System.out.println("You can max transfer " + transferFluid);
            System.out.println("Enter how much you want to transfer ");
            howMuchTransfer = CheckValue.getDoubleValue();

            if (howMuchTransfer > transferFluid)
                System.out.println("Bad value!!");
            else {
                tank.setHowManyLiquid(tank.getHowManyLiquid() - howMuchTransfer);
                tank2.setHowManyLiquid(tank2.getHowManyLiquid() + howMuchTransfer);

            }

        }

    }

    public void editTank() {
        System.out.println("Which tak do you want edit ???");
        int numberEdit = CheckValue.getIntValue();
        Tank tank = numbersTank.get(numberEdit);
        if (tank == null)
            System.out.println("Bad tank number!!");
        else {
            System.out.println("New size of tank (liter): ");
            double newVolume = CheckValue.getDoubleValue();
            tank.setHowManyVolume(newVolume);
            System.out.println("Enter the amount of liquid of the tank");
            double newLiquid = CheckValue.getDoubleValue();
            if (newVolume <= newLiquid)
                System.out.println("Bad Value !");
            else
                tank.setHowManyLiquid(newLiquid);
        }
    }

    public void deleteTank() {

        System.out.println("Which tank do you want to delete ??");
        int deleteTank = CheckValue.getIntValue();
        Tank tank = numbersTank.get(deleteTank);
        System.out.println("Delete tank nr " + deleteTank);
        tanks.remove(deleteTank);
        numbersTank.remove(deleteTank, tank);
    }

    public void displayTank() {
        for (Tank tank : tanks) {
            tank.displayTankInfo();
            System.out.println();
        }
    }

    public void submenu() {
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("**********Sub menu*****************");
            System.out.println("*  1. Find a full tank            *");
            System.out.println("*  2. Find a empty tank           *");
            System.out.println("*  3. Sort tank (empty to full)   *");
            System.out.println("*  4. Sort tank (full to empty)   *");
            System.out.println("*  9. Back to menu                *");
            System.out.println("***********************************");
            int choice = CheckValue.getIntValue();

            switch (choice) {

                case 1 -> {
                    for (Tank tank : tanks) {
                        if (tank.getPercent() >= 100) {
                            tank.displayTankInfo();
                            System.out.println();
                        }
                    }
                }

                case 2 -> {
                    for (Tank tank : tanks) {
                        if (tank.getPercent() == 0) {
                            tank.displayTankInfo();
                            System.out.println();
                        } else
                            System.out.println("All tank have liquid");
                    }
                }

                case 3 -> {
                    Collections.sort(tanks, new Comparator<Tank>() {
                        @Override
                        public int compare(Tank o1, Tank o2) {
                            return (int) (o1.getPercent() - o2.getPercent());
                        }
                    });

                }

                case 4 -> {
                    Collections.sort(tanks, new Comparator<Tank>() {
                        @Override
                        public int compare(Tank o1, Tank o2) {
                            return -1 * (int) (o1.getPercent() - o2.getPercent());
                        }
                    });
                }

                case 9 -> shouldContinue = false;
            }
        }
    }


}


