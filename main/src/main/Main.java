package main;

public class Main {
    public static void main(String[] args) {

        boolean shouldContinue = true;
        Program program = new Program();

        while (shouldContinue){
            System.out.printf("Entry a value :");
            System.out.printf("1. Add new tank");
            System.out.printf("2. Add fluid to the tank");
            System.out.printf("3. Pour out of the tank");
            System.out.printf("4. Transfer fluid with tank to the tank ");
            System.out.printf("5. Edit size the tank");
            System.out.printf("6. Delete tank");
            System.out.printf("7. Display all tank");
            System.out.printf("8. Find tank ....(submenu)");
            System.out.printf("0. quit ");

            int choice = CheckValue.getIntValue();
            switch (choice){
                case 1 ->
                case 2 ->
                case 3 ->
                case 4 ->
                case 5 ->
                case 6 ->
                case 7 ->
                case 8 ->
                case 0 ->
            }
        }
    }
}
