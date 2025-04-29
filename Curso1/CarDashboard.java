import java.util.Scanner;

public class CarDashboard {
        public static void main(String[] args) {

            boolean isOn = false;
            String gear = "p";
            int speed=  0;
            int choice = 0;
            Scanner keyBoard = new Scanner(System.in);


            System.out.println("--------Car Dashboard---------");
            System.out.println("Speed: " + speed);
            System.out.println("Gear: " +gear);
            System.out.println("---------------");


            System.out.println(" 1. Turn on/off the engine\n" +
                    "2. Change gear (P, D, R)\n" +
                    "3. Accelerate\n" +
                    "4. Brake\n" +
                    "5. Exit" );

            while(choice!=5){
                System.out.println("Enter your choice");
                choice = keyBoard.nextInt();
                keyBoard.nextLine();

                switch(choice){
                    case 1:
                        isOn = !isOn;
                        break;
                    case 2:
                        System.out.println("Enter gear: (P, D, R)");
                        gear = keyBoard.nextLine();
                        break;
                    case 3:
                        if(isOn && !gear.equals("p")){
                            speed +=10;
                            System.out.println("Speed: " +speed );
                        } else{
                            System.out.println("Cannot accelerate while engine is off or in Park (P) gear.\n");
                        }
                        break;
                    default:
                        System.out.println("Seleccione una opción correcta");

                }
            }

        }
    }


