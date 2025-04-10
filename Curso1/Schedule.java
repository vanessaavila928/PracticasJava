import  java.util.Scanner;


public class Schedule {

    public static void main(String []args) {

        Scanner keyboard = new Scanner(System.in);

        int dayOfTheWeek;
        int subChoice;
        int language;
        int design;
        int ide;
        int chill;
        int movie;

        System.out.println("""
    ********** MENU *****************
    These are the choices for week of the day.
    Please enter only values from 1-7:
    1. MONDAY
    2. TUESDAY
    3. WEDNESDAY
    4. THURSDAY
    5. FRIDAY
    6. SATURDAY
    7. SUNDAY
    """);


        System.out.println("Enter your day (1-7):");
        dayOfTheWeek = keyboard.nextInt();


        switch (dayOfTheWeek) {
            case 1:

                System.out.println(""" 
                        *********** SUB MENU FOR MONDAY *********
                        1. Yes, I had my breakfast
                        2. No, I would like one
                        *****************************************
                        """);
                System.out.println("Choice a option:");
                subChoice= keyboard.nextInt();
                if (subChoice==1){
                    System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes");
                } else if (subChoice==2){
                    System.out.println(" Lets us divert on Highway 54 and have a Burger on the drive in");
                }else {
                    System.out.println(" NO such choice available");
                }
                break;
            case 2:
                System.out.println(""" 
                        Which language are you gonna use:
                        1. C++
                        2. Java
                        """);
                language = keyboard.nextInt();
                switch (language) {
                    case 1:
                        System.out.println("C++");
                        break;
                    case 2:
                        System.out.println("Java");
                        break;
                    default:
                        System.out.println("No option available");
                }break;
            case 3:
                System.out.println("""
                        Which type of desing:
                        1. Simple Design
                        2. Complex Design
                        """);
                design = keyboard.nextInt();
                if (design== 1){
                    System.out.println("Simple Desing");
                } else if (design == 2){
                    System.out.println("Complex Design");
                } else {
                    System.out.println("NO such choice available");
                }
                break;
            case 4:
                System.out.println("""
                        Choose the IDE:
                        1. IntelliJ
                        2. Eclipse
                        3. VS Code
                        """);
                ide = keyboard.nextInt();
                switch(ide){
                    case 1:
                        System.out.println("ItelliJ");
                        break;
                    case 2:
                        System.out.println("Eclipse");
                        break;
                    case 3:
                        System.out.println("VS Code");
                        break;
                    default:
                        System.out.println("No option available");
                }
                break;
            case 5:
                System.out.println("""
                        Where you will go to chill
                        1. at home
                        2. in a bar
                        3. with friends
                        4.at a nightclub
                        """);
                chill = keyboard.nextInt();
                if (chill ==1){
                    System.out.println("at home");
                } else if (chill ==2){
                    System.out.println("in a bar");
                }else if (chill ==3){
                    System.out.println("with friends");
                }else if (chill ==4){
                    System.out.println("at a nightclub");
                } else {
                    System.out.println("No option available");
                }
                break;
            case 6:
                System.out.println("""
                        Which movie are you going to watch
                        1. The notebook
                        2. Avengers
                        3. Spiderman
                        """);
                movie = keyboard.nextInt();
                switch (movie){
                    case 1:
                        System.out.println("Lets watch the notebook");
                        break;
                    case 2:
                        System.out.println("Lets watch Avengers");
                        break;
                    case 3:
                        System.out.println("Lets watch Spiderman");
                        break;
                    default:
                        System.out.println("No option available");
                }
                break;
            case 7:
                System.out.println("Sunday: Go to the park with luffy");
                break;

            default:
                System.out.println("number invalid");
        }

    } //end of main method

}