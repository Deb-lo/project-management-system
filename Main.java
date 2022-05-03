package PoisedProject;

import java.util.Scanner;

import PersonDetails.PersonDetails;
import ProjectDetails.ProjectDetail;

public class Main {



	//Method to create a new project
	public static String createNewProject() {

		//Variables for creating a new project
		int projectNumber;
		String projectName;
		String buildingType;
		String physicalAddress;
		int erfNumber;
		int totalFee;
		int totalPaid;
		String projectDeadline;

		// User inputs specific project details 
		System.out.print("Enter the project number: ");
		Scanner input = new Scanner(System.in);
		projectNumber = input.nextInt();

		System.out.print("Enter the project name: ");
		Scanner input1 = new Scanner(System.in);
		projectName = input1.nextLine();

		System.out.print("Enter the type of building: ");
		Scanner input2 = new Scanner(System.in);
		buildingType = input2.nextLine();

		System.out.print("Enter the physical address: ");
		Scanner input3 = new Scanner(System.in);
		physicalAddress = input3.nextLine();

		System.out.print("Enter the erf number: ");
		Scanner input4 = new Scanner(System.in);
		erfNumber = input4.nextInt();

		System.out.print("Enter the total fee being charged: ");
		Scanner input5 = new Scanner(System.in);
		totalFee = input5.nextInt();

		System.out.print("Enter the total amount paid to date: ");
		Scanner input6 = new Scanner(System.in);
		totalPaid = input6.nextInt();

		System.out.print("Enter the deadline for the project: ");
		Scanner input7 = new Scanner(System.in);
		projectDeadline = input7.nextLine();

		ProjectDetail newProject = new ProjectDetail(projectNumber, projectName, buildingType, physicalAddress, erfNumber, totalFee, totalPaid, projectDeadline);

		System.out.println();
		System.out.println(newProject.toString());
		return newProject.toString();

	}

	//Method to create new architect
	public static String createNewArchitect() {
		// Variables for architect
		String name ;
		String surname;
		int telephoneNumber;
		String emailAddress ;
		String physicalAddress;

		System.out.print("Enter the architect's first name: ");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();

		System.out.print("Enter the architect's  surname: ");
		Scanner input1 = new Scanner(System.in);
		surname = input1.nextLine();

		System.out.print("Enter the architect's mobile number: ");
		Scanner input2 = new Scanner(System.in);
		telephoneNumber = input2.nextInt();

		System.out.print("Enter the architect's email address: ");
		Scanner input3 = new Scanner(System.in);
		emailAddress = input3.nextLine();

		System.out.print("Enter the architect's physical address: ");
		Scanner input4 = new Scanner(System.in);
		physicalAddress = input4.nextLine();

		PersonDetails newArchitect = new PersonDetails(name, surname, telephoneNumber, emailAddress, physicalAddress);

		System.out.println();
		System.out.println(newArchitect.toString());
		return newArchitect.toString();

	}

	//Method to create new contractor
	public static String createNewContractor() {
		// Variables for contractor
		String name ;
		String surname;
		int telephoneNumber;
		String emailAddress ;
		String physicalAddress;

		System.out.print("Enter the contractor's first name: ");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();

		System.out.print("Enter the contractor's  surname: ");
		Scanner input1 = new Scanner(System.in);
		surname = input1.nextLine();

		System.out.print("Enter the contractor's mobile number: ");
		Scanner input2 = new Scanner(System.in);
		telephoneNumber = input2.nextInt();

		System.out.print("Enter the contractor's email address: ");
		Scanner input3 = new Scanner(System.in);
		emailAddress = input3.nextLine();

		System.out.print("Enter the contractor's physical address: ");
		Scanner input4 = new Scanner(System.in);
		physicalAddress = input4.nextLine();

		PersonDetails newContractor = new PersonDetails(name, surname, telephoneNumber, emailAddress, physicalAddress);

		System.out.println();
		System.out.println(newContractor.toString());
		return newContractor.toString();
	}

	//Method to create new customer
	public static String createNewCustomer() {
		//Variables for customer
		String name ;
		String surname;
		int telephoneNumber;
		String emailAddress ;
		String physicalAddress;

		System.out.print("Enter the customer's first name: ");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();

		System.out.print("Enter the customer's  surname: ");
		Scanner input1 = new Scanner(System.in);
		surname = input1.nextLine();

		System.out.print("Enter the customer's mobile number: ");
		Scanner input2 = new Scanner(System.in);
		telephoneNumber = input2.nextInt();

		System.out.print("Enter the customer's email address: ");
		Scanner input3 = new Scanner(System.in);
		emailAddress = input3.nextLine();

		System.out.print("Enter the customer's physical address: ");
		Scanner input4 = new Scanner(System.in);
		physicalAddress = input4.nextLine();

		PersonDetails newCustomer = new PersonDetails(name, surname, telephoneNumber, emailAddress, physicalAddress);

		System.out.println();
		System.out.println(newCustomer.toString());
		return newCustomer.toString();
	}

	//Method to change due date of the project
	public static String changeDueDate() {
		System.out.print("Enter the new due date: ");
		Scanner input = new Scanner(System.in);
		String newDeadline = input.nextLine();

		System.out.println("You have successfully updated the project deadline.");
		return newDeadline;
	}

	//Method to change the total amount of the fee paid
	public static int changeTotalAmount() {
		System.out.print("Enter the new total amount of the fee paid to date: ");
		Scanner input = new Scanner(System.in);
		int newTotalfee = input.nextInt();

		System.out.println("You have successfully updated the total fee paid to date.");
		return newTotalfee;
	}

	//Method to update the contractor's contact details
	public static int updateContractorDetails() {
		System.out.print("Enter the contractor's first name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();

		System.out.print("Enter the contractor's  surname: ");
		Scanner input1 = new Scanner(System.in);
		String surname = input1.nextLine();

		System.out.print("Enter the contractor's updated contact details: ");
		Scanner input3 = new Scanner(System.in);
		int newContact = input3.nextInt();

		System.out.println("You have succesfully updated the contractor's contact details.");
		return newContact;
	}


	public static void main(String[] args) {

		//Menu options that user selects 
		try {
			while(true) {
				String menuChoice;
				Scanner input = new Scanner(System.in);

				System.out.println();
				System.out.println("Please choose one of the menu options below: ");
				System.out.println("1 - Create a new project");
				System.out.println("2 - Enter the details of the architect");
				System.out.println("3 - Enter the details of the building contractor");
				System.out.println("4 - Enter the details of the customer");
				System.out.println("5 - Change the due date of the project");
				System.out.println("6 - Change the total amount of the fee paid to date");
				System.out.println("7 - Update the contractor's contact details");
				System.out.println("8 - Quit\n");

				menuChoice = input.nextLine();

				// User creates a new project 
				if (menuChoice.equals("1")) {
					createNewProject();
				}

				//User captures the architect's details 
				else if (menuChoice.equals("2")){
					createNewArchitect();
				}

				//User captures the contrator's details 
				else if (menuChoice.equals("3")) {
					createNewContractor();
				}

				//User captures the customer's details 
				else if (menuChoice.equals("4")) {
					createNewCustomer();
				}

				//User changes the project deadline
				else if (menuChoice.equals("5")) {
					changeDueDate();
				}

				//User updates the total amount paid till date
				else if (menuChoice.equals("6")) {
					changeTotalAmount();
				}

				//User updates the contractor's details
				else if (menuChoice.equals("7")) {
					updateContractorDetails();
				}

				//User exits program
				else if(menuChoice.equals("8")) {
					System.out.println("Goodbye!");
					break;
				}

			}			

		}
		catch (Exception e) {
			e.printStackTrace();}
	}


}
