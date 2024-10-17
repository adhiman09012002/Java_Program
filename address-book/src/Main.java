import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("*********** Welcome to Ajay's AddressBook  ******************");

        AddressBook addressbook = new AddressBook();

        while(true){
            System.out.println("Please choose any options from below ");
            System.out.println("1. Add contact");
            System.out.println("2. Print Addressbook");
            Scanner sc = new Scanner(System.in);
            System.out.print("input : " );
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Please Enter Fname : ");
                    String fname = sc.next();
                    System.out.print("Please Enter Lname : ");
                    String lname = sc.next();
                    System.out.print("Please Enter Email : ");
                    String email = sc.next();
                    System.out.print("Please Enter Zipcode : ");
                    long zipcode = Long.parseLong(sc.next());
                    System.out.print("Please Enter phonenumber : ");
                    long phonenumber = Long.parseLong(sc.next());
                    System.out.print("Please Enter City : ");
                    String city = sc.next();
                    System.out.print("Please Enter State : ");
                    String state = sc.next();


     Contact contact = new Contact(fname, lname, email, city, state, phonenumber, zipcode);
     addressbook.addcontact(contact);
     break;
                }
                case 2 : {
                    addressbook.PrintAddressBook();
                }

            }

        }
    }
}