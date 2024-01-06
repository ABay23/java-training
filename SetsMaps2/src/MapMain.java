import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args){
        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");

        List<Contact> newData = new ArrayList<>(phones);
        newData.addAll(emails);
        newData.forEach(System.out::println);
        System.out.println("----------------------------------------");

        Map<String, Contact> contacts = new HashMap<>();

        for(Contact contact: newData){
            contacts.put(contact.getName(), contact);
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + " , value= " + v));

        System.out.println("-----------------------------------");
        System.out.println(contacts.get("Charlie Brown"));

        Contact defaultContact = new Contact("Potato");
        System.out.println(contacts.getOrDefault("Dora", defaultContact));

        System.out.println("------------------------");
        contacts.clear();
        for (Contact contact : newData){
            Contact duplicate = contacts.put(contact.getName(), contact);
            if(duplicate != null){
//                System.out.println("Duplicate: " + duplicate);
//                System.out.println("Current: " + contact);
            contacts.put(contact.getName(), contact.mergeContactData(duplicate));
            }
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + " , value= " + v));
        System.out.println("------------------------");
        contacts.clear();

        for (Contact contact : newData){
            contacts.putIfAbsent(contact.getName(), contact);
            }
        contacts.forEach((k, v) -> System.out.println("key=" + k + " , value= " + v));
    }
}
