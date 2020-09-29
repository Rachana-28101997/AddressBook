package com.blz.addressbook;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.blz.addressbook.service.AddressBookService;
import com.blz.addressbook.service.AddressBookSeviceImpl;

public class AddressBookMain {

	public static void main(String[] args) {

		char decision;
		String bookName;
		AddressBookService service = new AddressBookSeviceImpl();

		do {
			System.out.println("************MENU************");
			System.out.println(
					"1.create Address Book\n2.Add person\n3.Display person\n4.Edit a Person\n5.Delete Person\n6.Delete AddressBook\n7.sort Entries By Name");
			System.out.println("8.sort Entries By Zip\n9.Print Entries\n10.search person in address book\n");
			System.out.print("Enter Ur Choice : ");
			Scanner scanner = new Scanner(System.in);
			int choice = 0;

			try {

				choice = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please Enter Valid Choice");
			}

			switch (choice) {
			case 1:
				System.out.print("Enter the Name of Address Book : ");
				bookName = scanner.next();
				service.createAddressBook(bookName);
				break;

			case 2:
				System.out.print("Enter the Name of Address Book : ");
				bookName = scanner.next();
				service.addPerson(bookName);
				break;

			case 3:
				System.out.print("Enter the Name of Address Book : ");
				bookName = scanner.next();
				service.displayPerson(bookName);
				break;

			case 4:
				System.out.print("Enter the Address book name : ");
				bookName = scanner.next();
				service.editPerson(bookName);
				break;

			case 5:
				System.out.print("Enter the Address book name : ");
				bookName = scanner.next();
				service.deletePerson(bookName);
				break;

			case 6:
				System.out.print("Enter the Address book name : ");
				bookName = scanner.next();
				service.deleteAddressBook(bookName);
				break;

			case 7:
				System.out.print("Enter the Address book name : ");
				bookName = scanner.next();
				service.sortEntriesByName(bookName);
				break;

			case 8:
				System.out.print("Enter the Address book name : ");
				bookName = scanner.next();
				service.sortEntriesByZip(bookName);
				break;

			case 9:
				System.out.print("Enter the Address book name : ");
				bookName = scanner.next();
				service.printEntries(bookName);
				break;

			case 10:
				System.out.println("Enter the person Name : ");
				String personName = scanner.next();
				service.searchPersonAddressBook(personName);
				break;

			default:
				System.out.println("Select number between 1 to 10");

			}
			System.out.println("Do You Want To Continue Using Address Book : Type Yes or No");
			Scanner scanner1 = new Scanner(System.in);
			decision = scanner1.next().charAt(0);
		} while (decision == 'y' || decision == 'Y');

		System.out.println("Thank you for using Address Book!");

	}

}
