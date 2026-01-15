package wk2;
import java.util.Scanner;
public class Week2 {

    static Scanner input = new Scanner(System.in);


    //main+tab
    public static void main(String[] args) {

        makingDecisions2();
        //System.out.println(validateAgeValue("100abc"));
   }
    static boolean validateAgeValue(String value){

        //foreach loop in Java aka Enhanced For Loop
        //for(datatype placeHolder : collectionOfValues)

        for(char c : value.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }

        return true;
    }

    static void makingDecisions(){
        //create a program that ask user for age
        //outputs which age category they belong to
        // < 5 => enfant
        // 5-12 => child
        // 13-17 => teen
        //18-64 => adult
        // 65+ => senior
        //using both if statements and switch statements

        System.out.println("Enter your age: ");
        String answer = input.nextLine();  //gets the input as a string
        if(!validateAgeValue(answer)){
            //serr+tab
            System.err.println("Invalid age inputted");
            return;  //end the method execution
        }
        int age = Integer.parseInt(answer);

        if(age < 5) System.out.println("Enfant");
        else if(age < 13)
            System.out.println("Child");
        else if (age < 18) {
            System.out.println("Teen");
        }
        else if (age < 65) System.out.println("Adult");
        else{
            System.out.println("Elder");
        }
        System.out.println( "*".repeat(10) );
       }

    static void makingDecisions2(){

        //ask the user for their age category
        //output their age range

        System.out.println("Enter age category: ");
        String answer = input.nextLine();

        String result = switch (answer.toLowerCase()){
            case "enfant" -> "0-4";
            case "child" -> "5-12";
            case "teen" -> "13-17";
            case "adult" -> "18-64";
            case "elder" -> "65+";
            default -> "unknown";
        };
        System.out.printf("Based on your age category of %s, your age range is %s\n", answer, result);
    }



}
