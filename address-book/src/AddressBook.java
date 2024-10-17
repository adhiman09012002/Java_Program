import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    public List<Contact> addressbookList = new ArrayList<>();

    public void addcontact(Contact contact){
        addressbookList.add(contact);
        String name = contact.getFname();
        System.out.println(name + " is added Successfully. ");
    }

    public void PrintAddressBook() {
        for(Contact contact : addressbookList ){
            System.out.println(contact);
        }
    }
}
