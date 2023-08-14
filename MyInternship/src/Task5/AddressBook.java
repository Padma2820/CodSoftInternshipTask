package Task5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	   private List<Contact> contacts;
	    private String dataFilePath;

	    public AddressBook(String dataFilePath) {
	        this.dataFilePath = dataFilePath;
	        contacts = new ArrayList<>();
	        try {
	            loadContacts();
	        } catch (IOException e) {
	            System.out.println("Error loading contacts from file. Creating a new file...");
	            createDataFile();
	        }
	    }
	    
	    private void createDataFile() {
	        try {
	            File file = new File(dataFilePath);
	            if (file.createNewFile()) {
	                System.out.println("File created: " + dataFilePath);
	            } else {
	                System.out.println("File already exists: " + dataFilePath);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public void addContact(Contact contact) throws IOException {
	        contacts.add(contact);
	        saveContacts();
	    }

	    public void removeContact(String name) throws IOException {
	        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
	        saveContacts();
	    }

	    public Contact searchContact(String name) {
	        for (Contact contact : contacts) {
	            if (contact.getName().equalsIgnoreCase(name)) {
	                return contact;
	            }
	        }
	        return null;
	    }

	    public void displayAllContacts() {
	        for (Contact contact : contacts) {
	            System.out.println(contact);
	        }
	    }
	    
	    private void loadContacts() throws IOException {
	        FileReader fileReader = new FileReader(dataFilePath);
	        Scanner scanner = new Scanner(fileReader);
	        
	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            String[] parts = line.split(",");
	            String name = parts[0];
	            String phoneNumber = parts[1];
	            String emailAddress = parts[2];
	            contacts.add(new Contact(name, phoneNumber, emailAddress));
	        }
	        
	        scanner.close();
	        fileReader.close();
	    }
	    
	    private void saveContacts() throws IOException {
	        FileWriter fileWriter = new FileWriter(dataFilePath);
	        PrintWriter printWriter = new PrintWriter(fileWriter);
	        
	        for (Contact contact : contacts) {
	            printWriter.println(contact.getName() + "," + contact.getPhoneNumber() + "," + contact.getEmailAddress());
	        }
	        
	        printWriter.close();
	        fileWriter.close();
	    }


}
