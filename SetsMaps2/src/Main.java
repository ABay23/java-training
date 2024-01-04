import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("Email List", emails);
        printData("Phone List", phones);

        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);
        printData("Email List Hash:",emailContacts);
        printData("Phone List Hash:", phoneContacts);

        int index = emails.indexOf(new Contact("Robin Hood"));
        Contact robinHood = emails.get(index);
        robinHood.addEmail("Sherwood Forest");
        robinHood.addEmail("Sherwood Forest");
        robinHood.replaceEmailIfExists("RHood@caca.com", "RHood@poop.org");
        System.out.println(robinHood);

        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("(A ∪ B) Union of emails (A) with phones (B)", unionAB);

        Set<Contact> intersectAB = new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts);
        printData("(A ∩ B) Intersect emails (A) with phones (B)", intersectAB);

    }

    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("------------------------------------");
        System.out.println(header);
        System.out.println("------------------------------------");
        contacts.forEach(System.out ::println);
    }
}

