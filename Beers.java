import java.util.Scanner;

public class Beers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of hours in your trip:");
        int hours = sc.nextInt();
        System.out.println("Now the minutes:");
        int minutes = sc.nextInt();
        int beers = (((hours * 60) * 60) / 8) + ((minutes * 60) / 8);
        sc.close();
        System.out.println("On a trip that is " + hours + " hours and " + minutes + " minutes long, there are " + beers + " bottles of beer on the wall (with a margin of error of about 8), assuming your tempo is 120bpm.");
        System.out.println("Start counting.");
    }

}
