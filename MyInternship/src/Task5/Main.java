package Task5;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException  {
		 Scanner scanner = new Scanner(System.in);
	        AddressBook addressBook = new AddressBook("contacts_data.txt");

	        while (true) {
	            System.out.println("Address Book System");
	            System.out.println("1. Add Contact");
	            System.out.println("2. Remove Contact");
	            System.out.println("3. Search Contact");
	            System.out.println("4. Display All Contacts");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter contact name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter phone number: ");
	                    String phoneNumber = scanner.nextLine();
	                    System.out.print("Enter email address: ");
	                    String emailAddress = scanner.nextLine();
	                    addressBook.addContact(new Contact(name, phoneNumber, emailAddress));
	                    System.out.println("Contact added successfully.");
	                    break;
	                case 2:
	                    System.out.print("Enter contact name to remove: ");
	                    String nameToRemove = scanner.nextLine();
	                    addressBook.removeContact(nameToRemove);
	                    System.out.println("Contact removed successfully.");
	                    break;
	                case 3:
	                    System.out.print("Enter contact name to search: ");
	                    String nameToSearch = scanner.nextLine();
	                    Contact searchedContact = addressBook.searchContact(nameToSearch);
	                    if (searchedContact != null) {
	                        System.out.println("Contact found:");
	                        System.out.println(searchedContact);
	                    } else {
	                        System.out.println("Contact not found.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("All contacts:");
	                    addressBook.displayAllContacts();
	                    break;
	                case 5:
	                    System.out.println("Exiting the application.");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	}

}
