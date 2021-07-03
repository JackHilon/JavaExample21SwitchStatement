package javaexample21switchstatement;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaExample21SwitchStatement {

    public static void main(String[] args) {

        
        Scanner in = new Scanner(System.in);
        int key1 = GetInteger(in);

        switch (key1) {
            case 1:
                System.out.println("The number is one. ");
                break;
            case 2:
                System.out.println("The number is two. ");
                break;
            case 3:
                System.out.println("The number is three. ");
                break;
            case 4:
                System.out.println("The number is four. ");
                break;
            default:
                System.out.println("Not one. Not two. Not three. Not four.");
                break;
        }// end switch
        in.nextLine();
        System.out.println();

        String str = GetString(in);
        switch (str) {
            case "one":
                System.out.println("Number one");
                break;
            case "two":
                System.out.println("Number two");
                break;
            case "three":
                System.out.println("Number three");
                break;
            case "four":
                System.out.println("Number four");
            default:
                System.out.println("Number !!!!!!!!!!!!!!!");
                break;
        }

        
        System.out.println();
        
        ChoseYourCharacter(); 
        
        in.close(); // you must close it after using the input-stream-reader
    } // end main
    
    private static void ChoseYourCharacter()
    {
        char chose = GetChar();
        switch (chose) {
            case 'a':
                System.out.println("Small letter a.");
                break;
            case 'b':
                System.out.println("Small letter b.");
                break;
            case 'c':
                System.out.println("Small letter c.");
                break;
            case 'd':
                System.out.println("Small letter d.");
                break;
            case 'e':
                System.out.println("Small letter e.");
                break;
            case 'f':
                System.out.println("Small letter f.");
                break;
            case 'g':
                System.out.println("Small letter g.");
                break;
            default:
                System.out.println("Not a b c d e f g ..... another letter, another case or another character!");
                break;
        }// end switch
    }

    private static char GetChar() {
        
        try(InputStreamReader inReader = new InputStreamReader(System.in);) {
            System.out.print("Enter your character: ");
            int a = inReader.read();
            char res = (char) a;
        return res;
    }// end try 
    catch (IOException e) {
            System.out.println(e.toString());
        return GetChar();
    }// end catch
}

private static String GetString(Scanner input) {
        String a = " ";
        System.out.print("Enter a string: ");
        try {
            a = input.nextLine();
            return a;
        } catch (Exception e) {
            System.out.println(e.toString());
            return GetString(input);
        }
    }

    private static int GetInteger(Scanner input) {
        int a = 0;
        System.out.print("Enter an integer: ");
        try {
            a = input.nextInt();
            return a;
        } catch (Exception e) {
            input.nextLine();
            System.out.println(e.toString());
            return GetInteger(input);
        }
    }
}
