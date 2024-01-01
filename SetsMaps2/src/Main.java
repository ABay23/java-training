import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("Email List", emails);
        printData("Phone List", phones);

    }

    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("------------------------------------");
        System.out.println(header);
        System.out.println("------------------------------------");
        contacts.forEach(System.out ::println);
    }
}

