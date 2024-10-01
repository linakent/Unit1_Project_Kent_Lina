import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner (System.in);
        System.out.println("Note: Don't use any symbols when inputting data");
        System.out.println("Enter your bill($):");
        String x = s.nextLine();
        double billTotal = Double.parseDouble(x);

        System.out.println("Enter your tip percentage:");
        String y = s.nextLine();
        int tipPercent = Integer.parseInt(y);

        System.out.println("Enter the number of people:");
        String z = s.nextLine();
        int numPeople = Integer.parseInt(z);


        double tipTotal = (tipPercent * 0.01) * billTotal;
        double billWithTip = billTotal + tipTotal;
        double tipPerPerson = tipTotal / numPeople;
        double billPerPerson = billWithTip / numPeople;

        System.out.println("Total tip amount: $" + tipTotal);
        System.out.println("Total bill cost: $" + billWithTip);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total bill per person: $" + billPerPerson);





    }
}