import java.util.Scanner;
public class ScannerStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String firstName = sc.next();//it will take input till a space occurs
        String lastName = sc.next();
        System.out.println("Please enter your profession: ");
        String profession = sc.next();
        System.out.println("Please enter your address: ");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.println("Please enter your house number: ");
        int number = sc.nextInt();
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Profession: " + profession);
        System.out.println("Address: " + address);
        System.out.println("House Number: " + number);

        //Whenever we need to take mixed inputs like
        //1.Numbers and Strings bothe are there
        //2.Words from a single lin ethen complete next line or something like that
        //-> use nextLine and parse the data
    }
}
