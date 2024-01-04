import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class treeSetMain {
    public static void main(String[] args){
        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        Comparator<Contact> sortData = Comparator.comparing(Contact::getName);
        NavigableSet<Contact> sorted = new TreeSet<>(sortData);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

    }
}
