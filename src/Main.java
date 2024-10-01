import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner (System.in);
        System.out.println("Note: Don't use any symbols when inputting data");
        System.out.println("Enter your bill($):");
        String x = s.nextLine();
        double billTotal = Double.parseDouble(x); // the total bill before tip

        System.out.println("Enter your tip percentage:");
        String y = s.nextLine();
        int tipPercent = Integer.parseInt(y); // the percent tip

        System.out.println("Enter the number of people:");
        String z = s.nextLine();
        int numPeople = Integer.parseInt(z); // the amount of people splitting the bill

        double tipTotal = (tipPercent * 0.01) * billTotal; // the total amount of the tip
        double billWithTip = billTotal + tipTotal; // the total bill with the tip
        double tipPerPerson = tipTotal / numPeople; // the total tip divided by the number of people
        double billPerPerson = billWithTip / numPeople; // the total bill divided by the number of people

        System.out.println("Total tip amount: $" + tipTotal);
        System.out.println("Total bill cost: $" + billWithTip);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total bill per person: $" + billPerPerson);


    }
}