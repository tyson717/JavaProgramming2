package day08_tenary_switch;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 3;
        boolean validFloor = floorNumber >= 1 && floorNumber <= 3;
        String result = "";
        if (validFloor) {
            if (floorNumber == 1) {
                result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            } else if (floorNumber == 2) {
                result = " Floor 2 selected. Companies: Cydeo, NASA, Intelsat";
            } else {
                result = "Floor 3 selected. Companies: Lyft BofA, Stakehouse";
            }

        } else {
            result = "INVALID FLOOR - " + floorNumber;
        }
        System.out.println("result = " + result);

        /* int floorNumber = 2;

        if(floorNumber >= 1 && floorNumber <= 3){
            if(floorNumber == 1){
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            }else if(floorNumber == 2){
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            }else{
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }
        }else{
            System.out.println("Invalid floor");
        }


   String  result = "Invalid floor";

        if(floorNumber >= 1 && floorNumber <= 3){

            result = "Floor "+floorNumber+" is selected. Companies: ";

            if(floorNumber == 1){
                result += "Lobby, Verizon, Starbucks";
            }else if(floorNumber == 2){
                result += "Cydeo, NASA, Intelsat";
            }else{
                result += "Lyft, BofA, Stake house";
            }
        }

        System.out.println(result);*/
    }
}
