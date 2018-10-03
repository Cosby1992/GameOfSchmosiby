import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {



        String manual = "the intro";
        boolean game = true;
        int time = 1600;
        Player player = new Player(100,0,"");

        while(game!=false){




            Scanner scan = new Scanner(System.in);

            switch(manual){

                case "the intro":
                    System.out.println("Welcome to the Joben correctional facility.");
                    System.out.println("\nAs a procedure i need to know your name:");
                    player.setName(scan.nextLine());
                    System.out.println("\nOkay mr. "+player.getName());
                    System.out.println("\nenjoy your stay.");
                    manual = "joben";
                    break;


                case "joben":
                    System.out.println("The time is "+ time);
                    System.out.println("Bed time is from 2000-0800");
                    System.out.println("What would you like to do?");
                    scan.nextLine();



                    break;

                default:

                    System.out.println(scan + " is not an option");

                    break;





            }
            System.out.println(player.toString());

        }





    }
}
