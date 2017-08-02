import java.io.Console;

public class Triangles {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Enter the first lenght of the triangle");
        String stringLength = console.readLine();
        int length = Integer.parseInt(stringLength);
        String firstLength = Integer.toString(length);
        System.out.println("Good job, here's your first lenght: " + firstLength);
        
        System.out.println("Great, now enter your second length of the triangle");
        String stringSecondLength = console.readLine();
        int secondLength = Integer.parseInt(stringSecondLength);
        String lengthTwo = Integer.toString(secondLength);
        System.out.println("Awesome, here's your second length: " + lengthTwo);
        
        System.out.println("Almost done, now enter your third length of the triangle");
        String stringThirdLength = console.readLine();
        int thirdLength = Integer.parseInt(stringThirdLength);
        String lengthThree = Integer.toString(thirdLength);
        System.out.println("Cool, here's your final length: " + lengthThree);
    
    }
}