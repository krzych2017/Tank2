package main;

public class Tank implements Comparable<Tank> {

    private double howManyVolume;
    private double howManyLiquid;
    private int numberTank;

    private float percent;

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
         System.out.println("****  The tank " + numberTank + " has a capacity of " + howManyVolume + "L and contains " + howManyLiquid + " L of fluid. This is " + percent + " % full ****" ) ;
     }

     public Tank(double howManyVolume, double howManyLiquid, int numberTank, float percent) {
        this.howManyVolume = howManyVolume;
        this.howManyLiquid = howManyLiquid;
        this.numberTank =numberTank;
        this.percent = percent;
    }

    @Override
    public int compareTo(Tank o) {
        int result = (int) (this.percent - o.percent);

        return result;
    }
}

