
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        ContactsManager myContactManager = new ContactsManager();

        Contact richContact = new Contact();
        richContact.name = "Richard";
        richContact.phoneNumber = "06308435411";

        myContactManager.addContact(richContact);

        Contact daniContact = new Contact();
        daniContact.name = "Daniella";
        daniContact.phoneNumber = "063098765443";

        myContactManager.addContact(daniContact);

       // Contact result = myContactManager.searchContact("Daniella");
        //System.out.println(result.phoneNumber);

        System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        System.out.println("You live here:" + address);



    }
}