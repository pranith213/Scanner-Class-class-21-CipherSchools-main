import java.util.Scanner;

public class ScannerStudy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String firstName = sc.nextLine();//it will take input till a space occurs
        System.out.print("Please enter your last name: ");
        String lastName = sc.nextLine();
        System.out.print("Please enter your profession: ");
        String profession = sc.next();
        System.out.print("Please enter your address: ");
        String address = sc.nextLine();
        System.out.print("Please enter your house number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.print("Please enter your average percentage: ");
        float percentage = Float.parseFloat(sc.nextLine());
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Profession: " + profession);
        System.out.println("Address: " + address);
        System.out.println("House Number: " + number);
        System.out.println("Percentage: " + percentage);

        //Whenever we need to take mixed inputs like
        //1.Numbers and Strings bothe are there
        //2.Words from a single lin ethen complete next line or something like that
        //-> use nextLine and parse the data
        sc.close();
    }
}
