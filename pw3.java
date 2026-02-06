import java.io.*;
import java.util.Scanner;

public class pw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

        int number=scanner.nextInt();
        
        int hours=number/3600;
        int minutes=(number%3600)/60;
        int seconds=number%60;

        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
        
    }
}