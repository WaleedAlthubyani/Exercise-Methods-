import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*1.Write a Java method to find the smallest number among three
        numbers.*/

        System.out.println("Please enter the first number");
        int firstNumber= input.nextInt();
        System.out.println("Please enter the second number");
        int secondNumber= input.nextInt();
        System.out.println("Please enter the third number");
        int thirdNumber=input.nextInt();

        System.out.println(smallest(firstNumber,secondNumber,thirdNumber));


        /*2 - Write a Java method that check if the entered number is negative or
        positive or zero.*/
        System.out.println("Please enter a number");
        int number = input.nextInt();
        System.out.println(positiveNegativeZero(number));

        /*3 - Write a Java method to check whether a string is a valid password.
        Password rules:
        A password must have at least ten characters. A
        password consists of only letters and digits. A
        password must contain at least two digits.*/

        System.out.println("1.A password must have at least ten characters.\n2.A password consists of only letters and digits.\n3.A password must contain at least two digits.");
        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.):");
        String password = input.next();
        validPassword(password);

        input.close();
    }

    public static double smallest(double firstNumber,double secondNumber,double thirdNumber){
        if (firstNumber<secondNumber){
            if (firstNumber<thirdNumber)
                return firstNumber;
        }else if (secondNumber<thirdNumber){
            return secondNumber;
        }
            return thirdNumber;
    }

    public static String positiveNegativeZero(int number){
        if(number==0)
            return "Zero";
        else if(number>0)
            return "Positive";
        else
            return "Negative";
    }

    public static void validPassword(String password){

        if (password.length()<10)
            System.out.println("Password is not valid: " + password);
        else if (!password.replaceAll("[\\w]", "").isEmpty())
            System.out.println("Password is not valid: " + password);
        else if (password.length()-password.replaceAll("[\\d]","").length()<2)
            System.out.println("Password is not valid: " + password);
        else
            System.out.println("Password is valid: " + password);
    }
}