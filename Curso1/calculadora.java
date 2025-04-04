import java.util.Scanner;

public class calculadora {

    public static void main (String []args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int first = keyboard.nextInt();

        System.out.println("Enter the 2nd number");
        int second = keyboard.nextInt();

        System.out.println("Enter the operator");
        if(keyboard.hasNextLine()){
            keyboard.nextLine();
        }
        String operator = keyboard.nextLine();

        int result = 0;

        switch (operator){

            case "+":
                result = first + second;
                break;

            case"-":
                result = first - second;
                break;

            case "*":
                result = first * second;
                break;

            case "/":
                result = first / second;
                break;
            default:
                System.out.println("Operator invalid");
        }
        System.out.println("The answer is: " +result);
    }
}
