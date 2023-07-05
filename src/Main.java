import deeman.Contact;
import deeman.ContactData;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Contact> phoneData = ContactData.getData("phone");
        List<Contact> emailData = ContactData.getData("email");

        printData("Phone Data", phoneData);
        printData("Email Data", emailData);

        Set<Contact> phoneContacts = new HashSet<>(phoneData);
        Set<Contact> emailContacts = new HashSet<>(emailData);

        printData("Phone Contacts", phoneContacts);
        printData("Email Contacts", emailContacts);

        int index = emailData.indexOf(new Contact("Robin Hood"));
        Contact robinHood = emailData.get(index);
        robinHood.addEmail("Sherwood Forest");
        robinHood.addEmail("Sherwood Forest");
        robinHood.replaceEmailIfExists("RHood@sherwoodforest.com", "RHood@sherwoodforest.org ");
        System.out.println(robinHood);

        // Union Symmetric Operations
        Set<Contact> unionContactsAB = new HashSet<>();
        unionContactsAB.addAll(emailContacts);
        unionContactsAB.addAll(phoneContacts);
        printData("(A \u222A B) Unions of Emails (A) OR Phones (B)", unionContactsAB);

        // Intersect Symmetric Operations
        Set<Contact> interSectContactsAB = new HashSet<>(emailContacts);
        interSectContactsAB.retainAll(phoneContacts);
        printData("(A \u2229 B) Intersect of Emails (A) AND  Phones (B)", interSectContactsAB);

        // Subtract A - B
        Set<Contact> AMinusBContacts = new HashSet<>(emailContacts);
        AMinusBContacts.removeAll(phoneContacts);
        printData("(A - B) Emails (A) - Phones (B)", AMinusBContacts);

        // Subtract B - A
        Set<Contact> BMinusAContacts = new HashSet<>(phoneContacts);
        BMinusAContacts.removeAll(emailContacts);
        printData("(B - A) Phones (B) - Emails (A)", BMinusAContacts);

        // Symmetric Difference method1
        Set<Contact> symmetricDiff1 = new HashSet<>(AMinusBContacts);
        symmetricDiff1.addAll(BMinusAContacts);
        printData("Symmetric Difference Contacts, Emails", symmetricDiff1);

        // Symmetric Difference method1
        Set<Contact> symmetricDiff2 = new HashSet<>(unionContactsAB);
        symmetricDiff2.removeAll(interSectContactsAB);
        printData("Symmetric Difference Contacts, Emails", symmetricDiff2);


    }

    public static void printData(String header, Collection<Contact> contacts) {
        System.out.println("-----------------------------");
        System.out.println(header);
        System.out.println("------------------------------");
        contacts.forEach(System.out::println);
    }
}