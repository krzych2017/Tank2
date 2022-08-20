package main;

public class Main {
    public static void main(String[] args) {

        boolean shouldContinue = true;
        Program program = new Program();

        while (shouldContinue){
            System.out.println("________________________________________________");
            System.out.println("|               Entry a value :                |");
            System.out.println("|  1. Add new tank                             |");
            System.out.println("|  2. Add fluid to the tank                    |");
            System.out.println("|  3. Pour out of the tank                     |");
            System.out.println("|  4. Transfer fluid with tank to the tank     |");
            System.out.println("|  5. Edit size the tank                       |");
            System.out.println("|  6. Delete tank                              |");
            System.out.println("|  7. Display all tank                         |");
            System.out.println("|  8. Find tank ....(submenu)                  |");
            System.out.println("|  0. quit                                     |");
            System.out.println("|______________________________________________|");
            int choice = CheckValue.getIntValue();
            switch (choice) {
                case 1 -> program.addTank();
                case 2 -> program.addFluidTank();
                case 3 -> program.pourOut();
                case 4 -> program.transfer();
                case 5 -> program.editTank();
                case 6 -> program.deleteTank();
                case 7 -> program.displayTank();

            }
        }
    }
}
