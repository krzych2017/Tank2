package main;

public class Tank {

    private double howManyVolume;
    private double howManyLiquid;
    private double numberTank;

    public double getHowManyVolume() {
        return howManyVolume;
    }

    public void setHowManyVolume(double howManyVolume) {
        this.howManyVolume = howManyVolume;
    }

    public double getHowManyLiquid() {
        return howManyLiquid;
    }

    public void setHowManyLiquid(double howManyLiquid) {
        this.howManyLiquid = howManyLiquid;
    }

    public void displayTankInfo(){
         System.out.println("The tank " + numberTank + " has a capacity of " + howManyVolume + "L and contains " + howManyLiquid + " L of fluid" ) ;
     }

     public Tank(double howManyVolume, double hopublic Tank(double howManyVolume, double howManyLiquid, int numbetTank) {
        this.howManyVolume = howManyVolume;
        this.howManyLiquid = howManyLiquid;
        this.numberTank =numbetTank;
    }
    }

