import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ContactDriver {
	public static void main(String[]args) {
		//index int to store index value later
		int idx = 0;
		//explained later
		int checker = 0;
		//scanner for later
		Scanner input = new Scanner(System.in);
		//creating arraylist
		List<Contact> phonebook = new ArrayList<>();
		//adding four contacts to the array list
		phonebook.add(new Contact("Peter", 353846712348L ));
		phonebook.add(new Contact("Daniel",353858193672L ));
		phonebook.add(new Contact("Tracy", 353832151568L ));
		phonebook.add(new Contact("Brian", 353826661258L ));
		//creating a new list iterator
		ListIterator<Contact> itr = phonebook.listIterator();
		//iterating through the list forwards and printing each contact out
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		//iterating through the list backwards and printing each contact out
		while(itr.hasPrevious()) {
		System.out.println(itr.previous());
		}
		//printing the size of the array list
		System.out.println("Size of list: " +phonebook.size()+"");
		//asking for user to input a name
		System.out.println("Enter contact name: ");
		//setting a new string name to be the next input
		String name = input.next();
		//enhanced for loop to loop through phone book
		for(Contact p : phonebook) {
		//checking if the name in phonebook equals the user input name
		if(p.getName().equals(name)) {
		//if they do equal, setting the index number to be the indexOf(p)
		idx = phonebook.indexOf(p);
		checker=checker+1;
		//printing out index number
		System.out.println("Index of "+p.getName()+": "+idx+"");
		}
		}
		//So I realised that as my index value was defaulted to 0, if a name not on the list
		was entered
		//it was being deleted, this is a quickfix, if the name is on the list the checker int
		gets +1
		//and will then be caught in the loop and deleted, if not it just continues on and iterates
		//through the phonebook and prints it out
		if (checker==1) {
		//removing the contact
		phonebook.remove(idx);
		}
		//iterating through the phonebook again using enhanced for loop
		for(Contact q : phonebook) {
		//printing out toString for each entry
		System.out.println(q.toString());
		}
		}


}
